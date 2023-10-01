public class MedianTwoSorted {

      public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n1 = nums1.length;
            int n2 = nums2.length;
            if (n1 > n2)
                  return findMedianSortedArrays(nums2, nums1);
            int low = 0; // That is we don't take any element from first array
            int high = n1; // Take all elements from array one and be included
            int medianPoint = (n1 + n2 + 1) / 2;
            int n = n1 + n2;
            while (low <= high) {
                  int mid = low + ((high - low) >> 1);
                  int mid2 = medianPoint - mid;
                  int l1 = Integer.MIN_VALUE;
                  int l2 = Integer.MIN_VALUE;
                  int r1 = Integer.MAX_VALUE;
                  int r2 = Integer.MAX_VALUE;
                  if (mid < n1)
                        r1 = nums1[mid];
                  if (mid2 < n2)
                        r2 = nums2[mid2];
                  if (mid - 1 >= 0)
                        l1 = nums1[mid - 1];
                  if (mid2 - 1 >= 0)
                        l2 = nums2[mid2 - 1];
                  if (l1 <= r2 && l2 <= r1) {
                        if (n % 2 == 0)
                              return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                        return Math.max(l1, l2);
                  } else if (l1 > r2) {
                        high = mid - 1;
                  } else {
                        low = mid + 1;
                  }
            }
            return 0;
      }
      
}
