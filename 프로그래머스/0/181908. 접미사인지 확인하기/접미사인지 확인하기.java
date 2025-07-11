class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;

        int length = my_string.length() - is_suffix.length();
        
        if (length == 0) {
        	answer = my_string.equals(is_suffix) ? 1 : 0;
        }
        else if (length < 0) {
        	answer = 0;
        }
        else {
        	answer = my_string.substring(length).equals(is_suffix) ? 1 : 0;
        }
        return answer;
    }
}