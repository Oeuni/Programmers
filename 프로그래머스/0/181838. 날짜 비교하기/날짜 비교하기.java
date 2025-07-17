class Solution {
    public int solution(int[] date1, int[] date2) {
    	String sD1 = date1[0] + "" + date1[1] + "" + date1[2];
    	String sD2 = date2[0] + "" + date2[1] + "" + date2[2];
    	
    	int iD1 = Integer.parseInt(sD1);
    	int iD2 = Integer.parseInt(sD2);
    	
		return iD1 < iD2 ? 1 : 0;
    }
}