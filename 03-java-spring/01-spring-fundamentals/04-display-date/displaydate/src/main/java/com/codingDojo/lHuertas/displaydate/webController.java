package com.codingDojo.lHuertas.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webController{
@RequestMapping("/")
	public String Index(Model model) {
	Date todaysDate = new Date();
	model.addAttribute("thisMoment",todaysDate);
	return "index.jsp";
	}
	@RequestMapping("/{timevar}")
	public String dateTime(@PathVariable("timevar") String timevar, Model model) {
		if(!timevar.equals("date") && !timevar.equals("time"))
				return "redirect:/";
		SimpleDateFormat dm = (timevar.equals("date"))
				? new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY")
				: new SimpleDateFormat("h:mm a");
			model.addAttribute("timevarFormat", dm.format(new java.util.Date()));
			model.addAttribute("timevar", timevar);
	return "datetime.jsp";
	}
}