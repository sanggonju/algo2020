
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[][] tmp ={{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(sol.solution(tmp));
	
	}
	public int solution(String[][] clothes) {
		int answer = 1;
		
		Map<String,Integer> clothesMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < clothes.length; i++) {
			// ���� ���� �Ǵ�. ���� ���� �� ��� Value + 1
			clothesMap.put(clothes[i][1],clothesMap.getOrDefault(clothes[i][1],0)+1);
			// 
		}
		// ����� �� üũ answer *= (�� ������ + �� ���� ���)
		for (int val : clothesMap.values()){
            answer *= (val+1);
        }
		
		
		
		//��� ���Դ� ���� ��������	
		return answer-1;
	}
}




