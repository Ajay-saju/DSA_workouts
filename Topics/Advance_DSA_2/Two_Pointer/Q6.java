public class Q6 {
    public static void main(String[] args) {
        int[] arr = { 4,2,10,6,8,2,6,2 };

        System.out.println(solve(arr));
    }

    private static int solve(int[] arr) {

        int i = 0;
        int j = arr.length - 1;
        int waterLevel = Integer.MIN_VALUE;
        while (i < j) {

            int currentWaterLevel=Math.min(arr[i], arr[j])*(j-i);

            waterLevel = Math.max(waterLevel,currentWaterLevel );

            if( arr[i]<arr[j]){
                i++;
            }else if ( arr[i]>arr[j]){
                j--;
            }else{
                i++;j--;
            }

        }
        return waterLevel;

    }
}
