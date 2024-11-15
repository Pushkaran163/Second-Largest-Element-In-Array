# Second-Largest-Element-In-Array

## Approach : 1
###  Using Sorting – O(n*logn) Time and O(1) Space
The idea is to sort the array in non-decreasing order. Now, we know that the largest element will be at index n – 1. So, starting from index (n – 2), traverse the remaining array in reverse order. As soon as we encounter an element which is not equal to the largest element, return it as the second largest element in the array. If all the elements are equal to the largest element, return -1.

## Approach : 2
### One Pass Search – O(n) Time and O(1) Space
The idea is to keep track of the largest and second largest element while traversing the array. Initialize largest and second largest with -1. Now, for any index i,

- If arr[i] > largest, update second largest with largest and largest with arr[i].
- Else If arr[i] < largest and arr[i] > second largest, update second largest with arr[i]. 
