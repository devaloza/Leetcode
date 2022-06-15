class Solution {
    public int evalRPN(String[] tokens) {
        List<String> operation = Arrays.asList("+", "-", "/", "*");
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i< tokens.length; i++) {
            String s = tokens[i];
            if (!operation.contains(s)) {
                //System.out.println(s);  
                stack.push(Integer.parseInt(s));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(calculate(a,b,s));
            }
        }
        return stack.pop();
    }
    public int calculate (int a, int b, String s) {
        switch(s) {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "/":
                return a/b;
            case "*":
                return a*b;
        }
        return -1;
    }
}