package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

	public int maltiplication(int x,int y) {
		return x * y;
	}

	public float division(int x,int y) {
		return (float)x / (float)y;
	}

}
