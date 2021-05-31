package com.codingDojo.lHuertas.counter;

import javax.servlet.http.HttpSession;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webController {
@RequestMapping("/mySite/")
	public String index(HttpSession session, Model model) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}
		if(session.getAttribute("count")!=null){
			Integer currentcount = (Integer) session.getAttribute("count");
			currentcount++;
			session.setAttribute("count", currentcount);
		}
		model.addAttribute("count",session.getAttribute("count"));
		return "index.jsp";
	}
@RequestMapping("/reset")
	public String reset(HttpSession session, Model model) {
	session.setAttribute("count", -1);
	return "redirect:/mySite/";
}
}