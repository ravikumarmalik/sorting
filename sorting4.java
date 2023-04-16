import java.util.Arrays;
public class sorting4 {
    public static void printArray(int[] num) {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");//1 2 3 4 5
        }
    }
    public static void main(String[] args) {
        int[] num={5,4,1,3,2};
        Arrays.sort(num);//this is inbuilt function for the sorting any unsorted arrays.
        //Arrays.sort(num,0,3);//1,4,5,3,2for sorted from 0-3 only
        printArray(num);
    }
}
