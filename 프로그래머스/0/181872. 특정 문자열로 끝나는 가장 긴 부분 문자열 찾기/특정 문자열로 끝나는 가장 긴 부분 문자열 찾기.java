class Solution {
    public String solution(String myString, String pat) {
        String answer = myString;
        StringBuilder sb = new StringBuilder(answer);
        
        while (true) {
        	if (answer.endsWith(pat)) {
            	break;
            }
            else {
            	answer = sb.deleteCharAt(sb.length() - 1).toString();
            }
        }
        return answer;
    }
}