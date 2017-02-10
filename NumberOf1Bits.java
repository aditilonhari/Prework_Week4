/*
Problem Statement : Write a function that takes an unsigned integer and returns the number of 1 bits it has.
*/
public class Solution {
    /* every time you perform the operation x & (x-1), a single 1 bit is erased */
	public int numSetBits(long a) {
	    
	    if(a == 0)
	        return 0;
	   
	    int count = 0;     
	    while (a != 0) {
            a = a & (a-1);
            count++;
        }
	    return count;
	}
}

