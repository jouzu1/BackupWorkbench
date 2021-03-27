package com.sesisatu;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			
////////////////////////////////////////////////////////////////////////////////////////////			
			/**
			 * Aturan untuk membaca suatu data harus mengiterasi suatu array
			 */
			
			
			
			/**
			 * Membuat array 
			 * Setiap input akan menjai elemen yang akan tersimpan di dalam suatu array
			 * Menggunakan for loop untuk input elemen baru
			 */
		/*System.out.print("Masukkan panjang array : ");
		int panjang = input.nextInt();
		int []nilai = new int [panjang];
		System.out.println("Masukkan angka");
		for(int i = 0; i<panjang; i++) {
			int a=i+1;
			System.out.print("Index ke "+a+" adalah : ");
			nilai[i]=input.nextInt();
		}
		
		
		
		for(int x = 0; x<nilai.length; x++) {
			System.out.print(nilai[x] + " ");
		}*/
		
////////////////////////////////////////////////////////////////////////////////////////////			
			
			/**
			 * Membuat array 2 dimensi
			 */
//		int [][]nilai ={
//			{1,2,3},
//			{4,5,6},
//			{7,8,9}
//	};
//
//		for(int i=0;i<nilai.length;i++) {
//			for(int j = 0; j<nilai[i].length; j++) {
//				System.out.print(nilai[i][j]);
//			}System.out.println();
//		}
			
////////////////////////////////////////////////////////////////////////////////////////////			
			
			/**
			 * Menampilkan nama dan alamat dalam array
			 */
//			String [][] data = {
//					{"Jouzu","Jakarta"},
//					{"Budi","Bogor"},
//					{"Bambang","Manado"}
//			};
//			
//			for(int i = 0; i<data.length;i++) {
//				System.out.println("Nama : "+data[i][0]);
//				System.out.println("Alamat : "+data[i][1]);
//				System.out.println("");
//			}
			
////////////////////////////////////////////////////////////////////////////////////////////
			
			/**
			 * Membuat baris dan kolom baru untuk array multidimensi
			 * Serta menampilkan array yang telah dibuat 
			 */
//			System.out.print("Masukkan Jumlah Baris : ");
//			int jumlahBaris = input.nextInt();
//			System.out.print("Masukkan Jumlah Kolom : ");
//			int jumlahKolom = input.nextInt();
//			
//			int [][]array = new int [jumlahBaris][jumlahKolom];
//			
//			int i,j;
//			for(i = 0;i<jumlahBaris;i++) {
//				for(j=0;j<jumlahKolom;j++) {
//					System.out.print("Masukkan data ke ["+i+"] ["+j+"] : ");
//					array [i][j]= input.nextInt();
//				}
//			}
//			
//			
//			for(i = 0;i<array.length;i++) {
//				for(j=0;j<array[i].length;j++) {
//					System.out.print(array[i][j]+" ");
//				}
//			}
			
////////////////////////////////////////////////////////////////////////////////////////////			
			
			/**
			 * ArrayList merupakan sebuah object/library yg harus di import terlebih dahulu
			 * ArrayList  berguna untuk menampung sebuah data baru dalam bentuk array baru yang kosong
			 * Metode untuk memanipulasi array--> get, set, remove
			 * 
			 */
			
//			ArrayList <String> array = new ArrayList <String>();
//			array.add("Jouzu");
//			array.add("Nuga");
//			array.add("Jovana");
//
//			for(int i = 0; i<array.size() ; i++) {
//				System.out.println(array.get(i));
//			}
			
//			ArrayList <String> keluarga = new ArrayList <String>();
//			System.out.print("Masukkan jumlah keluarga : ");
//			int jumlah = input.nextInt();
//			System.out.println("Masukkan anggota keluarga : ");
//			for(int i = 0; i<jumlah ; i++) {
//				keluarga.add(input.next());
//			}
//			System.out.println("===========================================");
//			
//			for(int j =0; j<keluarga.size();j++) {
//				System.out.println(keluarga.get(j));
//			}System.out.println(" ");
			
////////////////////////////////////////////////////////////////////////////////////////////			

			
}
}
