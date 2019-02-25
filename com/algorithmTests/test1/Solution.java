package algorithmTests.test1;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	System.out.println(solution.getNum(6));
    	new ArrayList<String>();
    	Class[] a = new Class[] {Comparable.class};
    	Integer[] b = new Integer[] {3};
    }
    
    public int getNum(int number) {
    	if(number<=0) {
    		return 0;
    	}else if(number==1) {
    		return 1;
    	}else if(number==2) {
    		return 2;
    	}else {
    		return getNum(number-1)+getNum(number-2);
    	}
    	
    }
}
