import java.util.Arrays;
import java.util.Collections;
public class sorting5 {
    public static void printArray(Integer[] num) {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer[] num={1,2,3,4,5};
        //Arrays.sort(num, Collections.reverseOrder());//5 4 3 2 1 reverseOrder function works on object that's why I created (Integer) as object
        Arrays.sort(num,0,3, Collections.reverseOrder());//3 2 1 4 5
        printArray(num);
    }
}
