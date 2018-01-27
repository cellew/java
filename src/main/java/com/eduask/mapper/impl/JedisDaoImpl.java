package com.eduask.mapper.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import redis.clients.jedis.Jedis;

import com.eduask.mapper.JedisDao;

@Repository
public class JedisDaoImpl implements JedisDao {
	@Autowired
	private RedisTemplate rt;

	public void set(String key, String value) {
		rt.opsForValue().set(key, value);
	}

	public void hmSet(String key, Map<String, String> hash) {
	}

	public void lPush(String key, String value) {

	}

	public void sAdd(String key, String member) {
	}

	public void zAdd(String key, Double score, String member) {
	}

}
