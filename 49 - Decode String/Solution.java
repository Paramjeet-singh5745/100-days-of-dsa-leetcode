class Solution {
    public String decodeString(String s) {
        Stack<Integer> stn = new Stack<>();     // for numbers
        Stack<String> st = new Stack<>();       // for strings

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                int num = 0;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num * 10 + (int) (s.charAt(i) - '0');
                    i++;
                }
                i--;
                stn.push(num);
            } 
            else if (ch != ']') {
                st.push(ch + "");   // push string
            } 
            else {
                String str = "";
                while (!st.peek().equals("[")) {
                    str = st.pop() + str;
                }

                st.pop(); // remove "["

                int repeat = stn.pop();
                StringBuilder sb = new StringBuilder("");
                while (repeat > 0) {
                    sb.append(str);
                    repeat--;
                }

                st.push(sb.toString());
            }
        }

        StringBuilder ans = new StringBuilder("");
        while (st.size() > 0) {
            ans.insert(0, st.pop());
        }
        return ans.toString();
    }
}
