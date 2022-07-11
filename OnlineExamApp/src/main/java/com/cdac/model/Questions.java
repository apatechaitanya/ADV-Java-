package com.cdac.model;

import java.util.List;

public class Questions {
	private String question;
	private List<Option>options;
	public Questions() {
		// TODO Auto-generated constructor stub
	}
	public Questions(String question) {
		super();
		this.question = question;
//		this.options = options;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
}
