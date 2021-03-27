package com.sesisatu;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		BangunRuang bangun = new BangunRuang();
		
//		bangun.showLuas();
//		bangun.showKeliling();
		
		Kotak kotak1 = new Kotak("Persegi");
		kotak1.setSisi(14.5);
//		kotak.showLuas();
//		kotak.status();
		PersegiPanjang pp=new PersegiPanjang("Persegi Panjang");
		pp.setPanjang(20.5);
		pp.setLebar(23);
//		pp.status();
		
		/**
		 * Membuat List Interface dan memakai ArrayList sebagai implementasinya
		 * Menggunakan method add untuk menambahkan objek ke dalam ArrayList
		 * setelah itu di iterasi dan ditampilkan
		 */
		
		//Mempraktekkan dari polymorphism
		//Tanya ini dan Kotak kotak = new Kotak("Persegi");
		DuaDimensi kotak2 = new Kotak ("Kotak Semesta");
		kotak2.setNewSisi(35.4);
		
		DuaDimensi pp2 = new PersegiPanjang("Kotak baru");
		
		pp2.setNewPanjang(23.4);
		pp2.setNewLebar(2.3);
		
		List<DuaDimensi> list = new ArrayList <DuaDimensi>();
		list.add(kotak1);
		list.add(pp);
		list.add(kotak2);
		list.add(pp2);

		for(int i = 0; i<list.size();i++) {
			list.get(i).status();
		}
		
		
	}

}
