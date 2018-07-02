# Binary Search

### Complexity:
 - Time complexity - **`O(log n)`**
 - Space complexity - **`O(1)`**

### Pros:
* Much faster(**_`O(log n)`_**) comparing to linear search(**_`O(n)`_**) algorithm.
* Well known and often implemented for us as a library routine.
* For a million elements, linear search will take an 500,000 comparisons, whereas binary search will take 20.

### Cons:
* A little complicated than linear search, and is overkill for very small numbers of elements.
* Works only on lists that are sorted and kept sorted. but keeping a list sorted is not always feasible, especially if elements are constantly being added to the list.
* It's great if the list is plain array, but if it's liked-list, not so much. Depending on the cost of our comparison operation, the cost of traversing a non-random-access list could dwarf the cost of the comparisons.
