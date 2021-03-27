package com.sesisatu;

public class Kotak extends BangunRuang implements DuaDimensi{
	private String nama;
	private double sisi;
	private double newSisi;
	private double newPanjang;
	private double newLebar;
	public String getNama() {
		return nama;
	}

	
	
	
	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}

	//Constructor
	public Kotak (String nama) {
		this.nama = nama;
	}
	
	@Override
	public double hitungKeliling() {
		// TODO Auto-generated method stub
		return this.sisi*4;
	}
	
	@Override
	public double hitungLuas() {
		// TODO Auto-generated method stub
		return this.sisi*this.sisi;
	}
	
	@Override
	public void showKeliling() {
		// TODO Auto-generated method stub
		System.out.println(this.hitungKeliling());
	}
	
	@Override
	public void showLuas() {
		// TODO Auto-generated method stub
		System.out.println(this.hitungLuas());
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println(this.nama+" memiliki keliling sebesar "+this.hitungKeliling()+" dan luas sebesar "+this.hitungLuas());
	}




	@Override
	public void setNewSisi(double newSisi) {
		// TODO Auto-generated method stub
		this.sisi = newSisi;
	}




	@Override
	public void setNewPanjang(double newPanjang) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void setNewLebar(double newLebar) {
		// TODO Auto-generated method stub
		
	}
	
}



	