class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int balance = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                balance ++;
                if(balance > 1){
                    st.push(ch);
                }
            }
            else if(ch == ')'){
                balance --;
                if(balance > 0){
                    st.push(ch);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}