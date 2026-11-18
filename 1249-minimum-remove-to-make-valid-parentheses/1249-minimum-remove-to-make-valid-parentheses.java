class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> remove = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    remove.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            remove.add(stack.pop());
        }
        StringBuilder temprslt = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if(!remove.contains(i)){
                temprslt.append(s.charAt(i));
            }
        }
        return temprslt.toString();
    }
}