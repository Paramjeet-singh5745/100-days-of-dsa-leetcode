# 64 - Add Two Numbers

🔗 [LeetCode Problem Link](https://leetcode.com/problems/add-two-numbers/)  
📌 Difficulty: Medium  
📚 Topic: Linked List  
🖥️ Language: Java  

## 💡 Approach
1. Initialize a dummy head node and a `current` pointer.  
2. Traverse both lists simultaneously, summing their values along with `carry`.  
3. Create a new node for `(sum % 10)` and attach it to the result list.  
4. Update `carry = sum / 10`.  
5. Continue until both lists are exhausted and no carry remains.  

## ⏱️ Complexity
- **Time:** O(max(m, n)) → where m and n are the lengths of the two lists.  
- **Space:** O(max(m, n)) for the output list.  

## ✅ Code
See `add_two_numbers.java` in this folder.
