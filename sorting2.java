public class sorting2 {
    public static void selectionSort(int[] num) {
        for (int i=0;i<num.length-1;i++){
            int smallest=i;
            for (int j=i+1;j<num.length;j++){
                if (num[smallest]>num[j]){
                    smallest =j;
                }
            }
            //swap
            int temp=num[smallest];
            num[smallest]=num[i];
            num[i]=temp;
        }
    }

    public static void printArray(int[] num) {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");//1 2 3 4 5
        }
    }
    public static void main(String[] args) {
        int[] num={5,4,1,3,2};
        selectionSort(num);
        printArray(num);
    }
}
