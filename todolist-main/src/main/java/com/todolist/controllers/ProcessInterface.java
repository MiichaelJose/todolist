package com.todolist.controllers;

import java.util.List;

public interface ProcessInterface<T> {
	public T find(int id);

	public List<T> findAll(int id);

	public T create(T u);

	public T update(T u);

	public void delete(int id);
}
