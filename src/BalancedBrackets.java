public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        if (s == null) {
            return true;
        }

        BracketStack stack = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char topChar = stack.pop();

                switch (ch) {
                    case ')':
                        if (topChar != '(') return false;
                        break;
                    case '}':
                        if (topChar != '{') return false;
                        break;
                    case ']':
                        if (topChar != '[') return false;
                        break;
                }
            }
        }

        return stack.isEmpty();
    }
    public static boolean isMatchingPair(char op, char cl){
        if (op == '(' && cl == ')') return true;
        if (op == '[' && cl == ']') return true;
        if (op == '{' && cl == '}') return true;
        return false;
    }
}
