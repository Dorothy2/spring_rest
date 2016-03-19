package com.websystique.springmvc.controller;
 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bestride.platform.log.LoggingUtils;
import com.websystique.springmvc.domain.Message;
 
@RestController
public class HelloWorldRestController {
 
    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {
 
        Message msg = new Message(player, "Hello " + player);
        return msg;
    }
    
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String ping() {
		LoggingUtils.logInfo("Validation Controller pinged successfully...");
		return "Ping Successful";
	}
 
}
