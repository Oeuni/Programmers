class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i+=m) {
			answer += my_string.charAt(c-1+i) + "";
		}
        return answer;
    }
}