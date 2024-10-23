---
layout: default
title: "Binary Trees"
type: Lab
number: 07
active_tab: lab
release_date: 2024-10-23

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
1. Get practice with binary trees
1. Get more practice using checkstyle, JUnit, and implementing an interface

## Exercise 1 - LinkedBinaryTree (Binary Search Tree) 

Download the `LabBinaryTree` interface from  
`wget https://raw.githubusercontent.com/BMC-CS-151/BMC-CS-151.github.io/main/labs/lab07/LabBinaryTree.java`. 

Implement a `LinkedBinaryTree` that implements `LabBinaryTree`.
Start with the methods `size`, `isEmpty`, `insert`,
and `toString`, which creates a string representation
of the tree by traversing through the nodes
of the binary tree in in-order traversal order. 
`insert` allows you to add to the tree and `toString()` allows
you to check the contents of your tree.   
`size` returns the number of nodes in the tree. 

The tree should be a Binary Search Tree. It should maintain the BST properties we discussed in class:
At each node with value k:  
- Left subtree contains only nodes with value lesser than k   
- Right subtree contains only nodes with value greater than k
- Both subtrees are a binary search tree

Hint: you may find it useful to use private helper methods that are called from the publicly defined method in the interface.

Note that the interface requires that all listed methods be 
implemented, but for now you can just implement method stubs for 
the remaining methods
and come back to them later in the lab.

## Exercise 2 - Testing
In a file called `TestLinkedBinaryTree.java`,
write JUnit tests test your methods. 
Remember to thorougly test each method. 

You won't submit this file for a grade, but you should still write tests to refine the specification and check your code for correctness.

## Exercise 3 - `contains` and `height`
Proceed with implementing and testing `contains` and `height`.
The height of a tree with no root should be -1.
Then, write JUnit tests in `TestLinkedBinaryTree.java` to 
make sure they work correctly.


# Summary

In this lab we covered binary trees. You gained more experiece using
checkstyle, unit testing, and implementing an interface.

### Signing out
You do not need to be signed out by a TA for this lab. You will be submitting your code on Gradescope as part of HW05.
