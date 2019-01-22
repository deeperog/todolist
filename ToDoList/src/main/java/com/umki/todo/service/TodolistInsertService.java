package com.umki.todo.service;

import java.util.List;

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
	List<TodolistVO> VO;
	Integer check = 0;

	public List<TodolistVO> getInfo() {

		dao = sqlSessionTemplate.getMapper(TodolistDao.class);

		try {
			VO = dao.getInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return VO;
	}

	public List<TodolistVO> insertInfo(String content) {
		dao = sqlSessionTemplate.getMapper(TodolistDao.class);

		try {
			check = dao.insertInfo(content);
			
			if (check == 1) {
				VO = dao.getInfo();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return VO;
	}

}
