package com.cache.lld;

import com.cache.lld.policies.EvictionPolicy;
import com.cache.lld.store.Storage;

public class Cache<Key, Value> {

	private Storage<Key, Value> storage;
	private EvictionPolicy<Key> evictionPolicy;

}
