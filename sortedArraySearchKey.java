public class sortedArraySearchKey {
    public static boolean sortedArraySearchKey(int[][] arr,int key) {
        int row=0;
        int col=arr.length-1;
        while (row<arr.length && col >=0){
            if (arr[row][col]==key){
                System.out.println("key found at index:"+"("+row+","+col+")");
                return true;
            } else if (key<arr[row][col]) {
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");//key found at index:(3,1)
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        int key=33;
        sortedArraySearchKey(arr,key);
    }
}
