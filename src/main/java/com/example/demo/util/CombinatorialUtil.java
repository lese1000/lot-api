package com.example.demo.util;

public class CombinatorialUtil {

	public static void main(String[] args) {
//		System.out.println(getFactorial(4));
		System.out.println(getCombinatorial(6,2));

	}
	
	/**
	 * 组合算法
	 * @param bottomNum 基础数
	 * @param topNum 选取的数
	 * @return
	 */
	public static int getCombinatorial(int bottomNum,int topNum){
		if(topNum > bottomNum){
			return 0;
		}else if(topNum == 1){
			return bottomNum;
		}else if(topNum == bottomNum){
			return 1;
		}else{
			int i_a=1;
			for(int i=0; i< topNum; i++){
				i_a=i_a * (bottomNum-i);
			}
			return i_a/getFactorial(topNum);
		}
		
	} 
	
	private static int getFactorial(int  topNum){
		if(topNum == 1){
			return topNum;
		}else{
			return topNum * getFactorial(topNum-1);
		}
	} 

}
