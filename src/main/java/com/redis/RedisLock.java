package com.redis;

import redis.clients.jedis.Jedis;

public class RedisLock {
    private long acquireTimeOut = 5000;//获取锁之前的超时时间（获取锁的等待重试时间）
    private int timeOut = 10000;    //获取锁之后的超时时间（防止死锁）


    /**
     * 获取分布式锁
     * @param lockName 锁key
     * @param val      锁值
     * @return
     */
    public boolean getRedisLock(String lockName, String val){

        try{
            Jedis jedis =
                    RedisCongfig.getJedis();
            //1.计算获取锁的时间
            long endtime = System.currentTimeMillis()+acquireTimeOut;
            //2.尝试获取锁
            while (System.currentTimeMillis()<endtime){
                //3.获取成功就设置过期时间
                if(jedis.setnx(lockName,val)==1){
                    jedis.expire(val,timeOut/1000);
                    return true;
                }
            }
        }catch (Exception e){
            return false;
        }
        return false;
    }

    /**
     * 释放分布式锁
     * @param lockName
     */
    public void unRedisLock(String lockName){
        try {
            Jedis jedis = RedisCongfig.getJedis();
            jedis.del(lockName);
        }catch (Exception e){

        }finally {
            return;
        }
    }

    public void closeConnection(Jedis jedis){
        if (jedis!=null) jedis.close();
    }

}