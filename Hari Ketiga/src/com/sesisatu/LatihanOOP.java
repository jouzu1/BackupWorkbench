package com.sesisatu;

//Buat nampung equipment pedang sama armor
class player{
	String nama;
	double health;
	int level;
	//ngambill constructor(data) pedang dan armor
	pedang sword;
	armor zirah;
	
	player(String nama,double health, int level){
		this.nama = nama;
		this.health = health;
		this.level = level;
	}
}

class pedang{
	double atk;
	
	pedang(double atk){
		this.atk = atk;
	}
}

class armor{
	double armor;
	
	armor(double armor){
		this.armor = armor;
	}
}

public class LatihanOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		player human = new player("Jouzu",100,1);
		pedang excalibur = new pedang(999);
		armor  kings = new armor(999);
		
		System.out.println(human);
		
	}

}
