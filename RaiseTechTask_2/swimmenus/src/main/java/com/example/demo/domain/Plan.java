package com.example.demo.domain;

public class Plan {

	Plan[] planDay = new Plan[42];

	public void setPlanDay(int number , Plan plan) {this.planDay[number] = plan;}

	public Plan getPlanDay(int number) {return planDay[number];}


}
