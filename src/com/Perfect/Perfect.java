package com.Perfect;

public class Perfect extends Aliquot {
/*This class with extend Aliquot class to get the Aliquot number.The paremt methods are being  out*/
	int result=0;
	
	
	public boolean checkWhether(int x){
		result=super.findAliquot(x); //uses super to call the call the parent class method 
		
		if(result==x){
			return true;
		}
		else{
			return false;
			}
	
	}
	public void publish(){ //Mthod to support printing and print from 1 to 100
		System.out.println("********************** ");
		System.out.println("The published list for the perfect number in the range 1 to 100 ");
		for (int i=1;i<100;i++){
			if(checkWhether(i)){
				System.out.println(i);
			}
			
		}
	}
}
