
public class timgiatrinhonhat {
    public static int minValue(int[] array){
        int min;
        min = array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int []arr = {4,12,7,8,6,2,6};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + index);
    }
}
