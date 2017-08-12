package com.hand.JavaSETest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_03 {
	public static void main(String[] args) {
		//1--在List中存放50个小于100的整数
		List<Integer> zList=new ArrayList<>(); //存放50个整数的List
		int temp=0;	//临时存放所随机取得的整数的值
		System.out.print("随机生成50个小于100的数，分别为：");
		for (int i = 0; i < 50; i++) {
			temp=(int)(Math.random()*100);
			System.out.print(temp+",");
			zList.add(temp);
		}
		System.out.println();
		
		
		//2-在Map中按key值存入value
		Map<Integer,ArrayList<Integer>> map=new HashMap<>();
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> aList=new ArrayList<>();
			for (int j = 0; j < zList.size(); j++) {
				if(zList.get(j)/10==i){
					aList.add(zList.get(j));
				}
			}
			map.put(i, aList);
		}
		System.out.println("Map中的数据为："+map);
		
		map.put(100, new ArrayList<Integer>());
		//3--分别给Map中key值对应的value值排序
		
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> array=map.get(i);
			//冒泡排序
			for (int j = 0; j<array.size() ; j++) {
				for (int k = 0; k < array.size()-1; k++) {
					if(array.get(k)>array.get(k+1)){
						int tt=array.get(k);
						array.set(k, array.get(k+1));
						array.set(k+1, tt);
					}
					
				}
			}
			
		}
		System.out.println("排序后的Map为："+map);
		
		
		
	}
}
