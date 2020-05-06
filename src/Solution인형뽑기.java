import java.util.Stack;

public class Solution인형뽑기 {

    public static void main(String[] args) {
        Solution인형뽑기 sol = new Solution인형뽑기();
        int[][] board = {{0,0,0,0,0}
                        ,{0,0,1,0,3}
                        ,{0,2,5,0,1}
                        ,{4,2,4,4,2}
                        ,{3,5,1,3,1}};

        int[] move = {1,5,3,5,1,2,1,4};
        int result = Solution인형뽑기.solution(board, move);
        System.out.println(result);
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int boardSize = board.length;
        Stack<Integer> basket = new Stack<Integer>();
        for (int i = 0; i < moves.length; i++){
            System.out.print("col::"+moves[i]+"::::");
            for (int j = 0; j<boardSize; j ++){
                int row = j;
                int col = moves[i]-1;
                System.out.print(board[row][col]);
                if(board[row][col]>0){
                    if(basket.isEmpty()){
                        basket.push(board[row][col]);
                    }else{
                        if(basket.peek()!= board[row][col]){
                            basket.push(board[row][col]);
                        }else{
                            basket.pop();
                            answer++;
                        }
                    }
                    System.out.println(basket.toString());
                    board[row][col] = 0;
                    break;
                }else{
                    continue;
                }
            }
            System.out.println();
        }
        //확인차
        for (int[] s: board
             ) {
            for (int a: s){
                System.out.print(a);
            }
            System.out.println();
        }
        //
        return answer;
    }

}
