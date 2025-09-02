package edu.example.springedu.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.example.springedu.dao.EmpDAO;
import edu.example.springedu.domain.EmpDTO;
import edu.example.springedu.domain.PageDTO;



@Controller
public class EmpController {
	@Autowired
	EmpDAO dao;
	
	@GetMapping("/count")
	public ModelAndView p1() {
		ModelAndView mav = new ModelAndView();
		int num = dao.getAllDataNum();
		mav.addObject("num", num);
		mav.setViewName("empResult");
		return mav;
	}
	
	@GetMapping("/listall")
	public ModelAndView p2() {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.listAll();
		mav.addObject("list", list);
		mav.setViewName("empResult");
		return mav;
	}
		
	@GetMapping("/findno")
	public ModelAndView p3(int no) {
		ModelAndView mav = new ModelAndView();
		EmpDTO dto = dao.findByNo(no);
		if (dto == null)
   			mav.addObject("msg", "사번이 "+no+"인 직원은 없어요~~");
		else
			mav.addObject("dto", dto);
		mav.setViewName("empResult");
		return mav;
	}
	
	
	@GetMapping("/findname")
	public ModelAndView p4(String name) {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.findByName(name);
		if (list.size() == 0)
   			mav.addObject("msg", "성명이 "+name+"인 직원은 없어요~~");
		else
			mav.addObject("list", list);
		mav.setViewName("empResult");
		return mav;
	}
	
	@GetMapping("/findnojob")
	public ModelAndView p5(int no, String job) {
		ModelAndView mav = new ModelAndView();
		HashMap<String, Object> map = new HashMap<>();
		map.put("no",  no);
		map.put("job", job);
		EmpDTO dto = dao.findByNumAndJob(map);
		if (dto == null)
   			mav.addObject("msg", "사번이 "+no+"이고 직무가 " +job +"인 직원은 없어요~~");
		else
			mav.addObject("dto", dto);
		mav.addObject("dto", dto);
		mav.setViewName("empResult");
		return mav;
	}
	
	@GetMapping("/listorderbysalasc")
	public ModelAndView p6() {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.listAllOrderBySalAsc();
		mav.addObject("list", list);
		mav.setViewName("empResult");
		return mav;
	}
	
	@GetMapping("/listorderbysaldesc")
	public ModelAndView p7() {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.listAllOrderBySalDesc();
		mav.addObject("list", list);
		mav.setViewName("empResult");
		return mav;
	}
	
	@GetMapping("/listnamestart")
	public ModelAndView p7(String key) {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.findByNameStart(key);
		if (list.size() == 0)
   			mav.addObject("msg", "성명이 "+key+"로 시작하는 직원은 없어요~~");
		else
			mav.addObject("list", list);
		mav.setViewName("empResult");
		return mav;
	}
	
	
	@GetMapping("/part")
	public ModelAndView part(PageDTO dto) {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.listPart(dto);
		mav.addObject("list", list);
		mav.setViewName("empResult");
		return mav;
	}
	

}
