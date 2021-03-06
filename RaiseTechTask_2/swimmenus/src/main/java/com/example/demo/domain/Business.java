package com.example.demo.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Business {

	int id;
	int userId;

	@NotEmpty(message = "空白は不可")
	@Size(min = 1, max = 20,message = "1-20文字")
	String name;
	@NotEmpty(message = "空白は不可")
	String manageDay;
	@NotEmpty(message = "空白は不可")
	String startTime;
	@NotEmpty(message = "空白は不可")
	String endTime;
	@NotEmpty(message = "空白は不可")
	String title;

	@Size(min = 0, max = 200,message = "1-200文字")
	String content;

	public void setId(Integer id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setManageDay(String manageDay) {
		this.manageDay = manageDay;
	}

	public String getManageDay() {
		return manageDay;
	}

	public void setStartTime(String startTime) {this.startTime = startTime;}

	public String getStartTime() {return startTime;}

	public void setEndTime(String endTime) {this.endTime = endTime;}

	public String getEndTime() {return endTime;}


	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
