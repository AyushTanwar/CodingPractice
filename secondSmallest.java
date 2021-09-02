public class Main {
    public static void main(String args[]) {
        int []arr = {4,8,1, 9, 2, 2, 1};
        int first = Integer.MAX_VALUE, second =  Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<= first){
                second = first;
                first = arr[i];
            }else if(arr[i]<=second){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
