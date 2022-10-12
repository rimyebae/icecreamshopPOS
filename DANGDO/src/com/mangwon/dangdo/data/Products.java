package com.mangwon.dangdo.data;

import java.util.HashMap;

public class Products {
	//실질적 값을 가지고 있는 상품들(종이컵/콘/투고박스)
	
	public String name;
	public int price;
	public int sum;
	public int count;
	HashMap<String , Products> item;	
 
 public Products(HashMap<String,Products> item) {
	 this.item = item;
 
 }
	
 public Products(String name, int price) {
	 this.name = name;
	 this.price = price;
}

public Products(String name) {
	this.name = name;
}

public Products() {
	// TODO Auto-generated constructor stub
}

public void setList() {//기본상품세팅
	 item.put("CUP", new Products("종이컵(CUP)",4500));
	 item.put("CORN", new Products("콘과자(CORN)",4500));
	 item.put("TOGOBOX", new Products("대용량포장박스(TOGOBOX)",18000));
	 
 }
	

 
 
 
 
 
 
 
 
	
	
	

}
