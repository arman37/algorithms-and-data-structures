# Bubble Sort

:arrow_right: Works by repeatedly swapping the adjacent elements if they are in wrong order. <br />
:arrow_right: Used in a polygon filling algorithm, where bounding lines are sorted by their x coordinate at a specific scan line (a line parallel to x axis) and with incrementing y their order changes (two elements are swapped) only at intersections of two lines.<br />
:arrow_right: Known as bubble sort, because with every complete iteration the largest element in the given array, bubbles up towards the last place or the highest index, just like a water bubble rises up to the water surface.<br />

### Complexity:
 - Time complexity - **`O(n^2)`**
 - Space complexity - **`O(1)`**

### Pros:
* Can detect whether the input list is already sorted or not.

### Cons:
* Always runs **_`O(n^2)`_** time even if the array is already sorted.

:link:[For visual details look at algo visualizer](http://algo-visualizer.jasonpark.me/#path=sorting/bubble/basic)
