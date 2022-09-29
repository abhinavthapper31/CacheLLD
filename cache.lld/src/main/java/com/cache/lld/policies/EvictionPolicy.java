package com.cache.lld.policies;

public interface EvictionPolicy<Key> {

	void keyAccessed(Key key);

	Key evict();

}
