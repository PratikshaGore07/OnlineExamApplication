package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.QuestionDAO;
import com.tka.entity.Question;


@Service
public class QuestionService 
{
	@Autowired
	QuestionDAO dao;
	
	public List<Question> getAllQuestions(String subject)
	{
			return dao.getAllQuestions(subject);
	}
	
}