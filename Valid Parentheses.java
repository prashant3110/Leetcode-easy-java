class Solution {
    public boolean isValid(String s) {

        Stack st = new Stack();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
           else {
                // FAIL FAST: If we see a closer but stack is empty, it's invalid
                if(st.isEmpty()) return false; 
                
                // Match check (Notice !st.isEmpty is handled above)
                if((ch == ')' && (char)st.peek() == '(') ||
                   (ch == '}' && (char)st.peek() == '{') ||
                   (ch == ']' && (char)st.peek() == '[')) {
                    st.pop();
                } else {
                    // FAIL FAST: Mismatched bracket found
                    return false; 
                }
            }
        }
        return st.isEmpty();
}}
