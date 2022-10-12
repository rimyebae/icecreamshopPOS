package com.mangwon.dangdo.proc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.mangwon.dangdo.data.IceCream;
import com.mangwon.dangdo.data.Products;
import com.mangwon.dangdo.main.Command;

public class ProcManagement {
	
	public void run(HashMap<String , Products> item, HashMap<String,IceCream> taste, Products pro, IceCream ice) {
		
		System.out.println();
		System.out.println("▷▷ 매장관리 페이지 입니다.");
		System.out.println();
		
		loop:
		while(true) {
		Command cmd = new Command();
		int c = cmd.getIntCommand("> 번호을 입력하세요. \n [1. 상품보기 / 2. 상품등록 / 3. 상품삭제 "
				+ "/ 8.정산하기 / 0.뒤로가기]");
		
		switch(c) {
		
		case 1: //상품목록 보기
			//아이스크림 맛 보이기
			System.out.println("==========< 아이스크림 목록 >==========");
			Set<String> keyset1 = taste.keySet();
			Iterator<String> it1 = keyset1.iterator();
			while(it1.hasNext()) {
				String key = it1.next();
				IceCream ice1 =  taste.get(key);
				System.out.println(ice1.name);
			}
			
			//종이컵 등 보이기
			System.out.println("============< 상품 목록 >============");
			Set<String> keyset2 = item.keySet();
			Iterator<String> it2 = keyset2.iterator();
			while(it2.hasNext()) {
				String key = it2.next();
				Products duct =  item.get(key);
				System.out.println(duct.name);
			}
			System.out.println("===================================");
			break;
			
		case 2: //상품등록
			System.out.println("> 상품등록을 진행합니다.(번호입력)");
			int an = cmd.getIntCommand("[1.아이스크림맛 등록 / 2. 용기등록 / 0.취소]");
			
			if(an == 1) {//아이스크림 맛 등록
			String newicename = cmd.getCommand("▶ 등록할 맛의 이름을 적어주세요.");
			taste.put (newicename ,new IceCream(newicename,0));
			System.out.println("> 등록이 완료되었습니다.");
			}else if(an == 2) {//용기 등록
				//TODO 용기를 추가하면 저기뭐냐.. 그 주문할때 적용할 수 없음.
			String newname =  cmd.getCommand("▶ 등록할 제품의 이름을 적어주세요.[작성양식] 제품명(영문명/대문자)")	;
			int newprice = cmd.getIntCommand("▶ 등록할 제품의 가격을 적어주세요.(원 단위)");
			String newkey =  cmd.getCommand("▶ 등록할 제품의 키를 적어주세요.(영어대문자)");
			item.put(newkey, new Products(newname, newprice));	
			System.out.println("> 등록이 완료되었습니다.");
			}else if(an == 0) {
				break;
			}
			
			break;
			
		case 3://상품삭제
			System.out.println("> 상품삭제을 진행합니다.(번호입력)");
			int del = cmd.getIntCommand("[1.아이스크림맛 삭제 / 2. 용기 삭제 ]");
			
			if(del == 1) {//아이스크림 맛 삭제
			String delicename = cmd.getCommand("▶ 삭제할 맛의 이름을 적어주세요.");
			taste.remove(delicename);
			System.out.println("> 삭제가 완료되었습니다.");
			}else if(del == 2) {//용기 삭제
			String delname =  cmd.getCommand("▶ 삭제할 제품의 키(영어대문자)를 적어주세요.")	;
			item.remove(delname);	
			System.out.println("> 삭제가 완료되었습니다.");
			}else if(del == 0) {
				break;
			}
			break;
			
		case 8://영업마감 및 정산
			System.out.println("> 정산을 진행 합니다.");
			System.out.println();
			//맛 별 나간 횟수
			System.out.println("==========< 아이스크림 집계 >==========");
			Set<String> keySet3=taste.keySet();
			Iterator<String> it3  = keySet3.iterator();
			while(it3.hasNext()) {
				String key = it3.next();
				IceCream ice3 =  taste.get(key);
					System.out.println(" ["+ice3.name+" Sell: "+ ice3.count +"]");
			}
			//용기별 나간 횟수
			System.out.println("==============< 상품 집계 >==============");
			Set<String> keyset4 = item.keySet();
			Iterator<String> it4 = keyset4.iterator();
			while(it4.hasNext()) {
				String key = it4.next();
				Products duct1 =  item.get(key);
				System.out.println(" ["+duct1.name+" Sell: "+ duct1.count +"]");
			}
			
			//오늘 총 판매금액
			System.out.println("============< 오늘정산금액 >============");
			System.out.println("금액 : " + pro.sum + "원");
			
			break;
		case 0: //뒤로가기
			break loop;
		
		
		
		
		}
		
		
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
