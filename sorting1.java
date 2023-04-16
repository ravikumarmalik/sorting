//bubble sort
public class sorting1 {
    public static void bubbleSort(int[] num) {
        //count no's of turns
        for (int turn=0;turn<num.length-1;turn++){
            for (int j=0;j<num.length-1-turn;j++){
                if (num[j]>num[j+1]){
                    //swap
                    int tmp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tmp;
                }
            }
        }
    }
    public static void printNum(int[] num) {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] num={5,4,1,3,2};
        bubbleSort(num);
        printNum(num);
    }
}
