package com.mangwon.dangdo.main;

import java.util.ArrayList;
import java.util.HashMap;

import com.mangwon.dangdo.data.Cart;
import com.mangwon.dangdo.data.IceCream;
//import com.mangwon.dangdo.data.IceCream;
import com.mangwon.dangdo.data.Products;
import com.mangwon.dangdo.proc.ProcManagement;
import com.mangwon.dangdo.proc.ProcOrder;

public class Kiosk {
	
	HashMap<String , Products> item =  new HashMap<>();
	HashMap<String , IceCream> taste = new HashMap<>();
	Products pro = new Products();
	IceCream ice = new IceCream();
	DaynTime dnt = new DaynTime();
	
	public void run() {
		//초기화
		Products pd = new Products(item);
		pd.setList();
		IceCream ic = new IceCream(taste);
		ic.setIceList();
		

		System.out.println();
		System.out.println(" [DANGDO]");
		System.out.println();
		System.out.println("  :당도는 서울특별시 마포구 포은로 106에 위치한 젤라또가게입니다.");
		System.out.println();
		//시작시간
		System.out.print("> 영업시작시간 : ");
		dnt.time();
		System.out.println();
		
		
		
		loop:
		while(true) {
			
		
		Command cmd = new Command();
		int c = cmd.getIntCommand("▶ 번호를 입력해주세요."
				+ "\n[ 1. 매장관리 / 2. 주문받기 / 3. 전원OFF ]");
		
		
		switch(c) {
		case 1: //매장관리
			ProcManagement manage = new ProcManagement();
			manage.run(item,taste,pro,ice);
			break;
		
		case 2: //주문받기
			System.out.print("> 주문시간 :");
			dnt.time();
			ArrayList<Cart> cart = new ArrayList<>();
			ProcOrder order = new ProcOrder();
			order.run(item,taste,cart,pro,ice);
			break;
		
		case 3: //전원 OFF
			System.out.println(" ▶ 띠로링~ 전원을 종료합니다. ◀");
			System.out.print("> 영업종료시간 : ");
			dnt.time();
			//종료시간
			
			
			break loop;
		
		
		}
		
		
		}
		
		
		
	}

}
