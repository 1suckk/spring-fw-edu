package edu.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String index() {
		System.out.println("HomeController: 홈 페이지 요청이 처리되었습니다.");
		return "home";
	}
}