# Insertion Sort

### Complexity:
 - Time complexity(Best case) - **`O(n)`**
 - Time complexity(Average and Worst case) - **`O(n^2)`**
 - Space complexity - **`O(1)`**

 ### Pros:
 * Simple implementation and Efficient for small data.
 * Adaptive: If the input list is presorted [may not be completely] then insertions sort takes **_`O(n + d)`_**, where d is the number of inversions
 * Practically more efficient than selection and bubble sorts, even though all of them have **_`O(n^2)`_** worst case complexity.
 * If every element is greater than or equal to every element to its left, the running time of insertion sort is **_`Θ(n)`_**.

 ### Cons:
 * Worst case(**_`O(n^2)`_**) occurs when for every **_i_** the inner loop has to move all elements.


:link:[For visual details look at algo visualizer](http://algo-visualizer.jasonpark.me/#path=sorting/insertion/basic)
