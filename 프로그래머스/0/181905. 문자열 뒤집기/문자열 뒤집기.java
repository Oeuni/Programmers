class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String sub1 = my_string.substring(0, s);
        String sub2 = new StringBuilder(my_string.substring(s, e+1)).reverse().toString();
		String sub3 = my_string.substring(e+1);

        answer = sub1 + sub2 + sub3;
        return answer;
    }
}