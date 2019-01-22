package com.umki.todo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.umki.todo.model.TodolistVO;
import com.umki.todo.service.TodolistInsertService;

@Controller
public class TodolistInsertController {
	
	@Autowired
	TodolistInsertService getService;
	List<TodolistVO> VO;
	int check = 0;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView modelAndView = new ModelAndView();
		VO = getService.getInfo();
		modelAndView.addObject("VO", VO);
		modelAndView.setViewName("test");
		
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST, produces="application/text; charset=utf8")
	@ResponseBody
	public ModelAndView write(@RequestParam("content") String content) {
		ModelAndView modelAndView = new ModelAndView();
		VO = getService.insertInfo(content);
		
		modelAndView.addObject("VO", VO);
//		modelAndView.setViewName("test");
		return modelAndView;
	}
}