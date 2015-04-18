package com.moviebooking;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class Controller {
	public Controller() {
		staticFileLocation("public");
		get("/login", (req, res) -> {
			return new ModelAndView(null, "/moviebooking/login.ftl");
		}, new FreeMarkerEngine());
		
		post("/index", (req, res) -> {
			req.session().attribute("username", req.queryParams("username"));
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("username", req.queryParams("username"));
			return new ModelAndView(attributes, "/moviebooking/index.ftl");
		}, new FreeMarkerEngine());
		
		get("/index", (req, res) -> {			
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("username", req.session().attribute("username"));
			return new ModelAndView(attributes, "/moviebooking/index.ftl");
		}, new FreeMarkerEngine());
		
		get("/moviebooking", (req, res) -> {
			//System.out.println(req.queryParams("name"));
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("username", req.session().attribute("username"));
			attributes.put("filename",req.queryParams("name") );
			attributes.put("content", Content.valueOf(req.queryParams("name")).getContent());
			return new ModelAndView(attributes, "/moviebooking/moviebooking.ftl");
		}, new FreeMarkerEngine());
		
		get("/success", (req, res) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("username", req.session().attribute("username"));
			return new ModelAndView(attributes, "/moviebooking/success.ftl");
		}, new FreeMarkerEngine());
		
		get("/logout", (req, res) -> {
			req.session().removeAttribute("username");
			return new ModelAndView(null, "/moviebooking/login.ftl");
		}, new FreeMarkerEngine());
	}
	
	public static void main(String[] args) {
		new Controller();
	}
}
