public class LoopProgram {
    public static void main(String[] args){
        int[] arr = {5,3,6,8,2,1};
        int max = arr[0];
        int min = arr[0];

        for(int num : arr){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("Maximum in array is: "+max);
        System.out.println("Minimum in array is: "+min);
    }
}
