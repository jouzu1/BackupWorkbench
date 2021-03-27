package com.latihan_sesi_satu;

import java.util.Scanner;

public class ProgramKB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Program KB");
		System.out.println("=====================");
		System.out.println("");
		System.out.print("Masukkan Jumlah Anak : ");
		int angka = scan.nextInt();
		
		if(angka>1) {
			System.out.print("Apakah anda sudah mengikuti program KB (Y/T)? : ");
			String jawaban = scan.next().toUpperCase();
			
			if(jawaban.equalsIgnoreCase("Y")) {
				System.out.println("Silahkan kontrol ke PUSKESMAS terdekat");
			}else {
				System.out.println("Daftarkan pasangan anda ke Program KB");
			}
		}else {
			System.out.println("Tidak perlu daftar Program KB");
		}
	}

}
