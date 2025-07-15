import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int num : arr) {
            list.add(num);
        }
        
        for (int i = 0; i < query.length; i++) {
			if (i % 2 == 0) {	// 짝수 인덱스 : 뒷부분 자름
				 list.subList(query[i]+1, list.size()).clear();
			}
			else {	// 홀수 : 앞부분 자름
				list.subList(0, query[i]).clear();
			}
		}

        return list.stream().mapToInt(i -> i).toArray();
    }
}