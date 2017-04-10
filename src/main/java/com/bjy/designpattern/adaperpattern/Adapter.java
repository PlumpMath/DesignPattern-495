package com.bjy.designpattern.adaperpattern;

public class Adapter extends Adaptee implements Target{
	
	public void request() {
		super.simpleRequest();
		System.out.println("适配Adaptee类");
	}
}
