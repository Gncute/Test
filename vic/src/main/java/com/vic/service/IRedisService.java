package com.vic.service;

import java.util.List;

/**
 * 
 * @author gaoning
 * @desc redis service
 */
public interface IRedisService {
	
	public boolean set(String key, String value);
	
	public String get(String key);
	
	public boolean expire(String key,long expire);
	
	public <T> boolean setList(String key ,List<T> list);
	
	public <T> List<T> getList(String key,Class<T> clz);
	
	public long lpush(String key,Object obj);
	
	public long rpush(String key,Object obj);
	
	public String lpop(String key);
	
}