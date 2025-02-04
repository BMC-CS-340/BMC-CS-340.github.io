---
layout: default
title: "Linked List"
type: Lab
number: 03
active_tab: lab
release_date: 2025-02-04

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


In this lab, you will build two data structures to hold `City` objects: a Singly Linked List (`CitySLL`) and a Doubly Linked List (`CityDLL`).

## Objectives:

The main goals for this lab are:

1. Practice with linked lists

You will submit to Gradescope for credit.

> Notes: in this lab you are not allowed to include any `import` statements.

### Paired Programming rules
This lab is a **paired programming assignment.** What exactly does that mean? 
You will be working in pairs on the CS lab computers. Each pair will be working on one computer. One person will be the **driver** and the other person
 will be the **navigator**. Here is the rule: the **driver** controlls the lab computer, but the **driver** can only type what the **navigator** tells 
them to type. For this to work well, each pair should be constantly talking 
among themselves. After each problem, you will switch roles, the navigator will become the driver and the driver will become the navigator.


### Testing

We have provided a file called 

<a href="{{ site.url }}{{ site.baseurl }}/labs/lab03/Lab03Tests.java">
`Lab03Tests.java`
</a>
that you can use 
to test your code.
You can download it by running:

```
wget https://raw.githubusercontent.com/BMC-CS-151/BMC-CS-151.github.io/main/labs/lab03/Lab03Tests.java 
```
Compiling this file will result in errors since we haven't implemented necessary components yet. As you code, frequently compile. In general, this is a good debugging strategy.

## Exercise 1: City

Design a class `City` that represents a city. It should have instance variables to store the
following information. Include appropriate constructor, getters, setters and `toString`.
1. name of the city
2. population

Take a look at the given tests for required method signatures. 

## Exercise 2: Singly Linked List
Implement a singly linked list that stores a list of `City`s. 
Call the class `CitySLL`.

### 2.1. Node class
 Create the appropriate `Node` class that supports `CitySLL`, as a nested inner class of
`CitySLL`

### 2.2 Methods:
 Implement the following methods:
  1. `size` - determines how many `City`s are in the LinkedList
  2. `isEmpty` - determines if the LinkedList does not contain any `City`s
  3. `first` - Returns (but does not remove) the first element
  4. `last` - Returns (but does not remove) the last element
  5. `insertFirst` - Adds a new element to the front of the list
  6. `insertBack` - Adds a new element to the back of the list
  7. `toString()` - Override toString to print out a list of all stored city names

> Hint: In class we made a very barebones LinkedList where we only kept track
> of the first node. In this LinkedList, you are allowed to use private instance variables
> that can help you make these methods faster.

<!--You will be using and adding more functionality to your `ExpandableArray` in Homework02.-->

## Exercise 3: Doubly Linked List
Implement a Doubly linked list that stores a list of `City`s. 
Call the class `CityDLL`.

### 3.1 Node class
Repeat the instructions from [2.1 Node class](#21-node-class).
However, make sure that the node class supports a doubly linked list.

### 3.2 Methods:
  Implement the following methods:
   1. Repeat the instructions from [2.2 Methods](#22-methods).
   2. Implement a helper method called `insertBefore(City c, Node n)` so that you can insert a `City` c just
before some `Node` n
   3. Use `insertBefore` to implement `insertSortedAlpha(City c)` so that a `City` c is inserted
into the list in alphabetically descending sorted order. This means Albuquerque should be before Bryn Mawr which should Chicago which should be before Dallas which should be before Haverford. This method can assume the LinkedList is already sorted. Hint: use compareTo to compare strings.
   4. Use `insertBefore` to implement `insertSortedPop(City c)` so that when a `City` c is inserted into the list,
the list is sorted in order of population in ascending order. This means that a `City` with 1 person would be
before a `City` with 1,000 people which would be before a `City` with 100,000 people. This method can assume the LinkedList is already sorted.

## Testing
After compiling the test class, make sure to include the `ea` flag when running
the program:

```
java -ea Lab03Tests
```

This will ensure that all tests actually run. We are using `assert`
to test your code.
There are a total of 56 `assert` statements. Maybe of
these `assert` statements are in loops so we 
have a lot more than 56 tests!


## Wrap up

In todays lab we covered Singly and Doubly LinkedLists.

### Signing out
Once you've finished the lab, remember to submit to Gradescope for credit. The autograder will run the given tests and grade your code.


