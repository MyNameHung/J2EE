package com.library;

public class ProcessArray {
	
	public static String ArrayToString(String[] arr){
		
		String output = "";
		if(arr == null) return output;
		for(String str : arr){
			output += "'" + str + "'," ;
		}
		String output1 = output.substring(0, output.length() - 1);
		return output1;
	}
	
	public static void main(String[] args){
		String[] a = null;
		System.out.print(ArrayToString(a));
	}
}
