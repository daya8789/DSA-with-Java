package Ajit;

import java.util.*;

public class CountDigit_itr {

    public static int countDigits(long n){
        int count = 0;
        while(n != 0){
            n = n/10;
            count++;
        }
        return count;
    }
	public static void main(String[] args) {
		
		 long n = 123412;
	        System.out.println("The number of digits is : "+countDigits(n));
	}

}
