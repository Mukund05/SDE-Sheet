import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Merge_Interval {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        List<int[]> list=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int[] a:intervals){
            if(end>=a[0]){
                end=Math.max(end, a[1]);
            }else{
                list.add(new int[]{start,end});
                start=a[0];
                end=a[1];
            }
        }

        list.add(new int[]{start,end});

        return list.toArray(new int[0][]);
    }
}
