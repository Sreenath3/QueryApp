package com.cg.ABCCorp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="query_master")

public class QueryMaster {
	
	@Id
	private Integer id;
	private String technology;
	private String question;
	private String question_raised_by;
	private String solution;
	private String answered_by;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestion_raised_by() {
		return question_raised_by;
	}
	public void setQuestion_raised_by(String question_raised_by) {
		this.question_raised_by = question_raised_by;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String getAnswered_by() {
		return answered_by;
	}
	public void setAnswered_by(String answered_by) {
		this.answered_by = answered_by;
	}
	@Override
	public String toString() {
		return "QueryMaster [id=" + id + ", technology=" + technology + ", question=" + question
				+ ", question_raised_by=" + question_raised_by + ", solution=" + solution + ", answered_by="
				+ answered_by + "]";
	}
	
	
	
	

}
