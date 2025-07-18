import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String myString) {
    	String[] xArr = myString.split("x");
    	List<String> list = new ArrayList<String>();
    	
    	for (int i = 0; i < xArr.length; i++) {
			if (!xArr[i].isEmpty()) {
				list.add(xArr[i]);
			}
		}
    	
    	list.sort(String::compareTo);
    	
        String[] answer = list.toArray(new String[0]);
        
        return answer;
    }
}