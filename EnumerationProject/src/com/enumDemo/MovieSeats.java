package com.enumDemo;

public enum MovieSeats {

	STANDARD(300), PREMIUM(400), RECLINER(550);
	
	int price;
	
	private MovieSeats(int price) {
		this.price = price;
	}
}
