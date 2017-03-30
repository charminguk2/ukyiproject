package com.ukyi.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {
		logger.info("doE페이지->doF페이지로 리다이렉트");
		rttr.addFlashAttribute("msg", "리다이렉트!!");
		return "redirect:/doF";
	}
	
	@RequestMapping("/doF")
	public String doF(String msg) {
		logger.info("doF페이지"+msg);
		
		return "result";
	}
}
