//Assignment 02
//Name: Tu Luan
//E-mail: tluan@brynmawr.edu
//Course: Cs206  Professor Cooper's section
//Submitted: 09/15/2015
//Goal:build isPrime class to find out all prime number in 1-100

public class isPrime {
		
    public static void main(String[]args) {
	//since we all know 1 is not regarded as a prime number, I start from
	//2 here.
	//since 100 is contained, I used 101 as its end point.
	for(int a=2;a<101;a++){
	    if (a==2){
		System.out.println(a);
	    }
	    //2 is an exception here so I print it seperately 


	    //print out all the numbers when they are tested as prime numbers
	    //by using  the testPrime method defined below.
	    else if(testPrime(a)==true){
		System.out.println(a);
	    }
              
	}
    }



    //set a testPrime class to test if the number is prime
    public static boolean testPrime(int n){
	//start from 2(included) to itself(excluded), test if it can be factored
	//into other numbers expect 1 and itself. If yes, then it is not a prime        // number, then return false 
	for(int i=2;i<n;i++){
	    if( n%i==0){
		return false;
	    }
	}
	//after the factor test, if it still not return false, then return true
	//to consider it as a prime number
	return true;
    }

    
}
