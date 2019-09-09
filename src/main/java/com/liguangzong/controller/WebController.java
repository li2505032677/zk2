package com.liguangzong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liguangzong.utils.StringUtils;

@Controller
public class WebController {
		
	
	@RequestMapping("toadd.do")
	public String toadd(){
		return "add";
		
		
		
	}
	@RequestMapping("add.do")
	@ResponseBody
	public Object add(String text){
		String html = StringUtils.toHtml(text);
		System.out.println(html);
		if (html.length()>0) {
			return 1;
		}
		return 0;
	}
}
