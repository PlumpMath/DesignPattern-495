package com.bjy.designpattern.adaperpattern;

public class Adapter2 implements Target{
	private Adaptee adaptee;
	public Adapter2() {
		// TODO Auto-generated constructor stub
	}
	public Adapter2(Adaptee adaptee){
		this.adaptee=adaptee;
	}
	public void request() {
		adaptee.simpleRequest();
		System.out.println("适配Adaptee类");
	}
}
