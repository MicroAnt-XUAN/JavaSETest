package com.hand.JavaSETest;

import java.util.Scanner;

public class Test_01 {
	public static void main(String[] args) {
		System.out.print("请输入工资：");
		Scanner scan=new Scanner(System.in);
		double sal=0.00;  //工资、薪金所得
		double sf=0.00;   //应当缴纳的税费
		try {
			sal=scan.nextDouble();
		} catch (Exception e) {
			System.out.println("您输入的格式有误");
		}
		scan.close();
		if(sal>3500){
			if(sal>80000){
				sf=(sal-80000)*0.45+80000*0.35+55000*0.30+35000*0.25+9000*0.20+4500*0.1+1500*0.03;
			}else if(sal>55000&&sal<=80000){
				sf=(sal-55000)*0.35+55000*0.30+35000*0.25+9000*0.20+4500*0.1+1500*0.03;
			}else if(sal>35000&&sal<=55000){
				sf=(sal-35000)*0.30+35000*0.25+9000*0.20+4500*0.1+1500*0.03;
			}else if(sal>9000&&sal<=35000){
				sf=(sal-9000)*0.25+9000*0.2+4500*0.1+1500*0.3;
			}else if(sal>4500&&sal<=9000){
				sf=(sal-4500)*0.2+4500*0.1+1500*0.03;
			}else if(sal<=4500){
				sf=(sal-1500)*0.1+1500*0.03;
			}
		}
		System.out.println("所需要缴纳的费用为："+sf+"元");
	}
}
