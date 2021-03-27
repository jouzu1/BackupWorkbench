package com.sesisatu;

public class PersegiPanjang extends BangunRuang implements DuaDimensi{
	private String nama;
	private double panjang;
	private double lebar;
	
	public double getPanjang() {
		return panjang;
	}

	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}
	
	public double getLebar() {
		return lebar;
	}

	public void setLebar(double lebar) {
		this.lebar = lebar;
	}

	//Constructor
	public PersegiPanjang(String nama) {
		this.nama = nama;
	}
	
	@Override
	public double hitungKeliling() {
		// TODO Auto-generated method stub
		return 2*(this.getPanjang() + this.getLebar());
	}
	
	@Override
	public double hitungLuas() {
		// TODO Auto-generated method stub
		return this.getPanjang()*this.getLebar();
	}
	
	@Override
	public void showKeliling() {
		// TODO Auto-generated method stub
		System.out.println("Keliling "+this.nama+" adalah "+this.hitungKeliling());
	}
	
	@Override
	public void showLuas() {
		// TODO Auto-generated method stub
		System.out.println("Luas "+this.nama+" adalah "+this.hitungLuas());
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println(this.nama+" memiliki keliling sebesar "+this.hitungKeliling()+" dan luas sebesar "+this.hitungLuas());
	}


	@Override
	public void setNewSisi(double newSisi) {
		// TODO Auto-generated method stub
		//Abstract
	}

	@Override
	public void setNewPanjang(double newPanjang) {
		// TODO Auto-generated method stub
		this.panjang = newPanjang;
	}

	@Override
	public void setNewLebar(double newLebar) {
		// TODO Auto-generated method stub
		this.lebar = newLebar;
	}
	
	
}
