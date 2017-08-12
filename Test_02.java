package com.hand.JavaSETest;

import java.util.Scanner;

public class Test_02 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("请输入日期：");
		String dateStr=scan.nextLine().toString();
		scan.close();
		String [] dates=dateStr.split("-");
		
		int year= 0,month = 0,day = 0;
		try {
			year=Integer.parseInt(dates[0]);
			month=Integer.parseInt(dates[1]);
			day=Integer.parseInt(dates[2]);
		} catch (Exception e) {
			System.out.println("您输入的日期不存在");
			return;
		}
		day++;
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			if(day==32){
				day=1;
				month++;
			}else if(day>32||day<1){
				System.out.println("您输入的日期不存在");
			}
			break;
		case 12:
			if(day==32){
				day=1;
				month=1;
				year++;
			}else if(day>32||day<1){
				System.out.println("您输入的日期不存在");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(day==31){
				day=1;
				month++;
			}else if(day>31||day<1){
				System.out.println("您输入的日期不存在");
			}
			break;
		case 2:
			if((year%4==0 && year%100!=0) || year%400==0){
				if(day==29){
					day=1;
					month++;
				}else if(day>29||day<1){
					System.out.println("您输入的日期不存在");
				}
			}else{
				if(day==30){
					day=1;
					month++;
				}else if(day>30||day<1){
					System.out.println("您输入的日期不存在");
				}
			}
			break;
		default:
			System.out.println("您输入的日期不存在");
			return;
		}
		
		System.out.println("下一天为："+year+"-"+month+"-"+day);
		
		
		


	}

}



