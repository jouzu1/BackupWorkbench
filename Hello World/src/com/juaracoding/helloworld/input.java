package com.juaracoding.helloworld;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Angka genap/ganjil???");
		System.out.println("-----------------------------------");
		Scanner scan = new Scanner(System.in);
		int angka = scan.nextInt();
		
		if(angka%2==0) {
			System.out.println("Angka Genap");
		} else {
			System.out.println("Angka Ganjil");
		
	}

}
	}
