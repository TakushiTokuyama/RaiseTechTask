package com.example.demo.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Menu {

	@NotNull //空文字
	private int id;

	private int userId;

	@NotNull
	@Size(min = 1, max = 20)
	String name;

	@NotNull
	@Size(min = 1, max = 50)
	String menu;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void SetUserId(int userId) {
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

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getMenu() {
		return menu;
	}

}
