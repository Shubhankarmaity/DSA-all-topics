public class test2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                if(nums1[i]!=0){
                    nums1[i]=nums1[i];
                    i++;
                }
            }
            else{
                if(nums1[i]!=0){
                    nums1[m]=nums1[i];
                    nums1[i]=nums2[j];
                    j++;
                    m++;
                }
                else{
                    nums1[i]=nums2[j];
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.print(nums1);
    }
}