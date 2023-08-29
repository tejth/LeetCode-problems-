public class RunningSum{

    public static int[] runFunc(int arr[]){
        int n = arr.length;
        int result[]= new int[n];
        result[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            result[i]=result[i-1]+arr[i];
        }
        return result;
    }

    public static void printArr(int arr[]){
        System.out.print("["+" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
                System.out.print("]"+" ");

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int newarr[]=runFunc(arr);
        printArr(newarr);
    }
}