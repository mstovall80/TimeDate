package com.stovall.TimeDate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "TimeDate.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		String pattern = "HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		String time = simpleDateFormat.format(new Date());
		System.out.println(time);
		model.addAttribute("time", time);
		return "Time.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		model.addAttribute("date", date);
		return "Date.jsp";
	}
}
