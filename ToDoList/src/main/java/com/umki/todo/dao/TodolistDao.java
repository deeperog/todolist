package com.umki.todo.dao;

import java.util.List;

import com.umki.todo.model.TodolistVO;

public interface TodolistDao {

	public List<TodolistVO> getInfo() throws Exception;

	public int insertInfo(String content) throws Exception;


}
