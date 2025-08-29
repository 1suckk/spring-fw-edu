package edu.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.example.springedu.domain.QueryDTO;
import edu.example.springedu.domain.StepVO;
@Controller
@RequestMapping("/querystring3")
public class QueryStringController3 {	
	
	@RequestMapping("/case1")
	public String case1(String gname, int gnum, @RequestParam("gaddr") String addr, Model model) {
		model.addAttribute("guestInfo", gname+":"+gnum+":"+addr);
		System.out.println(gname+":"+gnum+":"+addr);
		return "queryView3";
	}	
	
	@RequestMapping("/case2")
	public String case2(QueryDTO dto) {	
		return "queryView3";
	}	
	
	@RequestMapping("/case3")
	public String case3(@ModelAttribute("abc") StepVO dto) {	
		return "queryView3";
	}	
}






