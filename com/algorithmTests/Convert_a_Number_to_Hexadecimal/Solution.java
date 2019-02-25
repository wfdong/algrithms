package algorithmTests.Convert_a_Number_to_Hexadecimal;

public class Solution {
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	System.out.println(solution.toHex(20));
    }
    
    public String toHex(int num) {
    	if (num == 0) {
            return "0";
        }
        char[] result = new char[8];
        int position = 7;
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        while (num != 0) {
            int index = num & 0xF;
            result[position--] = chars[index];
            num >>>= 4;
        }
        return new String(result, position + 1, 7 - position);
    }
    
    /*
    public String toHex(int num) {
    	
        String result = "";
        if(num==0||num==1) {
        	return num+"";
        }else if(num<0) {
        	int tmpNum = -num;
        	String binaryNum = "";
        	for(;tmpNum>=1;tmpNum=tmpNum/2) {
        		binaryNum=tmpNum%2+binaryNum;
        	}
        	int len = binaryNum.length();
        	if(len<8) {
        		for(int i=0;i<8-len;i++) {
        			binaryNum = "0"+binaryNum;
        		}
        	}
        	for(int i=0;i<binaryNum.length();i++) {
        		char tmpChar = binaryNum.charAt(i);
        		result = result + getStrFromInt(15-Integer.valueOf(tmpChar+""));
        	}
        	String chartmp = result.charAt(result.length()-1)+"";
        	int value = getIntFromStr(chartmp);
        	int carry = (value+1)/16;
        	String newResult = getStrFromInt((value+1)%16);
        	for(int i=result.length()-2;i>=0;i--) {
        		value = getIntFromStr(result.charAt(i)+"");
        		int tmp = value+carry;
        		carry = tmp/16;
        		newResult = getStrFromInt(tmp%16)+newResult;
        	}
        	return newResult;
        }else {
        	int high = num/16;
        	int low = num%16;
        	num = high;
        	do {
        		result = getStrFromInt(low)+result;
        		low = num%16;
        		high = num/16;
        		num = high;
        	}while(low!=0);
        	
        }
        return result;
    }
    
    private String getStrFromInt(int a) {
    	if(a==10) {
    		return "a";
    	}else if(a==11) {
    		return "b";
    	}else if(a==12) {
    		return "c";
    	}else if(a==13) {
    		return "d";
    	}else if(a==14) {
    		return "e";
    	}else if(a==15) {
    		return "f";
    	}else {
    		return a+"";
    	}
    }
    
    private int getIntFromStr(String chartmp) {
    	int value;
    	if(chartmp.equals("a")) {
    		value = 10;
    	}else if(chartmp.equals("b")) {
    		value = 11;
    	}else if(chartmp.equals("c")) {
    		value = 12;
    	}else if(chartmp.equals("d")) {
    		value = 13;
    	}else if(chartmp.equals("e")) {
    		value = 14;
    	}else if(chartmp.equals("f")) {
    		value = 15;
    	}else {
    		value = Integer.valueOf(chartmp);
    	}
    	return value;
    }*/
}
