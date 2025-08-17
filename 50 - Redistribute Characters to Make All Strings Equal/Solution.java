class Solution {
    public boolean makeEqual(String[] words) {
        int [] feq=new int[26];

        for(int i=0;i<words.length;i++){
            String w=words[i];

            for(int j=0;j<w.length();j++){
                char ch=w.charAt(j);
                int idx=(int)(ch-'a');
                feq[idx]=feq[idx]+1;
            }
        }

        for(int i=0;i<26;i++){
            if(feq[i]%words.length!=0){
                return false;
            }
        }
        return true;
    }
}
