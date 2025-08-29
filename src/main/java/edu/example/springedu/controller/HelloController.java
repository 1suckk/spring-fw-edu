package edu.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String hello(Model model, int num) {
		System.out.println("JSP 에게 데이터를 전달해요.");
		
		model.addAttribute("result", num*num);
		return "hello";
	}
}