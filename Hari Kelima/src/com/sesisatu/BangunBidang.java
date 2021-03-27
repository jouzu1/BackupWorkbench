package com.sesisatu;

public class BangunBidang {
	private String namaBidang = " ";
	private double result = 0.0;
	public static double pi = 3.14;

	public BangunBidang(String namaBidang) {
		this.namaBidang = namaBidang;
	}
	
	public double luaslingkaran(double r) {
		double luasLingkaran = pi * r * r;
		return luasLingkaran;
	}
	
	public double getResult() {
		return result;
	}
	public String namanya() {
		return namaBidang;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	public void print() {
		System.out.println("Luas " + this.namaBidang + " adalah " + this.result);
	}
	
}
