package com.mangwon.dangdo.main;

import java.util.Scanner;

public class Command {
	
	public Scanner sc =  new Scanner(System.in);
	

	
	public String getCommand(String guide) {
		System.out.println(guide);
		String cmd = sc.next();
		return cmd;
	}
	
	public int getIntCommand(String guide) {
		System.out.println(guide);
		int cmd = sc.nextInt();
		return cmd;
	}

}
