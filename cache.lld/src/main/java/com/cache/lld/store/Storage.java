package com.cache.lld.store;

import com.cache.lld.exception.NotFoundException;
import com.cache.lld.exception.StorageFullException;

public interface Storage<Key, Value> {

	void put(Key key, Value val) throws StorageFullException;

	Value get(Key key) throws NotFoundException;

	void remove(Key key) throws NotFoundException;

	boolean keyExists(Key key) throws NotFoundException;

}
