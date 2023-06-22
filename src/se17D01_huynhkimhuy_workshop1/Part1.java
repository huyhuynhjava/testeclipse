package se17D01_huynhkimhuy_workshop1;

import java.util.Scanner;
public class Part1 {
	public static void input(int a[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i< a.length; i++ ) {
			for(int j =0; j<a[i].length;j++) {
				System.out.println("a["+i+"]"+"["+j+"]");
				a[i][j] = sc.nextInt();
			}
		}
	}
	public static void output(int[][] a) {
		for(int i = 0;i< a.length; i++ ) {
			for(int j =0; j<a[i].length;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
	public static int sum(int[][] a) {
		int result=0;
		for(int i = 0;i< a.length; i++ ) {
			for(int j =0; j<a[i].length;j++) {
					result+=a[i][j];
			}
			
		}
		return result;
	}
	public static double average(int[][] a) {
		return (double)sum(a)/(a.length*a[0].length);
	}
	public static void main(String[] args) {
		int a[][];
		int rows, colums;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		rows = sc.nextInt();
		System.out.println("enter colum");
		colums = sc.nextInt();
		a = new int[rows][colums];
		System.out.println("enter the matrix");
		input(a);
		output(a);
		System.out.println(sum(a));
		System.out.println(average(a));
	}

}
