class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < indices.length; i++) {
        	sb.setCharAt(indices[i], '.');
		}
        
        answer = sb.toString().replace(".", "");
        return answer;
    }
}