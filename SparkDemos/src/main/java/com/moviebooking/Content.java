package com.moviebooking;

public enum Content {
	is("In Earth's future, a global crop blight and second Dust Bowl are slowly rendering the planet uninhabitable. Professor Brand (Michael Caine), a brilliant NASA physicist, is working on plans to save mankind by transporting Earth's population to a new home via a wormhole. But first, Brand must send former NASA pilot Cooper (Matthew McConaughey) and a team of researchers through the wormhole and across the galaxy to find out which of three planets could be mankind's new home."), 
	ran("When his estranged son (Joel Kinnaman) becomes a mob target, an aging hit man (Liam Neeson) must figure out where his loyalties lie and how to save his offspring from a deadly fate"), 
	fug("The fun-filled and carefree life of four college friends comes to an abrupt end when they cross paths with a corrupt police officer."), 
	eov("Enakkul Oruvan is an Tamil psychological thriller film directed by debutant Prasad Ramar and produced by C. V. Kumar, which is a remake of the 2013 Kannada film Lucia by Pawan Kumar.");
 
	private String statusCode;
 
	private Content(String s) {
		statusCode = s;
	}
 
	public String getContent() {
		return statusCode;
	}
	
//	public static void main(String[] args) {
//		System.out.println( Content.valueOf("is").getContent() );
//	}
 
}
