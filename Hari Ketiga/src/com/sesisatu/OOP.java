package com.sesisatu;

import java.util.Scanner;

class Manusia{
	private String nama;
	private int umur;
	private String gender;
	
	public Manusia(String nama, int umur, String gender) {
		this.nama = nama;
		this.umur = umur;
		this.gender = gender;
	}
	
	public void printManusia() {
		System.out.println(nama+" "+umur+" "+gender);
//		System.out.println(umur);
//		System.out.println(gender);
	}
}
public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Instance dulu dari class Manusia
		 * Bikin array dengan variabel tetapi tau jumlah elemen dalam array
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Biodata Orang");
		System.out.println("==================");
		System.out.print("Masukkan jumlah manusia : ");
		int jumlah = scan.nextInt();
		Manusia []manusia = new Manusia[jumlah];
		
		for(int i = 0; i<manusia.length; i++) {
			System.out.print("Masukkan nama : ");
			String nama = scan.next();
			System.out.print("Masukkan umur : ");
			int umur = scan.nextInt();
			System.out.print("Masukkan jenis kelamin : ");
			String gender = scan.next();
			manusia[i] = new Manusia (nama, umur, gender);
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		}
		for(int j = 0 ; j<manusia.length; j++) {
			manusia[j].printManusia();
		}
		/**
		 * [[a,b,c],[d,e,f],[g,h,i]] ==> array multi dimensi
		 */
	}
}


