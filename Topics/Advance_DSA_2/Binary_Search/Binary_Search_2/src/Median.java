public class Median {
    // find median of 2 sorted array ?


    public static void main(String[] args) {
        int[] a = {7, 12, 14, 15};
        int[] b = {1, 2, 3, 4, 9, 11};
        System.out.println(findMedian(a,b));
    }

    private static int findMedian(int[] a, int[] b) {

        if( b.length < a.length ){
            return  findMedian(b,a);
        }

        int n1 = a.length;
        int n2 = b.length;

        int low = 0;
        int high= a.length;
        int maxLeftEle= (n1+n2 +1)/2;
        int median = 0;
        while( low <= high){

            int mid = low + (high-low)/2;

            int firstHalfTakenByArrayA = mid ;
            int secondHalfTakenByArrayB= maxLeftEle-mid;

            int l1 = (firstHalfTakenByArrayA != 0) ? a[firstHalfTakenByArrayA - 1] : Integer.MIN_VALUE;
            int l2 = (secondHalfTakenByArrayB != 0) ? b[secondHalfTakenByArrayB - 1] : Integer.MIN_VALUE;
            int r1 = (firstHalfTakenByArrayA != n1) ? a[firstHalfTakenByArrayA] : Integer.MAX_VALUE;
            int r2 = (secondHalfTakenByArrayB != n2) ? b[secondHalfTakenByArrayB] : Integer.MAX_VALUE;


            if( l1<= r2 && l2<=r1 ){
                // It's a valid split

                if( (n1+n2)%    2==0){

                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
                }else{
                  return   Math.max(l1,l2);
                }

            }else if ( l1> r2){
                //go to left
                high = mid-1;
            }else {
                low = mid+1;

            }

        }
        return median;
    }
}
