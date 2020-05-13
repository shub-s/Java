package com.company;

public class Main {
    public static void main(String[] args) {
	    int x,y;
	    x = 10;
	    y = 20;

	    if(x < y)   System.out.println("X is less than Y");

	    x = x * 2;
	    if(x == y)   System.out.println("X is Equal to Y");

	    x = x * 2;
	    if(x > y)   System.out.println("X is greater than Y");

	    //This Wont Execute
	    if(x == y)  System.out.println("You Wont see this");
    }
}
