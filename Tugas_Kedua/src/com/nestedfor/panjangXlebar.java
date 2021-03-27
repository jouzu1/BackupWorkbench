package com.nestedfor;

import java.util.Scanner;

public class panjangXlebar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scan = new Scanner(System.in);
		

		//1) Latihan For Loop Membuat Star Pattern Persegi
		/**
		 * i dan j merepresentasikan panjang dan lebar
		 * 
		 * baris=lebar, kolom=panjang
		 * 
		 * for loop pertama untuk membuat baris dimana baris yang dibuat berjumlah 4 (0 sampai dengan 3)
		 * 
		 * for loop kedua digunakan untuk membuat kolom, dimana kolom yg dibentuk berjumlah 5 (0 sampai dengan 4)
		 * 
		 * */
		
		int i,j,k;
//		for(i = 0; i<4; i++) {
//			for(j=0; j<5; j++) {
//				System.out.print("* ");
//			}System.out.println("");
//		}
		//2) Latihan For Loop Membuat Star Pattern Setengah Segitiga
		/**
		 * i dan j sama seperti nomor 1
		 * tetapi nilai j selalu selisih dibawah i setiap pengulangan
		 */
//		for(i = 0; i<5 ; i++) {
//			for(j = 0; j<i ; j++) {
//				System.out.print("* ");
//			}System.out.println();
//		}
		System.out.println();
		
		
		//3) Latihan For Loop Membuat Star Pattern Persegi dengan bilangan prima
		/**
		 * Prinsipnya sama dengan persegi akan tetapi, urutan sesuai angka pada umumnya
		 * akan menunjukkan urutannya sebagai urutan prima dengan simbol tanda seru '!'
		 */
//		int  nilai = 0;
//		for(int x = 0 ; x<5 ; x++) {
//			for(int y = 0; y<4 ; y++) {
//				nilai++;
//				int penanda_angka_prima=0;
//				for(int z = 1; z<=nilai; z++) {
//					if(nilai%z == 0) {
//						penanda_angka_prima++;
//					}
//				}if(penanda_angka_prima == 2) {
//					System.out.print("! ");
//				}else {
//					System.out.print("* ");
//				}
//			}System.out.println();
//		}
		
		
		//4) Pattern unik
		/**
		 * Pattern Unik
		 */
//		int x,y;
//		for(x = 0; x<5; x++) {
//			for(y = 0; y<5; y++) {
//				if(x>=y) {
//					System.out.print("* ");
//				}else {
//					System.out.print("! ");
//				}
//			}System.out.println();
//		}
		
		
//		System.out.print("Masukkan Panjang : ");
//		int panjang = scan.nextInt();
//		System.out.print("Masukkan Lebar : ");
//		int lebar = scan.nextInt();
//		int nilai = 0;
		
		
//		for(int i=0; i<=lebar; i++){
////			System.out.println(i);
//			for(int j=0; j<=i ;j++) {
//				System.out.print("* ");
//				System.out.print(j);
//				nilai++;
//				System.out.print(nilai);
//				int counterBagi = 0;
//				for(int k = 1; k<=nilai ; k++) {
//					if (nilai%k == 0) {
//						counterBagi++;
//					}
//				}
//				if(counterBagi == 2) {
////					System.out.print("! ");
//				}else {
////					System.out.print("* ");
//				}
//			}
//			System.out.print("\n");

//int row = 4;
//int col = 5;
//for(int y =0 ; y<col; y++) {
//
//	for(int x =0; x<=col; x++) {
//		if(x<=y) {
//			System.out.print("*");
//		}else
//			System.out.print("!");
//	}
//System.out.println("");
//}

//System.out.print("Tinggi");
//int tinggi = scan.nextInt();
//
//for(int i =0; i<tinggi; i++) {
//	int panjangKiri = tinggi - i;
//	int panjangKanan= tinggi + i;
//	
//	for(int j = 0; j<=tinggi*2;j++) {
//		if(j==tinggi) {
//			System.out.print("!");
//		}else {
//			if(j<panjangKiri) {
//				System.out.print(" ");
//			}else {
//				if(j>tinggi && j>panjangKanan) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//		}
//	}
//	System.out.println();
}
}
