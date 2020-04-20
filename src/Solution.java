
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
			// 종류 여부 판단. 같은 종류 일 경우 Value + 1
			clothesMap.put(clothes[i][1],clothesMap.getOrDefault(clothes[i][1],0)+1);
			// 
		}
		// 경우의 수 체크 answer *= (옷 가지수 + 안 입을 경우)
		for (int val : clothesMap.values()){
            answer *= (val+1);
        }
		
		
		
		//모두 안입는 경우는 없음으료	
		return answer-1;
	}
}




