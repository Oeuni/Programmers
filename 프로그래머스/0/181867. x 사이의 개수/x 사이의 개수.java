class Solution {
    public int[] solution(String myString) {
    	String[] xSplit = myString.split("x");
    	
    	int[] answer = new int[xSplit.length];
    	
    	if (myString.endsWith("x")) {
    		answer = new int[xSplit.length+1];
    	}
    	
    	for (int i = 0; i < xSplit.length; i++) {
			answer[i] = xSplit[i].length();
		}
        return answer;
    }
}