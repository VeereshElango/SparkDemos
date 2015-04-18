package com.demos;

import static spark.Spark.*;

public class HtmlDemo {
	public static void main(String[] args) {
		setPort(1111);
		get("/html", (req, res) -> {
			return "<html><body><h1>This is HTML header</h1></body> </html> ";
		});
	}

}
