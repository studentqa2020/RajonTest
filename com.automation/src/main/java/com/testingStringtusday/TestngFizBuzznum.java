package com.testingStringtusday;

public class TestngFizBuzznum  {
	
public static void main(String[] args) {
//	part 1) any Num div by 3 & 5 == print FizBuzz
//	part 2) any Num div 3 ==  print Fizz Num
//	part 3) ant Num div 5 == print BUzz
	
	for ( int i=0; i<=100;  i++) { 
		
		if ( i%3==0 && i%5==0) {
			System.out.println(" this is  FiZBUZZ Number = "+i);
		}
		
		if ( i%3==0) { 
			System.out.println(" This is Fizz Number ="+i);
		
		}
		
		if ( i%5==0) { 
			System.out.println(" THis is Buzz Num"+i);
		}
	}
}

}