package com.demos;

import static spark.Spark.*;

public class HelloWorldDemo {
	
	public static void main(String[] args) {		

		get("/hello", (req, res) -> "Hello World");		

	}
}
