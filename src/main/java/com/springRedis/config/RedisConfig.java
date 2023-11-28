package com.springRedis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
		configuration.setHostName("127.0.0.1");
		configuration.setPort(6379);
		//configuration.setPassword(password);
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		return jedisConnectionFactory;
	}
	@Bean
	public RedisTemplate<String, Object> redisTemplate(){
		RedisTemplate<String, Object> redisTemplete = new RedisTemplate<>();
		redisTemplete.setConnectionFactory(jedisConnectionFactory());
		redisTemplete.setKeySerializer(new StringRedisSerializer());
		redisTemplete.setHashKeySerializer(new StringRedisSerializer());
		redisTemplete.setHashKeySerializer(new JdkSerializationRedisSerializer());
		redisTemplete.setValueSerializer(new JdkSerializationRedisSerializer());
		redisTemplete.setEnableTransactionSupport(true);
		return redisTemplete;
	}

}
