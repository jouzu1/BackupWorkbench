package com.ujianpertama;

public class MenggambarDenganJava {
	private int ukuran = 0;
	private String model1;
	private String model2;
	
//	public int getUkuran() {
//		return ukuran;
//	}
//
//
//	public void setUkuran(int ukuran) {
//		this.ukuran = ukuran;
//	}


	public MenggambarDenganJava(int ukuran) {
		this.ukuran = ukuran;
	}
	
	
	public void GambarKotak() {
		for(int i = 0; i<this.ukuran;i++) {
			for(int j = 0; j<this.ukuran;j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	
	public void GambarSegitiga() {
		for(int i = 0; i<this.ukuran;i++) {
			for(int j = 0; j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	
	public void GambarSegitigaTerbalik(){
		for(int i = 0; i<this.ukuran;i++) {
			for(int j = this.ukuran; j>i;j--) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	
	
	public void GambarSelangSeling() {
		for(int i = 0; i<this.ukuran;i++) {
			for(int j = this.ukuran; j>i;j--) {
				if(j%2==0) {
					System.out.print("!");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
	}
	
	
	public void GambarCampur() {
		for(int x = 0; x<this.ukuran; x++) {
			for(int y = 0; y<=this.ukuran; y++) {
				if(y<=x) {
					System.out.print("* ");
				}else {
					System.out.print("# ");
				}
			}System.out.println();
		}
	}
	
	
	public void GabungGambar(String model1, String model2) {
		
		switch(model1) {
		case "kotak":
		case "Kotak":
		case "KOTAK":
			GambarKotak();
			break;
		case "segitiga":
		case "Segitiga":
		case "SEGITIGA":
			GambarSegitiga();
			break;
		case "segitiga terbalik":
		case "segitiga Terbalik":
		case "Segitiga terbalik":
		case "Segitiga Terbalik":
		case "SEGITIGA TERBALIK":
			GambarSegitigaTerbalik();
			break;
		case "selang seling":
		case "selang Seling":
		case "Selang seling":
		case "Selang Seling":
		case "SELANG SELING":
			GambarSelangSeling();
			break;
		case "campur":
		case "Campur":
		case "CAMPUR":
			GambarCampur();
			break;
		}System.out.println();
		switch(model2) {
		case "kotak":
		case "Kotak":
		case "KOTAK":
			GambarKotak();
			break;
		case "segitiga":
		case "Segitiga":
		case "SEGITIGA":
			GambarSegitiga();
			break;
		case "segitiga terbalik":
		case "segitiga Terbalik":
		case "Segitiga terbalik":
		case "Segitiga Terbalik":
		case "SEGITIGA TERBALIK":
			GambarSegitigaTerbalik();
			break;
		case "selang seling":
		case "selang Seling":
		case "Selang seling":
		case "Selang Seling":
		case "SELANG SELING":
			GambarSelangSeling();
			break;
		case "campur":
		case "Campur":
		case "CAMPUR":
			GambarCampur();
			break;
		default:
			System.out.println("Masukkan keyword dengan benar");
			break;
		}
	}
}