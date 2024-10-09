---
layout: default
title: "ArrayLists & Iterators"
type: Lab
number: 06
active_tab: lab
release_date: 2024-10-09
due_date: 2024-10-20 23:59:00EDT
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
Note, you will be submitting this lab to Gradescope. It will be due Thursday Feb 29. 

## Objectives:

The main goals for this lab are:
1. Get practice with iterators
1. Understand why iterators are useful
1. Get more practice using checkstyle, JUnit, and implementing an interface


### Paired Programming rules
This lab is a **paired programming assignment.** What exactly does that mean? 
You will be working in pairs on the CS lab computers. Each pair will be working on one computer. One person will be the **driver** and the other person
 will be the **navigator**. Here is the rule: the **driver** controlls the lab computer, but the **driver** can only type what the **navigator** tells 
them to type. For this to work well, each pair should be constantly talking 
among themselves. After each problem, you will switch roles, the navigator will become the driver and the driver will become the navigator.

## Exercise 1 - Iterator

Download List.java and ArrayList.java from:
`wget https://raw.githubusercontent.com/BMC-CS-151/BMC-CS-151.github.io/main/labs/lab06/ArrayList.java`
`wget https://raw.githubusercontent.com/BMC-CS-151/BMC-CS-151.github.io/main/labs/lab06/List.java`


As we covered briefly in class, the inner class `ArrayIterator` lets us create iterators 
over elements of the `ArrayList`.
Specifically, the method `iterator()` creates and returns an `Iterator`. Study this class before
you continue.

### Task 1.1 - Checkstyle
Run checkstyle on these 2 java files. `List.java` should pass successfully but 
`ArrayList.java` should have 21 errors. Fix these errors.

> We included these specific checkstyle errors on purpose. 
> These errors force you to see the difference between 
> clean and unclean code. 3 of these errors also remind you
> about the difference between primitives and objects.
> These errors are easy (and should be quick) to fix.

If you don't remember how to run checkstyle, refer to your previous lab. 

### Task 1.2 - Testing `iterator()`

In a new file called `TestIterator.java`, write JUnit tests
that test the `ArrayIterator`. You must test each of the 
three `ArrayIterator` methods. 


In class we used just `Assert.assertTrue`. You can use
other types of asserts. See the 
documentation for `Assert`: <a href="https://junit.org/junit4/javadoc/latest/org/junit/Assert.html">https://junit.org/junit4/javadoc/latest/org/junit/Assert.html</a>

Make sure that 
you test that all of the `Exceptions` are thrown when
they should be. To test if an exception is throw, you 
should use`Assert.assertThrows`:
 <a href="https://junit.org/junit4/javadoc/latest/org/junit/Assert.html#assertThrows(java.lang.Class,%20org.junit.function.ThrowingRunnable)">"https://junit.org/junit4/javadoc/latest/org/junit/Assert.html#assertThrows(java.lang.Class,%20org.junit.function.ThrowingRunnable)"</a>


## Exercise 2 - MyIterator
Download MyIterator.java from:
`wget https://raw.githubusercontent.com/BMC-CS-151/BMC-CS-151.github.io/main/labs/lab06/MyIterator.java`

The `ArrayIterator` only traverses the iterator from the front to back.
`MyIterator` is a fancy `Iterator` interface that enables forwards
and backwards traversals.
`next()`, `hasNext()` methods are the same as in
`ArrayIterator` and `remove()` is very similiar. But it has additional methods specified
in the following sections. 

Add a second iterator class within the `ArrayList` class called
`MyListIterator` that implements `MyIterator`. This iterator will be used to traverse the list
in both forward and backward direction. next(), hasNext() methods are the same as in
ArrayIterator and remove() is very similiar. But it has additional methods as specified
below:

### 2.1 `boolean hasNext()`
Returns true if this list iterator has more elements when traversing
the list in the forward direction. (In other words, returns true if `next()` would return
an element rather than throwing an exception.)

### 2.2 `E next()`
Returns the next element in the list and advances the cursor position. It
throws `NoSuchElementException` if the iteration has no next element. This method may
be called repeatedly to iterate through the list, or intermixed with calls to `previous()`
to go back and forth. (Note that alternating calls to next and previous will return the
same element repeatedly.)

### 2.3 `boolean hasPrevious()`
 Returns true if this list iterator has more elements when
traversing the list in the backward direction. (In other words, returns true if `previous()`
would return an element rather than throwing an exception.)

### 2.4 `E previous()`
 Returns the previous element in the list and moves the cursor position
 backwards. It throws `NoSuchElementException` if the iteration has no previous 
element. This method may be called repeatedly to iterate through the list backwards, or
intermixed with calls to `next()` to go back and forth. (Note that alternating calls to
next and previous will return the same element repeatedly.)

### 2.5 `void remove()`
 Removes from the list the last element that was returned by `next()`
or `previous()`. This call can only be made once per call to next or previous. This
method throws `IllegalStateException` if neither next nor previous have been called,
or remove has already been called after the last call to next or previous. Refer to the
`remove()` method in ArrayIterator which is very similiar.

### 2.6 `void set(E e)`
 Replaces the last element returned by `next()` or `previous()` with the
specified element. This call can be made only if `remove()` has not been called after the
last call to next or previous. This method throws `IllegalStateException` if neither
next nor previous have been called, or remove has been called after the last call to
next or previous.

## Exercise 3- Incorporating `MyListIterator` in `ArrayList`

### 3.1 
Add in your `ArrayList` class two methods `myListIterator()` and `myListIterator(int i)`
that will make an instance of `MyListIterator` and position it at the beginning of the list,
and position it right before the i-th index, respectively. These methods should return `MyListIterator`. These methods are similar to the
`iterator()` method. Note that indices start with 0. 

### 3.2 Testing `MyListIterator`
In a new file called `TestMyListIterator.java`, write JUnit tests
that test the methods in `MyListIterator`.

## Exercise 4- `removePositions`
In `ArrayList`, implement a `static` method
called `removePositions` that takes in two `ArrayList`s, `L` and `P`, ArrayList
and removes the elements in `L` that are in
positions specified by `P`.

Your method signature should be as follows:
`public static <E> void removePositions(ArrayList<E> L, ArrayList<Integer> P)`


Positions start with `0`. For instance, if `L` contains `[3, 10, 8, 5, 12, 67, 25, 22]`
and `P` contains `[1, 3, 4, 6]`, the elements at index 1, 3, 4 and 6 in `L` should be removed, resulting
in `L=[3, 8, 67, 22]`. You must use your `MyListIterator` to implement `removePositions` - this
is not because of purely pedagogical reasons. Removing multiple items from an `ArrayList`
is tricky because of the index shifting. Using an iterator will make your life a lot easier. You
may assume `P` only contains valid indices of `L`, sorted in ascending order.

### 4.1 Testing `removePositions`
In a new file called `TestRemovePositions`, create at least 10 unit tests
that demonstrate that `removePositions` work currently. Make sure to include
edge cases in your tests.


# Summary

In this lab we covered iterators. You gained more experiece using
checkstyle, unit testing, and implementing an interface.

### Signing out
You do not need to be signed out by a TA for this lab. You will be submitting
your code on Gradescope as part of HW04.

Files to submit include:
- `ArrayList.java`
- `List.java`
- `MyIterator.java`
- `TestIterator.java`
- `TestMyListIterator.java`
- `TestRemovePositions.java`
