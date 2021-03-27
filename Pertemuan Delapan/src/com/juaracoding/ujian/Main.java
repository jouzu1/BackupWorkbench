package com.juaracoding.ujian;

import java.util.Scanner;

public class Main {
	 
	 
	 public static void main(String[] args) {
	 
	 Pinjaman rent = new Pinjaman();
	 Scanner sn= new Scanner(System.in);
	 
	 System.out.print("Masukan Besar Pinjaman : ");
	 rent.setPinjam(sn.nextLong());
	 System.out.print("Masukan Besar Bunga    : ");
	 rent.setBunga(sn.nextInt());
	 System.out.print("Masukan Banyak Angsuran: ");
	 rent.setKali(sn.nextInt());
	 
	 rent.PrintScr();
	 
	 }
	 
	}
