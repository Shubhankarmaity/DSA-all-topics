import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class tripletsSort {

    public static List<List<Integer>> threeSum (int num[]){
        int n=num.length;
        List<List<Integer>> result =  new ArrayList <List<Integer>> ();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(num[i]+num[j]+num[k]==0){
                        List<Integer> triplet=new ArrayList<Integer>();
                        triplet.add(num[i]);
                        triplet.add(num[j]);
                        triplet.add(num[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }       
                }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
        return result;
    }
    
    public static void main(String[] args) {
        int num[]={-1,0,1,2,-1,-4};
        System.out.println(threeSum(num));
    }
}
