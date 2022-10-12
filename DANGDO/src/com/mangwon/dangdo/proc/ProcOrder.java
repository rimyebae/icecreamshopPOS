package com.mangwon.dangdo.proc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.mangwon.dangdo.data.Cart;
import com.mangwon.dangdo.data.IceCream;
import com.mangwon.dangdo.data.Products;
import com.mangwon.dangdo.main.Command;

public class ProcOrder {
	

	public void run(HashMap<String,Products>item,HashMap<String,IceCream>taste,
			ArrayList<Cart> cart, Products pro, IceCream ice) {
		
		System.out.println();
		System.out.println("▷▷ 주문 받기 페이지 입니다.");
		System.out.println();
		
		loop:
		while(true) {
			
			Command cmd = new Command();
			int c =  cmd.getIntCommand("> 용기를 선택해주세요(번호입력) \n "
					+ "[ 1.종이컵 / 2.콘과자 / 3.대용량종이박스 / 0.계산 /8.뒤로가기 ]");
			
			
			switch(c) {
			
			case 1://종이컵선택
				System.out.println("▶ 종이컵을 선택하셨습니다.(2가지맛 선택)");
				//아이스크림 맛 보이기
				Set<String> keyset1 = taste.keySet();
				Iterator<String> it1 = keyset1.iterator();
				while(it1.hasNext()) {
					String key = it1.next();
					IceCream ice1 =  taste.get(key);
					System.out.print(" ["+ice1.name+"] ");}
				System.out.println();
				//맛선택
				System.out.println(">> 꼭 아이스크림 맛의 이름을 정확히 입력해주세요");
				System.out.println();
				String cup1 = cmd.getCommand("▶ 첫번째 맛을 선택해주세요.");
				String cup2 = cmd.getCommand("▶ 두번째맛을 선택해주세요.");
				cart.add(new Cart(item.get("CUP"),taste.get(cup1),taste.get(cup2)));
				item.get("CUP").count++;
				taste.get(cup1).count++;
				taste.get(cup2).count++;
				break;
				
				
			case 2://콘과자 선택	
				System.out.println("▶ 콘과자을 선택하셨습니다.(2가지맛 선택)");
				//아이스크림 맛 보이기
				Set<String> keyset2 = taste.keySet();
				Iterator<String> it2 = keyset2.iterator();
				while(it2.hasNext()) {
					String key = it2.next();
					IceCream ice2 =  taste.get(key);
					System.out.print(" ["+ice2.name+"] ");}
				System.out.println();
				//맛선택
				System.out.println(">> 꼭 아이스크림 맛의 이름을 정확히 입력해주세요");
				System.out.println();
				String corn1 = cmd.getCommand("▶ 첫번째 맛을 선택해주세요.");
				String corn2 = cmd.getCommand("▶ 두번째맛을 선택해주세요.");
				cart.add(new Cart(item.get("CORN"),taste.get(corn1),taste.get(corn2)));
				item.get("CORN").count++;
				taste.get(corn1).count++;
				taste.get(corn2).count++;
				break;
				
			case 3:
				System.out.println("▶ 대용량종이박스을 선택하셨습니다.(2가지맛 선택)");
				//아이스크림 맛 보이기
				Set<String> keyset3 = taste.keySet();
				Iterator<String> it3 = keyset3.iterator();
				while(it3.hasNext()) {
					String key = it3.next();
					IceCream ice3 =  taste.get(key);
					System.out.print(" ["+ice3.name+"] ");}
				System.out.println();
				//맛선택
				System.out.println(">> 꼭 아이스크림 맛의 이름을 정확히 입력해주세요");
				System.out.println();
				String box1 = cmd.getCommand("▶ 첫번째 맛을 선택해주세요.");
				String box2 = cmd.getCommand("▶ 두번째맛을 선택해주세요.");
				String box3 = cmd.getCommand("▶ 세번째맛을 선택해주세요.");
				cart.add(new Cart(item.get("TOGOBOX"),taste.get(box1),
						taste.get(box2),taste.get(box3)));
				item.get("TOGOBOX").count++;
				taste.get(box1).count++;
				taste.get(box2).count++;
				taste.get(box3).count++;
				break;
				
			case 0:
				int sum = 0;
				System.out.println("==========================");
				//카트확인
				System.out.println("         [영 수 증]        ");
				System.out.println("==========================");
				for(int i = 0 ; i < cart.size();i++) {
				    System.out.println(cart.get(i).type.name 
				    		+"\n\t  >"+cart.get(i).taste1.name
				    		+"\n\t  >"+cart.get(i).taste2.name);
				    if(cart.get(i).type.name.equals("대용량포장박스(TOGOBOX)")) {
				    	System.out.print("\t  >");
				    	System.out.println(cart.get(i).taste3.name);
				    }
				}
				for(Cart ct : cart) {
					sum = sum + ct.type.price;
				}
				System.out.println("==========================");
				System.out.println("     [총 금액] : "+sum +" 원");
				System.out.println("==========================");
				System.out.println("\t[DANGDO]");
				System.out.println("==========================");
				pro.sum = pro.sum + sum;
				System.out.println();
				break loop;
				
			case 8 :
				System.out.println("> 주문을 취소합니다.");
			break loop;
			}
			
			
		}
		
	}

}
