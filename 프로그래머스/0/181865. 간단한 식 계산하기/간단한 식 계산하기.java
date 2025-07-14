class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String sA = "";
        int a = 0, b = 0, i = 0;
        
        while (binomial.charAt(i) != ' ') {
			sA += binomial.charAt(i);
			i++;
		}

        binomial = binomial.substring(i).trim();
        
        String op = binomial.charAt(0)+"";
        binomial = binomial.replace(op, "").trim();
        
        a = Integer.parseInt(sA);
        b = Integer.parseInt(binomial);
        
        switch (op) {
		case "+":
			answer = a + b;
			break;

		case "-":
			answer = a - b;
			break;
			
		case "*":
			answer = a * b;
			break;
		default:
			break;
		}
        return answer;
    }
}