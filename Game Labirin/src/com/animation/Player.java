package com.animation;

public class Player {
	/**
	 * Didalam class ini, player memiliki atribut atau ciri2nya aalah memiliki bentuk, posisi dalam koordinat x dan y 
	 * Memiliki fungsi atau method dimana player bisa bergerak ke atas dan ke bawah
	 */
	
	private String bentuk = "@";
	private int corX = 1;
	private int corY = 1;
	public String getBentuk() {
		return bentuk;
	}
	public void setBentuk(String bentuk) {
		this.bentuk = bentuk;
	}
	public int getCorX() {
		return corX;
	}
	public void setCorX(int corX) {
		this.corX = corX;
	}
	public int getCorY() {
		return corY;
	}
	public void setCorY(int corY) {
		this.corY = corY;
	}
	
	//Constructor
	public Player(String bentuk , int corX, int corY) {
		this.bentuk = bentuk;
		this.corX = corX;
		this.corY = corY;
	}
	
	//Constructor without param
	public Player() {
		System.out.println("Masukkan bentuk objek dalam simbol, koordinat x dan y");
	}
	
	//Method untuk bergerak sesuai 4 arah mata angin
	public void up() {
		this.corY++;
	}
	public void down() {
		this.corY--;
	}
	public void left() {
		this.corX--;
	}
	public void rigth() {
		this.corX++;
	}
	
}
