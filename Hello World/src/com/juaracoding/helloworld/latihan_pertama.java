package com.juaracoding.helloworld;

public class latihan_pertama {
	
	//Aturan java, setiap class yg dijalankan pasti yg dijalankan itu constructornya
	
	//Public doang buat constructor, nama constructor harus sama dengan nama class
	public latihan_pertama() {
		System.out.println("Constructor Dijalankan");
	}
	
	
	
	//public void buat method dan void itu gak ada return atau nilai balik
	public void sayHello() {
		System.out.println("Hello apa kabar");
	}
	
	
	
	//Buat function dengan tipe data string 
	public String getHello() {
		return " ";
	}
	
	
	
	//Membuat metod dimana sebagai metod utama, tidak perlu pakai di instance
	//Metod berisi sebua paramaeter
	//Pada saat memanggil
	public static void HelloDunia(String nama) {
		System.out.println("Hello Broooo!!!!" +nama);
	}
	/**
	 * void untuk method
	 * string, int untuk membuat function
	 * tanpa modifier dan tipe data digunakan untuk membuat constructor
	 */
}
