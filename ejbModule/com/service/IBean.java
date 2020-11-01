package com.service;

import java.util.List;

public interface IBean<T> {
	
	void create(T o);
	T read(Long id);
	List<T> readAll();
	void update(T o);
	void delete(Long id);

}
