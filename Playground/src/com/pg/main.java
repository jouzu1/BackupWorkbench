package com.pg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//player
//class Player{
//	String nama;
//	double health;
//	double level;
//	
//	
//
//	public double getLevel() {
//		return level;
//	}
//
//	Weapon weapon;
//	Armor armor;
//	
//	Player(String nama, double health){
//		this.nama = nama;
//		this.health = health;
//	}
//	public void setLevel(double level) {
//		this.level = level;
//	}
//	public void equipWeapon (Weapon weapon) {
//		 this.weapon = weapon;
//	}
//	
//	public void equipArmor(Armor armor) {
//		this.armor = armor;
//	}
//
//	public void statusPlayer() {
//		System.out.println("Nama player adalah : " + this.nama);
//		System.out.println("Health : " + this.health);
//		System.out.println("Levelnya adalah : " + this.level);
//		this.weapon.showWeapon();
//		this.armor.showArmor();
//	}
//}
//
////weapon
//class Weapon{
//	double atk;
//	public String nama;
//	
//	public Weapon(String nama, double atk){
//		this.nama = nama;
//		this.atk = atk;
//	}
//	public void showWeapon() {
//		System.out.println("Nama Senjatanya adalah : " + this.nama + " dan attack powernya adalah : " + this.atk);
//	}
//}
////armor
//class Armor{
//	double def;
//	String nama;
//	
//	public Armor(String nama, double def) {
//		this.nama = nama;
//		this.def = def;
//	}
//	
//	public void showArmor() {
//		System.out.println("Nama Armornya adalah : " + this.nama + " dan defense armornya adalah : " + this.def);
//	}
//	
//}


public class main {
	
	static InputStreamReader data = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(data);
	
	public static double calculatePMT(double rate, double nper, double pv) {
        double v = (1 + (rate / 12));
        double t = (-(nper / 12) * 12);
        double result = (pv * (rate / 12)) / (1 - Math.pow(v, t));
        return result;
    }
	public static double calculatePMTA(double rate, double nper, double pv) {
        double v = (1 + (rate / 12));
        double t = (-(nper / 12) * 12);
        double result = (pv * (rate / 12)) / (1 - Math.pow(v, t));
        return result++;
    }

	public static void main(String[] args) {
//		System.out.println((calculatePMT(0.09, 12, 10000)));
//		System.out.println((calculatePMTA(0.09, 12, 10000)));
//        System.out.println((calculatePMT(0.085, 24, 10000)));
//        System.out.println((calculatePMT(0.085, 36, 10000)));
//		double rate = 1.2/12        /*10% per tahun*/;
//		double nper = 12;         /*15 bulan*/
//		double pv = 20000000;     /*20 juta*/
//		double v = (1 + (rate / 12));
//        double t = (-(nper / 12) * 12);
//        double result = ((pv * (rate / 12)) / (1 - Math.pow(v, t))*nper/pv-1);
//        
//        
//        
//        /**
//         * Total Angsuran
//         * Angsuran Pokok
//         * Angsuran Bunga
//         * Sisa Pinjaman
//         */
//        
//        double sukubunga = 1.2/12;
//        int lamapinjam = 15;
//        int uang = 20000000;
//        double bunga = 1.2;
//        
//        double atas = Math.pow(1 + sukubunga, lamapinjam);
//        double bawah = Math.pow(1 + sukubunga, lamapinjam)-1;
//        double gabung = atas/bawah;
//        double modif = 1-(Math.pow(1+(sukubunga), -lamapinjam));
//        
//        
//        
//        double totalAngsuran = uang * (sukubunga / modif);
//        double angsuranBunga = sukubunga*uang*(Math.pow(((1+sukubunga)),lamapinjam))/(Math.pow(((1+sukubunga)),lamapinjam))-1;                
//        double angsuranPokok = totalAngsuran - angsuranBunga;
//        double sisapinjaman = uang - angsuranPokok;
//
//        System.out.println(totalAngsuran);
//        System.out.println(angsuranPokok);
//        System.out.println(angsuranBunga);
//        System.out.printf("%f",sisapinjaman);
//        for(int i = 0; i<5; i++) {
//        	System.out.print(result);
//        }
		test();
	}
	static int x = 5;
	static void test() {
		System.out.println(x);
	}
		// TODO Auto-generated method stub
//		Player player1 = new Player ("Jouzu",999);
//		Player player2 = new Player ("Bima",999);
//		Weapon pedang1  = new Weapon ("Excalibur",999);
//		Weapon pedang2  = new Weapon ("Kingslayer",999);
//		Armor armor1 = new Armor ("Ancient Shield",999);
//		Armor armor2 = new Armor ("NeoTech",999);
//		
//		player1.equipWeapon(pedang1);
//		player1.equipArmor(armor1);
//		
//		player2.equipWeapon(pedang2);
//		player2.equipArmor(armor2);
//		
//		
//		player1.setLevel(999);
//		player2.setLevel(800);
//		
//		player1.statusPlayer();
//		System.out.println("==================");
//		player2.statusPlayer();
//		player1.weapon.showWeapon();
//		System.out.println();
//		player1.armor.showArmor(); 
//		aupaan(2,3);
		
	
//	 static void aupaan(int a, int b) {
//			int jumlah = a+b;
//			int hasil = jumlah++;
//			System.out.print(hasil);
//		}
//	static void showMenu() {
//		System.out.println("===========================");
//		System.out.println("1. Request Pinjaman");
//		System.out.println("2. Simulasi Cicilan");
//		System.out.println("3. Keluar");
//		System.out.print("Masukkan pilihan : ");
//		
//		
//		try {
//			int key = Integer.parseInt(br.readLine());
//			switch (key) {
//			case 1 :
////				reqPlatfon();
//				break;
//			default:
//				break;
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
	
}
