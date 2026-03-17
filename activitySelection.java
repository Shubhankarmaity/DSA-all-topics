import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelection {
    
    public static void main(String[] args) {
        int start[]={1,2,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //for sorting the end array
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //labda function for sorting the 2D array specific column
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        int maxAct=0;
        ArrayList<Integer> arr=new ArrayList<>();

        //add first element
        maxAct=1;
        arr.add(activities[0][0]);
        int lastEnd=activities[0][2];

        //for other element
        for(int i=0;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                arr.add(activities[i][0]); 
                lastEnd=activities[i][2];
            }
        }
        System.out.println("max activity is "+maxAct);
        for(int i=0;i<arr.size();i++){
            System.out.print("A"+arr.get(i)+" ");
        }
        System.out.println();
    }
}
