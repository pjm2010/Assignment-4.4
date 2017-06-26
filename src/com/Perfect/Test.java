package com.Perfect;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aliquotSum=0;
		boolean check=true;
		
		Aliquot aq=new Aliquot();
		aliquotSum=aq.findAliquot(6);
		System.out.println("The Aliquot sum is "+aliquotSum); //This will give us the aliquotSum of the number
		
		/*Below method will check whether it is a perfect number or not and another method will print the perfect number till 100*/
		
		Perfect per=new Perfect();
		check=per.checkWhether(6); //This will check for perfect number or not 
		
		if(check){
			System.out.println("The given number is a perfect number");
		}
		else{
			System.out.println("Not a perfect number");
		}
		
		
		/*The method below will print the perfect number between 100*/
		System.out.println("The perfect number between");
		per.publish();
		
		
		
		
	}

}
