package com.cn.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {

	@RequestMapping(value="createAchat")
	public String createAchat(){
		return "chat";
	}
}
