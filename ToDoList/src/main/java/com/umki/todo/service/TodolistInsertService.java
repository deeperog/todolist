package com.umki.todo.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umki.todo.dao.TodolistDao;
import com.umki.todo.model.TodolistVO;

@Service
public class TodolistInsertService {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	TodolistDao dao;
	TodolistVO VO;

	public TodolistVO getInfo() {
		
		dao = sqlSessionTemplate.getMapper(TodolistDao.class);
		
		try {
			VO = dao.getInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return VO;
	}

}
