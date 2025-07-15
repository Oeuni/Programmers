class Solution {
    public int[] solution(int[] arr) {
        int f = 0;
        int e = arr.length-1;
        int f2 = -1, e2 = -1;
        
        while (f <= e) {
        	if (arr[f] == 2 && f2 == -1) {
        		f2 = f;
        	}
        	if (arr[e] == 2 && e2 == -1) {
        		e2 = e;
        	}
        	f++;
        	e--;
        }
        
        int[] answer = {};

        if (f2 == -1 && e2 == -1) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        else if (f2 == -1 || e2 == -1) {
        	answer = new int[1];
        	answer[0] = 2;
        }
        else {
        	answer = new int[e2-f2+1];
        	for (int i = 0; i < answer.length; i++) {
				answer[i] = arr[f2+i];
			}
        }
        return answer;
    }
}