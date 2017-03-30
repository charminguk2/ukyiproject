package com.ukyi.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ukyi.domain.ProductVO;

@Controller
public class SampleController5 {
	
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
		ProductVO vo = new ProductVO("»ùÇÃ»óÇ°", 30000);
		return vo;
	}
}
