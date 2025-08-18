class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int k=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=k;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int [] temp=matrix[i];

            reverse(temp);
        }
        return ;
    }

    public static void reverse(int [] arr){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int a=arr[st];
            arr[st]=arr[end];
            arr[end]=a;
            st++;
            end--;
        }
    }
}
