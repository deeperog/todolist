package com.umki.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.umki.todo.model.TodolistVO;
import com.umki.todo.service.TodolistInsertService;

@Controller
public class TodolistInsertController {
	
	@Autowired
	TodolistInsertService service;
	TodolistVO VO;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView modelAndView = new ModelAndView();
		VO = service.getInfo();
		System.out.println(VO);
		modelAndView.addObject("VO", VO);
		
		return modelAndView;
	}
	

}