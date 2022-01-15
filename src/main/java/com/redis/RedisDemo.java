package com.redis;

import redis.clients.jedis.Jedis;

import java.util.concurrent.TimeUnit;

public class RedisDemo {
    public static void main(String[] args) {
//        Jedis jedis = new Jedis("192.168.10.115",6379);
//        jedis.auth("123456");
//        System.out.println(jedis.ping());
//        jedis.set("name","张三");
//        String name = jedis.get("name");
//        System.out.println(name);
//        jedis.get("");
//        jedis.hget("","");
        method1();

    }

    public static void method1(){
        RedisLock redisLock = new RedisLock();
        new Thread(()->{
//            System.out.println(Thread.currentThread().getName()+"-------------");
            if (redisLock.getRedisLock("lock1","001")){
                System.out.println(Thread.currentThread().getName()+"获取锁成共----------------------");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                redisLock.unRedisLock("lock1");
            }else {
                System.out.println(Thread.currentThread().getName()+"-------------获取锁失败");
            }

            ;

        }, String.valueOf(1)).start();
        new Thread(()->{

            if (redisLock.getRedisLock("lock1","001")){
//                System.out.println(Thread.currentThread().getName()+"-------------");
                System.out.println(Thread.currentThread().getName()+"获取锁成共----------------------");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                redisLock.unRedisLock("lock1");
            }else {
                System.out.println(Thread.currentThread().getName()+"-------------获取锁失败");
            };
        }, String.valueOf(2)).start();
    }
}
