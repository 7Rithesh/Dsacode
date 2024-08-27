package BitManipulation;
public class FindTheUniqueNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,1,3,5};
        System.out.println(FindTheUniqueNumber(arr));
    }
    static int FindTheUniqueNumber(int [] arr)
    {
       int unique = 0;
//        for (int n : arr) {
//            unique = unique ^ n;
//        }
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }
}
