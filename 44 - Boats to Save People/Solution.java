class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int st=0;
        int end=people.length-1;
        Arrays.sort(people);
        int count=0;
        while(st<=end){
            if(people[st]+people[end]<=limit){
                st++;
                end--;
            }
            else{
                end--;
            }
            count++;
        }
        return count;
    }
}
