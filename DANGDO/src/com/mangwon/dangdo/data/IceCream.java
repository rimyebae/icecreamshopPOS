package com.mangwon.dangdo.data;

import java.util.HashMap;

public class IceCream {
	
	public String name;
	public int count;
	HashMap<String , IceCream> taste;
	
	
	 public IceCream(HashMap<String,IceCream> taste) {
		 this.taste = taste;
	 
	 }

	public IceCream(String name,int count) {
		this.name = name;
		this.count = count;
	}


	public IceCream() {
		// TODO Auto-generated constructor stub
	}

	public void setIceList() { //아이스크림 맛 세팅
		taste.put("소금", new IceCream("소금",0));
		taste.put("호지차", new IceCream("호지차",0));
		taste.put("미숫가루", new IceCream("미숫가루",0));
		taste.put("피스타치오", new IceCream("피스타치오",0));
		taste.put("초콜렛", new IceCream("초콜렛",0));
		taste.put("바질우유", new IceCream("바질우유",0));
		taste.put("딸기우유", new IceCream("딸기우유",0));
		taste.put("백향과", new IceCream("백향과",0));
		taste.put("배오렌지", new IceCream("배오렌지",0));
		taste.put("레몬", new IceCream("레몬",0));
		taste.put("애플티소르베", new IceCream("애플티소르베",0));
		taste.put("쌀", new IceCream("쌀",0));
	}
	
	
	

}
