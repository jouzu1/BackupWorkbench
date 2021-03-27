package com.main;

import com.animation.Labirin;
import com.animation.Player;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player("<>", 1, 1);
		Labirin labirin = new Labirin(11,player);
//		labirin.draw();
		labirin.setDefaultSize(40);
		
		
		labirin.draw();
//		System.out.println(labirin.defaultSize);
	}

}
