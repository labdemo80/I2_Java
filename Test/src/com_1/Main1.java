package com_1;

class Calc{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b, int c) {
		System.out.println(a+b+c);
	}
}

public class Main1 {
public static void main(String[] args) {
	Calc c = new Calc();
	c.add(12, 10);
	c.add(120, 12, 10);
}
}
