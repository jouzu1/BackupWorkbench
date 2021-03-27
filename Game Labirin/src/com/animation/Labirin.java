package com.animation;

public class Labirin {
	private int defaultSize = 10;
	private Player player;
	
	public int getDefaultSize() {
		return defaultSize;
	}

	public void setDefaultSize(int defaultSize) {
		this.defaultSize = defaultSize;
	}

	public Labirin(int ruangan, Player player) {
		if(ruangan<defaultSize) {
			this.defaultSize = 10;
		}else {
			this.defaultSize = ruangan;
		}
		this.player = player;
	}
	
	public Labirin() {
		this.player = new Player();
	}
	
	public void draw() {
		String dummyWall = "_";
		for(int y = 0; y<this.defaultSize; y++) {
			
			for(int x = 0; x<this.defaultSize; x++) {
				
				if(y==0 || y==this.defaultSize-1) {
					dummyWall = "_";
				}
				else 
				{
					if(x == 0 || x == this.defaultSize-1) 
					{
						dummyWall = "|";
					}
					else 
					{
						dummyWall = " ";
					}
				}
				if(y == this.player.getCorY() && x == this.player.getCorX()) {
					dummyWall = this.player.getBentuk();
				}
				System.out.print(dummyWall);
			}System.out.println();
		}
	}
}
