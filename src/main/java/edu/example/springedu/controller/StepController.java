package edu.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.example.springedu.domain.StepVO;

@Controller
public class StepController {		
	@PostMapping("/step")
	public String memberHandle(@ModelAttribute("kkk") StepVO vo) {
		if(vo.getAge() < 18) {
			System.out.println("[ REDIRECT ]");
			//return "redirect:/resources/stepForm.html";
			return "redirect:/https://www.naver.com";
		}
		System.out.println("[ 전달된 Command 객체의 정보 ]");
		System.out.println(vo.getName());
		System.out.println(vo.getPhoneNumber());
		System.out.println(vo.getAge());
		
		return  "stepOutput";
	}
}
