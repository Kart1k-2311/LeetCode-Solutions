class Solution {
    public boolean judgeCircle(String s) {
        int x =0;
        int y= 0;
        for(char m : s.toCharArray()){
            if(m == 'U') x++;
             else if(m=='R') y++;
             else if(m=='L') y--;
             else if(m=='D') x--;
        }
        return x==0 && y==0;
    }
}