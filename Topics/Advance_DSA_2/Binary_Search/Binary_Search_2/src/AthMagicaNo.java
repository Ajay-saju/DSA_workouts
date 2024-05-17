public class AthMagicaNo {
    public static void main(String[] args) {
        System.out.println(findAthMagicalNo(5, 4, 6));
    }

    private static int findAthMagicalNo(int a, int b, int c) {

//        int min = Math.min(b,c);
        int low = Math.min(b, c);
        int high = a * Math.min(b, c);
        int ans = 0;
        int lcm = findLCM(b, c);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = (mid / b) + (mid / c) - (mid / lcm);
            if (count > a) {
                high = mid - 1;
            } else if (count < a) {
                low = mid + 1;
            }else{
                ans= mid;
                high = mid-1;
            }
        }
        return ans;
    }

    private static int findLCM(int b, int a) {
        return Math.abs(a * b) / findGCD(a, b);
    }

    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}
