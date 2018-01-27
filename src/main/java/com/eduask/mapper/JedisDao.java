package com.eduask.mapper;

import java.util.Map;

/**
 * Redis Dao
 * @author Goblin
 *
 */
public interface JedisDao {
	/* String类型录入 */
	void set(String key, String value);

	/* Hash类型录入,单个 */
	void hmSet(String key, Map<String,String> hash);

	/* List类型录入 */
	void lPush(String key, String value);

	/* Set类型录入 */
	void sAdd(String key, String member);

	/* sorted set类型录入 */
	void zAdd(String key, Double score, String member);
}
