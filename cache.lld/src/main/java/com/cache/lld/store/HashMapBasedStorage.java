package com.cache.lld.store;

import java.util.HashMap;

import com.cache.lld.exception.NotFoundException;
import com.cache.lld.exception.StorageFullException;

public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value> {

	private HashMap<Key, Value> store;
	private int capacity;

	HashMapBasedStorage() {
		this.capacity = 100;
		store = new HashMap<>();
	}

	HashMapBasedStorage(int capacity) {
		this.capacity = capacity;
		store = new HashMap<>();
	}

	@Override
	public void put(Key key, Value val) throws StorageFullException {
		if (store.size() == capacity) {
			throw new StorageFullException("Storage is full !");
		}
		store.put(key, val);
	}

	@Override
	public Value get(Key key) throws NotFoundException {
		if (store.get(key) == null) {
			throw new NotFoundException("The key does not exist.");
		}
		return store.get(key);
	}

	@Override
	public void remove(Key key) throws NotFoundException {
		if (store.get(key) == null) {
			throw new NotFoundException("The key does not exist.");
		}
		store.remove(key);
	}

	@Override
	public boolean keyExists(Key key) throws NotFoundException {

		if (store.get(key) == null) {
			throw new NotFoundException("The key does not exist.");
		}
		return store.containsKey(key);
	}

}
