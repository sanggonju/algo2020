
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution����Ʈ�ٹ� {
	public static void main(String[] args) {
		Solution����Ʈ�ٹ� sol = new Solution����Ʈ�ٹ�();
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		System.out.println(sol.solution(genres,plays));
	
	}
	public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        //�帣�� �հ�
        Map<String,Integer> tmpMap = new HashMap<String, Integer>();
        //�帣�� 
        List<Integer> tl = new ArrayList<Integer>();
        Map<String, List<Integer>> tmpMap2 = new HashMap<String, List<Integer>>();
		for (int i = 0; i < genres.length; i++) {
			// ���� ���� �Ǵ�. ���� ���� �� ��� Value + 1
			tmpMap.put(genres[i],tmpMap.getOrDefault(genres[i],0)+plays[i]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
        return answer;
    }
}




/*
���� ����
���� ����
��Ʈ���� ����Ʈ���� �帣 ���� ���� ���� ����� �뷡�� �� ���� ��� ����Ʈ �ٹ��� ����Ϸ� �մϴ�. �뷡�� ���� ��ȣ�� �����ϸ�, �뷡�� �����ϴ� ������ ������ �����ϴ�.

���� �뷡�� ���� ����� �帣�� ���� �����մϴ�.
�帣 ������ ���� ����� �뷡�� ���� �����մϴ�.
�帣 ������ ��� Ƚ���� ���� �뷡 �߿����� ���� ��ȣ�� ���� �뷡�� ���� �����մϴ�.
�뷡�� �帣�� ��Ÿ���� ���ڿ� �迭 genres�� �뷡�� ��� Ƚ���� ��Ÿ���� ���� �迭 plays�� �־��� ��, ����Ʈ �ٹ��� �� �뷡�� ���� ��ȣ�� ������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���ѻ���
genres[i]�� ������ȣ�� i�� �뷡�� �帣�Դϴ�.
plays[i]�� ������ȣ�� i�� �뷡�� ����� Ƚ���Դϴ�.
genres�� plays�� ���̴� ������, �̴� 1 �̻� 10,000 �����Դϴ�.
�帣 ������ 100�� �̸��Դϴ�.
�帣�� ���� ���� �ϳ����, �ϳ��� � �����մϴ�.
��� �帣�� ����� Ƚ���� �ٸ��ϴ�.
����� ��
genres	plays	return
[classic, pop, classic, classic, pop]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
����� �� ����
classic �帣�� 1,450ȸ ����Ǿ�����, classic �뷡�� ������ �����ϴ�.

���� ��ȣ 3: 800ȸ ���
���� ��ȣ 0: 500ȸ ���
���� ��ȣ 2: 150ȸ ���
pop �帣�� 3,100ȸ ����Ǿ�����, pop �뷡�� ������ �����ϴ�.

���� ��ȣ 4: 2,500ȸ ���
���� ��ȣ 1: 600ȸ ���
���� pop �帣�� [4, 1]�� �뷡�� ����, classic �帣�� [3, 0]�� �뷡�� �״����� �����մϴ�.
 */