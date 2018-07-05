# QuickSort

:arrow_right: key process is **_`partition()`_**. <br />
:arrow_right: Divide/partition step does all the heavy lifting, combine step does absolutely nothing.<br />
:arrow_right: Works in place And worst-case running time is as bad as selection sort's and insertion sort's: **`O(n^2)`**.
:arrow_right: Outperforms selection sort, insertion sort and merge sort in practice.

### Complexity:
 - Time complexity(Average and Best case) - **`O(nlogn)`**
 - Time complexity(Worst case) - **`O(n^2)`**
 - Space complexity - **`O(1)`**

 ### Pros:
 * In-place sort (requires no additional storage space).
 * Better than other sorting algorithms with same asymptotic complexity **`O(nlogn)`** (merge sort, heap sort).
 * Cache performance is higher than other sorting algorithms because of its in-place characteristic.

 ### Cons:
 * Unstable, heavily decreases in speed down to **`O(n2)`** in the case of unsuccessful pivot selections.
 * Lame implementation of the algorithm may result in stack overflow error, since it may require **`O(n)`** embedded recursive calls.
 * Nearly as bad if the dataset is not very diverse as ell (eg. All 1s and 2s) as it will lead to very unbalanced partitions.
