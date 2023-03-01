import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        List<List<Integer>> list=generate(5);
        System.out.println(list);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) l.add(1);
                else{
                    l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(l);
        }
        return list;
    }
}
