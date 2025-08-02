class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while (numBottles >= numExchange) {
            int newBottle = numBottles / numExchange; //New Bottles
            int remainBottle = numBottles % numExchange; //Remaining Botttle

            ans = ans + newBottle;
            numBottles = newBottle + remainBottle;
        }
        return ans;
    }
}

