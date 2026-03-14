import java.util.HashSet;

public class uniInter {
    public static void unionIntersection(int arr1[],int arr2[]){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.print("union size is: "+hs.size()+" Union is: "+hs);

        //intersection
        hs.clear();;
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        int i=0;
        while (i<arr2.length) {
            if(!hs.contains(arr2[i])){
                hs.remove(arr2[i]); //some logic issu
            }
            i++;
        }
        System.out.println("size is: "+hs.size()+" Intersetion is: "+hs);
    }
    public static void main(String[] args) {
        int arr1[]={7,9,3};
        int arr2[]={6,3,9,2,9,4};
        unionIntersection(arr1, arr2);
    }
}
