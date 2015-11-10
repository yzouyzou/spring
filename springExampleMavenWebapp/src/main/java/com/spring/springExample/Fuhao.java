package com.spring.springExample;


public class Fuhao {
	public static void main(String args[]){
		Fuhao fuhao = new Fuhao();
		System.out.println(fuhao.chklegal("[a+b*(5-4)]*{x+b+b*({1+2)}}"));
		
	}

	
	
	public boolean chklegal(String a){
		int[] count = new int[6];
		for(int i=0;i<a.length();i++){
			switch(a.charAt(i)){
			case '{': count[0]++; break;
			case '[': count[1]++; break;
			case '(': count[2]++; break;
			case ')': count[3]++; break;
			case ']': count[4]++; break;
			case '}': count[5]++; break;
			}
		}
		if(count[0]==count[5] && count[1]==count[4] && count[2]==count[3]){
			return true;
		}else{
			return false;
		}
	}
}
