package com.demos;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class FreemarkerDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		setPort(2222);
		get("/free",(req,res)-> { 
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello Veersh!");

            
            return new ModelAndView(attributes, "hello.html");
        },new FreeMarkerEngine());
	}

}
