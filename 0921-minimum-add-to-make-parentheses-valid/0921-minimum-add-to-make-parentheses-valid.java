class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count =0;
        for(char i : s.toCharArray()){
            if( i == '('){
                stack.push(i);
            } else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    count+=1;
                }
            }
        }
        return count + stack.size();
    }
}