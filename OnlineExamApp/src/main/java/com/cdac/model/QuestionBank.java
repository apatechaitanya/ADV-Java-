package com.cdac.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {
	//key-value pair ->(subject name ->key question of that subject)
	private Map<String, List<Questions>> questionBank = new HashMap<>();
//	private List<Questions> questionsOnJava;
//	private List<Questions> questionsOnPython;  <- Limited Approach
//	private List<Questions> questionsOnHTML;
	
	public void addnewSubject(String subject) {
		// TODO Auto-generated method stub
		questionBank.put(subject, new ArrayList<>());
	}
	public void addNewQuestion(String subject,Questions question) {
		List<Questions> questions = questionBank.get(subject);
		questions.add(question);
	}
	public List<Questions> fetchQuestionsOn(String subject){
		return questionBank.get(subject);
	}
	
}
