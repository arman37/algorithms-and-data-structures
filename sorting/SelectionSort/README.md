# Selection Sort

:arrow_right: Sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. <br />
:arrow_right: selection is made based on keys and swaps are made only when required.  <br />
:arrow_right: To find the minimum element from the array of  elements, (**`N - 1`**) comparisons are required. Therefore **_`(N - 1) + (N - 2) + ...... + 1 = (N.(N - 1))/2`_** comparisons and **N** swaps result in the overall complexity of **`O(n^2)`** <br />

### Complexity:
 - Time complexity - **`O(n^2)`**
 - Space complexity - **`O(1)`**

### Pros:
* In-place sort (requires no additional storage space).
* Never makes more than **_`O(n)`_** swaps and can be useful when memory write is a costly operation.
* Useful for sorting the files with very large values and small keys.

### Cons:
* Doesn’t scale well: **_`O(n^2)`_**

[For visual details look at algo visualizer](http://algo-visualizer.jasonpark.me/#path=sorting/selection/basic)
