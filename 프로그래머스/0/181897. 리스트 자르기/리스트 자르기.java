import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<Integer>();
        for (int num : num_list) {
            list.add(num);
        }
        
        switch (n) {
		case 1:
			list = list.subList(0, slicer[1]+1);
			break;
			
		case 2:
			list = list.subList(slicer[0], list.size());
			break;
			
		case 3:
			list = list.subList(slicer[0], slicer[1]+1);
			break;
			
		case 4:
			list.clear();
			for (int i = slicer[0]; i <= slicer[1]; i+=slicer[2]) {
				list.add(num_list[i]);
			}
			break;

		default:
			break;
		}

        return list.stream().mapToInt(i -> i).toArray();
    }
}
