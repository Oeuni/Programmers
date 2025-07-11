class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        for (int i = 0; i < code.length(); i++) {
        	int x = i % q;
			if (x == r) {
				answer += code.charAt(i);
			}
		}
        return answer;
    }
}