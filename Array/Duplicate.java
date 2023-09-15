public class Duplicate {
    public static boolean dupEle(int arr[]){
        int len = arr.length;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr[i]==arr[j]){
                   return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5,7, 4};
        System.out.println(dupEle(arr));
    }
}
