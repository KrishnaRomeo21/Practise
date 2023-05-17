package org.variabletypes;

public class ExampleVariables {
	int a;
	boolean b;
	char c;
	short d;
	byte e;
	long f;
	float g;
	double h;
	String s;
	public void sub(){
		int i = 10;
		int j = 11;
		int k = (i-j);
		System.out.println(k);
	}
	public static void main(String [] args){
		ExampleVariables ev = new ExampleVariables();
		System.out.println(ev.a);
		System.out.println(ev.b);
		System.out.println(ev.c);
		System.out.println(ev.d);
		System.out.println(ev.e);
		System.out.println(ev.f);
		System.out.println(ev.g);
		System.out.println(ev.h);
		System.out.println(ev.s);
		ev.sub();
	}
}
