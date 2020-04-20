
import java.util.HashMap;
import java.util.Map;

public class Solution���� {
	public static void main(String[] args) {
		Solution���� sol = new Solution����();
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




/*
���� ����
�����̵��� ���� �ٸ� ���� �����Ͽ� �Ծ� �ڽ��� �����մϴ�.

���� ��� �����̰� ���� ���� �Ʒ��� ���� ���� �����̰� ���׶� �Ȱ�, �� ��Ʈ, �Ķ��� Ƽ������ �Ծ��ٸ� �������� û������ �߰��� �԰ų� ���׶� �Ȱ� ��� ���� ���۶󽺸� �����ϰų� �ؾ� �մϴ�.

����	�̸�
��	���׶� �Ȱ�, ���� ���۶�
����	�Ķ��� Ƽ����
����	û����
�ѿ�	�� ��Ʈ
�����̰� ���� �ǻ���� ��� 2���� �迭 clothes�� �־��� �� ���� �ٸ� ���� ������ ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
clothes�� �� ���� [�ǻ��� �̸�, �ǻ��� ����]�� �̷���� �ֽ��ϴ�.
�����̰� ���� �ǻ��� ���� 1�� �̻� 30�� �����Դϴ�.
���� �̸��� ���� �ǻ��� �������� �ʽ��ϴ�.
clothes�� ��� ���Ҵ� ���ڿ��� �̷���� �ֽ��ϴ�.
��� ���ڿ��� ���̴� 1 �̻� 20 ������ �ڿ����̰� ���ĺ� �ҹ��� �Ǵ� '_' �θ� �̷���� �ֽ��ϴ�.
�����̴� �Ϸ翡 �ּ� �� ���� �ǻ��� �Խ��ϴ�.
����� ��
clothes	return
[[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]]	5
[[crow_mask, face], [blue_sunglasses, face], [smoky_makeup, face]]	3
����� �� ����
���� #1
headgear�� �ش��ϴ� �ǻ��� yellow_hat, green_turban�̰� eyewear�� �ش��ϴ� �ǻ��� blue_sunglasses�̹Ƿ� �Ʒ��� ���� 5���� ������ �����մϴ�.

1. yellow_hat
2. blue_sunglasses
3. green_turban
4. yellow_hat + blue_sunglasses
5. green_turban + blue_sunglasses
���� #2
face�� �ش��ϴ� �ǻ��� crow_mask, blue_sunglasses, smoky_makeup�̹Ƿ� �Ʒ��� ���� 3���� ������ �����մϴ�.

1. crow_mask
2. blue_sunglasses
3. smoky_makeup
 */