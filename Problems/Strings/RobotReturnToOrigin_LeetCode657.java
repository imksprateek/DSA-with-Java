package Problems.Strings;

public class RobotReturnToOrigin_LeetCode657 {

    public static void main(String[] args) {
        System.out.println(judgeCircle("LDRRLRUULR"));
        System.out.println(judgeCircle("LRLR"));
        System.out.println(judgeCircle("LRLRUUDD"));
    }

    public static boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizontal = 0;

        for(char c : moves.toCharArray()){
            if(c == 'U'){
                vertical++;
            }
            else if(c == 'D'){
                vertical--;
            }
            else if(c == 'L'){
                horizontal--;
            }
            else if(c == 'R'){
                horizontal++;
            }
        }

        return horizontal == 0 && vertical == 0;
    }
}
