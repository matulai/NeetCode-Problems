class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hashM = new HashMap<>();
        hashM.put(')', '(');
        hashM.put(']', '[');
        hashM.put('}', '{');

        for(int i = 0; i < s.length(); i++) {
            if(hashM.get(s.charAt(i)) != null) {
                if(stack.isEmpty() || stack.pop() != hashM.get(s.charAt(i))) {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
