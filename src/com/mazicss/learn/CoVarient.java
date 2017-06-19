package com.mazicss.learn;

class CoVar{  
	CoVar get(){return this;}  
}  
  
class CoVarient extends CoVar{  
	CoVarient get(){return this;}  
void message(){System.out.println("welcome to covariant return type");}  
  
public static void main(String args[]){  
new CoVarient().get().message();  
}  
} 