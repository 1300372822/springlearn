package com.redis;

import redis.clients.jedis.Jedis;

public class RedisCongfig {

    public static Jedis getJedis(){
        Jedis jedis = new Jedis("192.168.10.115",6379);
        jedis.auth("123456");
        return jedis;
    }
}
