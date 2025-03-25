---
layout: default
title: "Array based Binary Trees & Heaps"
type: Lab
number: 08
active_tab: lab
release_date: 2025-03-26

---

<!-- Check whether the assignment is ready to release -->
{% capture today %}{{'now' | date: '%s'}}{% endcapture %}
{% capture release_date %}{{page.release_date | date: '%s'}}{% endcapture %}
{% if release_date > today %} 
<div class="alert alert-danger">
Warning: this assignment is out of date.  It may still need to be updated for this year's class.  Check with your instructor before you start working on this assignment.
</div>
{% endif %}
<!-- End of check whether the assignment is up to date -->


<!-- Check whether the assignment is up to date -->
<!--{% capture this_year %}{{'now' | date: '%Y'}}{% endcapture %}
{% capture due_year %}{{page.due_date | date: '%Y'}}{% endcapture %}
{% if this_year != due_year %} 
<div class="alert alert-danger">
Warning: this assignment is out of date.  It may still need to be updated for this year's class.  Check with your instructor before you start working on this assignment.
</div>
{% endif %}-->
<!-- End of check whether the assignment is up to date -->



{% if page.materials %}
<div class="alert alert-info">
You can download the materials for this assignment here:
<ul>
{% for item in page.materials %}
<li><a href="{{item.url}}">{{ item.name }}</a></li>
{% endfor %}
</ul>

</div>
{% endif %}





{{page.type}} {{page.number}}: {{page.title}}
=============================================================
You will be submitting this lab to Gradescope. 

## Objectives:

The main goals for this lab are:
1. Implement binary trees as arrays
2. Get practice implementing heaps
3. Get more practice using checkstyle, JUnit, and implementing an interface

For both exercises, you can assume a max array capacity of 100 that will not need to expand. 

## Exercise 1 - ArrayBinaryTree
Download the `LabBinaryTree` interface from 
`wget https://raw.githubusercontent.com/BMC-CS-151/BMC-CS-151.github.io/main/labs/lab08/LabBinaryTree.java`


Design and implement `ArrayBinaryTree` that 
implements `LabBinaryTree`. 
Note that different from last week's lab and homework 05,
this is now an array-based binary tree. 

Also note that you only need
to implement a binary tree, not a binary search tree (in the sense that each node can have
max two children, but no ordering of any kind is enforced, between the parent/children, or
among the siblings). Think about what instance variables you will need.

**Your ArrayBinaryTree should be complete and all operations should maintain completeness**

Start with the methods `size` and `isEmpty`. 
Implement the suggested helper methods below
before moving onto `insert` and 
`toStringBreadthFirst`, 
which prints out the elements of
the binary tree in breadth first traversal order (layer-by-layer). Breadth-first traversal should be straight forward
when you have an array-based binary tree. For `insert`, make sure your tree maintains completeness post insertion. 

Create a default constructor which initializes your array and sets it to a sufficiently large capacity. 

1. `int parent(int i);` - returns the index of the parent of child stored at i
2. `int left(int i);` - returns index of left child of parent stored at i
3. `int right(int i);` returns index of right child of parent stored at i
4. `void swap(int i, int j);` - swaps the two nodes stored at indices i and j
5. `int containsIdx(E element);` - returns the index of the node containing element. If the element does not exist in the tree, return -1. 

Now, implement `insert` and `toStringBreadthFirst`. 



###  Testing
In a file called `TestArrayBinaryTree.java`,
write JUnit tests test your methods. 
Remember to thorougly test each method. 

Then, in `ArrayBinaryTree.java`,
write a main method where you create an
`ArrayBinaryTree<Integer>` object
and insert the integers 1-20 into the tree.
Use the `toStringBreadthFirst()` method
to print out the object. 

### Remove & getRootElement
Proceed with implementing `getRootElement` and `remove`. Ensure your `remove`  method maintains completeness of the binary tree. Hint: use `swap`

Make sure to add JUnit tests that sufficiently test `getRootElement` and `remove`.

## Exercise 2 - ArrayHeap
Download the `LabPriorityQueue.java` interface from 
`wget https://raw.githubusercontent.com/BMC-CS-151/BMC-CS-151.github.io/main/labs/lab08/LabPriorityQueue.java`

Implement `ArrayHeap` as a **Min** Heap that extends `ArrayBinaryTree` and 
implements `LabPriorityQueue`. Start with overriding `insert` so
that elements can be inserted in heap order. Next override `remove` so post removal, the properties of heap order are maintained. 

Proceed with implementing `peek` and `poll`

Make sure to write JUnit tests that sufficiently test the new methods
in `ArrayHeap`.

# Summary

In this lab we covered array implementations of binary trees
and binary heaps. 

### Signing out
Upload the following files to Gradescope:
1. `ArrayBinaryTree.java`
2. `TestArrayBinaryTree.java`
3. `ArrayHeap.java`
4. `TestArrayHeap.java`
