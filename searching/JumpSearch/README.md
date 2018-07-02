# Jump Search

### Pros:
* In case of a very large list the direct jump to the middle can be a bad idea because we should make a large step back if the searched value is placed at the beginning of the list. But Jump search requires us to traverse back only once(Binary Search may require up to **_`O(Log n)`_**).
* In a systems where jumping back is costly, we can use Jump Search.

### Cons:
* The time complexity of Jump Search ( **_`O(√n)`_** ) is between Linear Search ( **_`(O(n)`_** ) and Binary Search ( **_`O(log n)`_** ).
* A little complicated than linear search, and is overkill for very small numbers of elements.
* Works only on lists that are sorted and kept sorted. but keeping a list sorted is not always feasible, especially if elements are constantly being added to the list.
* It's great if the list is plain array, but if it's linked-list, not so much. Depending on the cost of our comparison operation, the cost of traversing a non-random-access list could dwarf the cost of the comparisons.
