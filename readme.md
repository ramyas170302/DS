# Two Sum II – Pair With Given Sum (GFG)

## 🧩 Problem

Given a **sorted array** of integers and a target value, find **one pair** of numbers whose sum equals the target.
Return the **indices (1-based)** of the two numbers.

---

## 📥 Example

**Input:**
arr = [1, 2, 4, 6, 10]
target = 8

**Output:**
[2, 4]

**Explanation:**
2 + 6 = 8

---

## 🚀 Approach — Two Pointer Method

Because the array is **sorted**, we can efficiently use the two-pointer technique.

### 🔹 Idea

* Start one pointer at the **beginning**
* Start another at the **end**
* Move pointers based on the sum

### 🔹 Steps

1. Initialize `left = 0`, `right = n - 1`
2. While `left < right`:

   * Compute sum = arr[left] + arr[right]
   * If sum == target → return indices
   * If sum < target → move left++
   * If sum > target → move right--

✅ Works in **O(n)** time







## 🎯 Key Points

* Array must be **sorted**
* Two pointers reduce time from O(n²) to O(n)
* Very common in interviews

---

✨ *Solved by Ramya – DSA Practice*
