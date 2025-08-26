# 100 - Best Time to Buy and Sell Stock

🔗 [LeetCode Problem Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)  
📌 Difficulty: Easy  
📚 Topic: Array / Greedy  
🖥️ Language: Java  

## 💡 Approach
- Iterate through the price array.  
- Track **minimum price** seen so far.  
- Compute **current profit** = current price − min price.  
- Update **maximum profit** dynamically.  
- Single pass → O(n) time, O(1) space.  

## ✅ Code
See `best_time_to_buy_sell_stock.java` in this folder.
