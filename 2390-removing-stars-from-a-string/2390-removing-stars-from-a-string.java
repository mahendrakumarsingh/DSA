class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
            
        }
        StringBuilder str = new StringBuilder();
        for(char c:st){
                str.append(c);
        }
        return str.toString();
    }
}