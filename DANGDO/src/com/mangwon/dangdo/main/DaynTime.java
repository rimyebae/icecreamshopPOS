package com.mangwon.dangdo.main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DaynTime {
	
	
	public void time() { //날짜보여주는 함수
		LocalDate now = LocalDate.now(); //현재날짜구하기
		System.out.print("  "+now+"  "); //결과출력
		
		LocalTime nowT = LocalTime.now(); //현재시간구하기
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		//포멧정리하기
		String formatedNowT = nowT.format(formatter);
		//포멧적용
		System.out.println(formatedNowT); //결과출력
	}
	
	
	
	public String rnowtime() { //지금시간을 리턴하는 함수
		LocalDate now = LocalDate.now(); //현재날짜구하기
		String s = now+" "; //결과출력
		
		LocalTime nowT = LocalTime.now(); //현재시간구하기
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		//포멧정리하기
		String formatedNowT = nowT.format(formatter);
		//포멧적용
		String result = s + formatedNowT; //결과출력
		return result;
		
	}

}
