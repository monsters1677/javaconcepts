package Arrays;

public class TwoDimensional {
    public static void main(String[] args){
        int[][] marks={{54,60,35},{22,30,56},{24,58,42}};
        for(int i=0;i<marks.length;i++){
            for (int h=0;h<marks.length;h++){
                System.out.print(marks[i][h]+" ");
            }
        }
    }
}
