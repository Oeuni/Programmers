import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
    	List<Integer> list = new ArrayList<Integer>();
    	
        
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
			list.add(arr[i]);
		}

        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
        	list.add(arr[i]);
		}
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}