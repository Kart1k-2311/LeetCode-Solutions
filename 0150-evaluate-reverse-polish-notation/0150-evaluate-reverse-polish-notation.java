
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String i : tokens) {
            if(i.equals("*") || i.equals("+") || i.equals("-") || i.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                if(i.equals("*")) {
                    stack.push(a * b);
                } else if(i.equals("+")) {
                    stack.push(a + b);
                } else if(i.equals("-")) {
                    stack.push(a - b);
                } else {
                    stack.push(a / b);
                }

            } else {
                stack.push(Integer.parseInt(i));
            }
        }

        return stack.pop();
    }
}
