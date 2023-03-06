import java.util.HashSet;

class longSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hm=new HashSet<>();
        int lss=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            char str=s.charAt(i);
            if(hm.contains(str)){
                while(left<i && hm.contains(str)){
                    hm.remove(s.charAt(left));
                    left++;
                }
            }
            hm.add(str);
            lss=Math.max(lss,i-left+1);
        }
        return lss;
    }
}
