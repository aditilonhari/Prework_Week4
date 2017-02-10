/*
Problem Statement : Given an array of integers, every element appears twice except for one. Find that single one. (Use Bit Manipulation)
*/

public class Solution {
	/*The key to solve this problem is bit manipulation. XOR will return 1 only on two different bits. 
	So if two numbers are the same, XOR will return 0. Finally only one number left.*/
	public int singleNumber(final List<Integer> a) {
	    
	    int result = 0;
            for (int each : a) {
    		result = result ^ each;
    	    }
    	    return result;
	}
}

