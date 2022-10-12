package com.mangwon.dangdo.data;

public class Cart {
	
	public Products type;
	public IceCream taste1;
	public IceCream taste2;
	public IceCream taste3;
	

//	public Cart(Products products, IceCream iceCream, IceCream iceCream2) {
//		this.type = products;
//		this.taste1 = iceCream;
//		this.taste2 = iceCream2;
//	}
	
	public Cart(Products products, IceCream iceCream ,IceCream iceCream2) {
		this.type = products;
		this.taste1 = iceCream;
		this.taste2 = iceCream2;
		
	}
	
	public Cart(Products products, IceCream iceCream ,IceCream iceCream2,IceCream iceCream3) {
		this.type = products;
		this.taste1 = iceCream;
		this.taste2 = iceCream2;
		this.taste3 = iceCream3;
		
	}
	
	
	
}
