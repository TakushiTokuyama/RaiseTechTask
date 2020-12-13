package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {


	@GetMapping("/business/calc")
	public String clac() {
		return "/business/calc";
	}

	@PostMapping("/business/calc")
	public ModelAndView calc(@RequestParam(value = "year", required = false) int year,
			@RequestParam(value = "month", required = false) int month,
			@RequestParam(value = "day" , required = false) int day,
			ModelAndView mav) {

		int lastDay = LocalDate.of(year, month, day).lengthOfMonth();

		mav.addObject("lastDay", lastDay);
		mav.addObject("lastYear", year);
		mav.addObject("lastMonth", month);
		mav.setViewName("/business/calc");

		return mav;
	}

}

/* 後何日かを調べる
LocalDate from = LocalDate.of(year, month, 1);
LocalDate to = LocalDate.of(2019, 10, 31);

long lastDay = ChronoUnit.DAYS.between(from, to);

mav.addObject("lastDay", lastDay);
mav.setViewName("/business/calc");
*/