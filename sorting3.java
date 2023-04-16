public class sorting3 {
    public static void insertionSort(int[] num) {
        for (int i=1;i<num.length;i++){
            int current=num[i];
            int previous=i-1;
            //finding out the correct position to insert
            while (previous>=0 && num[previous]>current){
                num[previous+1]=num[previous];
                previous--;
            }
            //insertion
            num[previous+1]=current;

        }
    }

    public static void printArray(int[] num) {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] num={5,4,1,3,2};
        insertionSort(num);
        printArray(num);
    }
}
