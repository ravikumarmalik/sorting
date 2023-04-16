public class sorting6 {
    public static void countFreqOfNum(int[] num) {
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++){
            largest=Math.max(largest,num[i]);
            }
        int count[]=new int[largest+1];//original array
        for (int i=0;i<num.length;i++){
            count[num[i]]++;
        }
        int j=0;
        for (int i=0;i<count.length;i++){
            while (count[i]>0){
                num[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] num) {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");//1 1 2 3 3 4 4 7
        }
    }
    public static void main(String[] args) {
        int[] num={1,4,1,3,2,4,3,7};
        countFreqOfNum(num);
        printArray(num);
    }
}
