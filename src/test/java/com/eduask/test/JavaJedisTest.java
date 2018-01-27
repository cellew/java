package com.eduask.test;

import javax.annotation.Resource;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eduask.mapper.JedisDao;

import redis.clients.jedis.Jedis;

public class JavaJedisTest {

	@Test
	public void javaJedisTest() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		JedisDao dao = context.getBean(JedisDao.class);
		dao.set("testString", "aaa");
	}
}
