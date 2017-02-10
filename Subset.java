/*
Problem Statement: Given a set of distinct integers, S, return all possible subsets
*/
public class Solution {
	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
	    
	    Collections.sort(a);     
	       
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    result.add(new ArrayList<Integer>());
	    
	    for(int i=0; i<a.size(); i++){
	        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
	        
	        for(ArrayList<Integer> list : result){
	            temp.add(new ArrayList<Integer>(list));
	        }
	        
	        for(ArrayList<Integer> list : temp){
	            list.add(a.get(i));
	        }
	        
	        result.addAll(temp);
	    }
	    
	    return result;
	}
}

