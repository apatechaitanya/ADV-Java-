package com.cdac.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {
	public List<Questions> loadQuestionsOnJava(){
		QuestionBank qb = new QuestionBank();
		qb.addnewSubject("Java");
		
		Questions q = new Questions("Number of primitive data types in Java are");
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("6",false));
		ops.add(new Option("7",false));
		ops.add(new Option("8",true));
		ops.add(new Option("9",false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);
		
		q = new Questions("What is the size of float and double in java?");
		ops = new ArrayList<Option>();
		ops.add(new Option("32 and 64",true));
		ops.add(new Option("33 and 44",false));
		ops.add(new Option("33 and 33",false));
		ops.add(new Option("99 and 100",false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);
		
		q = new Questions("Automatic type conversion is possible in which of the possible cases?");
		ops = new ArrayList<Option>();
		ops.add(new Option("Byte to int ",false));
		ops.add(new Option("long to double",false));
		ops.add(new Option("double to long",false));
		ops.add(new Option("int to long",true));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);

	return qb.fetchQuestionsOn("Java");
		
	}
}
