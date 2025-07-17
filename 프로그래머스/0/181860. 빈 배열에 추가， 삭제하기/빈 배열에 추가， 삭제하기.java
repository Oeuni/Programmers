import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < flag.length; i++) {
			if (flag[i]) {
				for (int j = 0; j < arr[i]*2; j++) {
					list.add(arr[i]);
				}
			}
			else {
				list.subList(list.size()-arr[i], list.size()).clear();
			}
		}
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}