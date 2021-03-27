package com.tugas;

import java.util.Scanner;

public class BilanganPrima {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uji_prima = 0;
		System.out.println("Tugas Bilangan Prima");
		
		System.out.println("===============================================");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan Angkanya : ");
		
		int angka = scan.nextInt();
		int uji_nyali = 0;

//			if(angka == 1) 
//			{
//				System.out.println("--> "+angka + " Bukanlah Angka Prima");
//			}else if (angka == 2) 
//			{
//				System.out.println("--> "+angka + " Merupakan Angka Prima");
//			}
//			else if(angka % 2 == 0) 
//			{
//				System.out.println("--> "+angka + " Bukanlah Angka Prima");
//			}
//			else if (angka % 2 == 1 || angka == 2)
//			{
//				System.out.println("--> "+angka + " Merupakan Angka Prima");
//			}
		
		
//Logic di bawah ini digunakan untuk mengiterasi semua angka dimulai dari inisialisasi sampai dengan angka tertentu yang telah input.
		for(int i = 2; i<=angka ; i++) {
			if (angka%i == 0) {
				uji_nyali++;
			}
		}
		if(uji_nyali == 1) {
			System.out.println(angka + " bilangan prima");
		}else {
			System.out.println(angka + " bukan bilangan prima");
		}
	}
}
