package se17D01_huynhkimhuy_workshop1;

import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		String[] list = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		for(int i=0; i<list.length;i++) {
			list[i] = sc.nextLine();
		}
		for(int i=0; i<list.length;i++) {
			System.out.println(list[i].toUpperCase());
		}
		

	}

}
