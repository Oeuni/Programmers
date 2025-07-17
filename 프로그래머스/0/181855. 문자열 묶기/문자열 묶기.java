import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public int solution(String[] strArr) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < strArr.length; i++) {
            list.add(0); 
        }
        
        for (int i = 0; i < strArr.length; i++) {
			int leng = strArr[i].length();
			list.set(leng, list.get(leng) + 1);
		}
        
        int answer = Collections.max(list);
        
        return answer;
    }
}