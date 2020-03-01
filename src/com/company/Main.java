package com.company;

public class Main {




    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
        System.out.println("Bonjour le monde");
	System.out.println("Bonjour")
        System.out.println(functionCalculs());
        System.out.print(functionCalculsExp(6));
    }
    public static int functionCalculs() {
        return 2;
    }
    public static int functionCalculsExp(double n) {
        return (int) ((Math.exp(n) * n) + (n * n * Math.getExponent(n)));
    }
