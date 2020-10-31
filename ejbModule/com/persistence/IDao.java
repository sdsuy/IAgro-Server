package com.persistence;

import java.util.List;

public interface IDao<T> {
	
	void create(T o);
	T read(Long id);
	List<T> readAll();
	void update(T o);
	void delete(Long id);

}
