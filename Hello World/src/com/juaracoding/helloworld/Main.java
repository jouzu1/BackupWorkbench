package com.juaracoding.helloworld;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	nilai = 1;
		String nilai2 = "2";
		String nilai3 = "3";
		String nilai4 = "3.0";
		double nilai5 = 5;
		
//		System.out.println((int)(nilai + Integer.parseInt(nilai2)+Integer.parseInt(nilai3)+Float.parseFloat(nilai4)+nilai5));
		
		System.out.println("Angka genap/ganjil???");
		System.out.println("-----------------------------------");
		Scanner scan = new Scanner(System.in);
		int angka = scan.nextInt();
		String cmd = scan.next();
		
			if(angka%2==0) {
				System.out.println("Angka Genap");
			} else {
				System.out.println("Angka Ganjil");
			}
			System.out.println("Apakah ingin input lagi?" );
	}

}
