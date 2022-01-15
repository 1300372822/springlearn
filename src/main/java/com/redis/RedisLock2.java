package com.redis;

import redis.clients.jedis.Jedis;

public class RedisLock2 {

    private static final String LOCK_SUCCESS = "OK";

    private static final Long RELEASE_SUCCESS = 1l;

    /**
     *尝试获取分布式锁
     * @param jedis   客户端
     * @param lockKey  锁
     * @param requestId 请求标识
     * @param expireTime key值过期时间
     * @return
     */
    public static boolean tryGetDistributedLock(Jedis jedis,String lockKey,
                                                String requestId,int expireTime){
        String result = jedis.set(lockKey,requestId,"NX","PX",expireTime);
        //NX表示 只有键值不存在时才进行设置操作，PX  毫秒
        if (LOCK_SUCCESS.equals(result)){
            return true;
        }
        return false;
    }

    /**
     *
     * @param jedis
     * @param lockKey  锁
     * @param requestId 请求标识
     * @return
     */
    public static boolean releaseDistributedLock(Jedis jedis,String lockKey,String requestId){
        if (jedis.get(lockKey).equals(requestId)){
            System.out.println("释放锁。。。。"+Thread.currentThread().getName()+".identifierValue:"+requestId);
            jedis.del(lockKey);
            return true;
        }
        return false;
    }
}
