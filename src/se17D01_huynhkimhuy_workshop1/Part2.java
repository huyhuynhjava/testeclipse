package se17D01_huynhkimhuy_workshop1;

import java.util.Scanner;

public class Part2 {
	public static void main(String[] args) {
		double num1, num2;
		String op;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1:");
		num1 = sc.nextDouble();
		System.out.println("enter number 2:");
		num2 = sc.nextDouble();
		op = sc.next();
		if(op.equals("+")) {
			System.out.println(num1 + num2);
		}
		else if(op.equals("-")) {
			System.out.println(num1 - num2);
		}
		else if(op.equals("*")) {
			System.out.println(num1 * num2);
		}
		else if(op.equals("/")) {
			System.out.println(num1 / num2);
		}
		
	}
}
