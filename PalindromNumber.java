package com.jspider.TronSoftech;
//Integer="123453";
public class PalindromNumber {
	public static void main(String[] args) {
		//Integer ="12345";
		String a="121";
		int n = Integer.parseInt(a);
		int temp=n;
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
		
	}
}