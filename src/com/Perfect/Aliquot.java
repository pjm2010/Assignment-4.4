package com.Perfect;

public class Aliquot {
/*This is the parent class */
	public int findAliquot(int x){
		int temp=0;
		for(int i=1;i<x;i++){
			if(x%i==0){
				temp=temp+i;
			}
		}
	
		 return temp;
	}
	
	
}
