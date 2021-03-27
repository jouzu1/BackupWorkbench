package com.latihan_sesi_satu;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Program untuk menentukan klasifikasi jenis hewan");
		System.out.println("=================================================");
		System.out.print("Masukkan jenis hewan : ");
		String hewan = scan.next().toLowerCase();
		String cap = hewan.substring(0, 1).toUpperCase() + hewan.substring(1);
		
		
		
		switch (hewan) {
		case "kelinci":
		case "kucing":
		case "tikus":
			System.out.println( cap + " Merupakan Hewan Mamalia");
			break;
			
		case "katak":
		case "kadal":
		case "buaya":
			System.out.println( cap + " Merupakan Hewan Reptil");
			break;
		default:
			System.out.println("Nama Hewan yang diinput tidak dikteahui klasifikasinya");
		}
	}

}
