package com.crud.demo;

import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class Controller {
	UserService userService = new UserService();

	public Controller() {
		get("/login", (req, res) -> {
			return new ModelAndView(null, "login.ftl");
		}, new FreeMarkerEngine());

		get("/home", (req, res) -> {
			System.out.println(">>>" + req.url());
			System.out.println(">>" + req.queryParams("username"));
			return new ModelAndView(null, "home.ftl");
		}, new FreeMarkerEngine());
		get("/adduser", (req, res) -> {
			return new ModelAndView(null, "adduser.ftl");
		}, new FreeMarkerEngine());
		get("/userdetails", (req, res) -> {
			System.out.println(">>" + req.queryParams("username"));
			boolean f = userService.addUser(req.queryParams("username").toString());
			//System.out.println(f);
			res.redirect("/home");
			return "";
		});
		get("/getallusers", (req, res) -> {
			return userService.getUsers();
		});
	}

	public static void main(String[] args) {
		setPort(9090);
		new Controller();
	}
}
