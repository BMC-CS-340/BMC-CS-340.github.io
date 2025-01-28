---
layout: default
title: "Inheritance & ExpandableArray"
type: Lab
number: 02
active_tab: lab
release_date: 2025-01-27
due_date: 2025-02-07
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

## Objectives:

The main goals for this lab are:

1. Review inheritance
1. Implement your first data structure - a self expanding array

This lab will be submitted and autograded on Gradescope.

> Notes: in this lab you are not allowed to include any `import` statements other than `import java.lang.IndexOutOfBoundsException`

### Paired Programming rules
This lab is a **paired programming assignment.** What exactly does that mean? 
You will be working in pairs on the CS lab computers. Each pair will be working on one computer. One person will be the **driver** and the other person
 will be the **navigator**. Here is the rule: the **driver** controlls the lab computer, but the **driver** can only type what the **navigator** tells 
them to type. For this to work well, each pair should be constantly talking 
among themselves. After each problem, you will switch roles, the navigator will become the driver and the driver will become the navigator.

## Exercise 1: Inheritance

You will design all the necessary classes in order to make the following driver program
work properly and produce the given expected output (we have broken down the step below). 


``` java
public static void main(String[] args){
    Mammal[] mammals = new Mammal[4];
    mammals[0] = new Dolphin();
    mammals[1] = new Platypus();
    mammals[2] = new Human();
    mammals[3] = new CSStudent();

    for (int i=0; i< mammals.length; i++){
        System.out.print("Generally, a " + mammals[i].getName());
        System.out.print(" can be found ");
        if(mammals[i].livesInWater() == false){
            System.out.print("on land, ");
        }
        else {
            System.out.print("in water, ");
        }

        System.out.print("it can ");
        if(mammals[i].laysEggs() == false) {
            System.out.print("not ");
        }
        System.out.print("lay eggs, and is often overheard saying'");
        mammals[i].speak();
        System.out.println("'");
    }
}
```

Will produce the following output:
```
Generally, a Dolphin can be found in water, it can not lay eggs, and is often overheard saying 'ak, ak, ak, ak'
Generally, a Platypus can be found in water, it can lay eggs, and is often overheard saying 'errrr'
Generally, a Human can be found on land, it can not lay eggs, and is often overheard saying 'I'll take a grande latte with a double-shot of espresso'
Generally, a CSStudent can be found on land, it can not lay eggs, and is often overheard saying 'I love programming!'
```

Make sure that each class is declared `public` and stored
in their own files.

#### 1.1 Mammal class

Design a `Mammal` class with the following:

- two `private String` variables named `name` and `sound`
- a value constructor that initializes the two variables
- getters of the two instance variables
- a `void` method named `speak()` that prints the object's `sound`
- a `boolean` method named `laysEggs()`
- a `boolean` method named `livesInWater()`

#### 1.2 Dolphin class

Design a `Dolphin` class that inherits from the `Mammal` class. 
As seen in the Driver code, it should include a constructor that takes no arguments.
Override methods as appropriate

#### 1.3 Platypus class

Design a `Platypus` class that inherits from the `Mammal` class. 
As seen in the Driver code, it should include a constructor that takes no arguments.

#### 1.4 Human class

Design a `Human` class that inherits from the `Mammal` class. 
As seen in the Driver code, it should include a constructor that takes no arguments.
Override methods as appropriate

#### 1.5 CSStudent class

Design a `CSStudent` class that inherits from the `Human` class. 
Override methods as appropriate

Before moving on in this lab, run the Driver program and make sure
the output is correct.

=======
As seen in the Driver code, it should include a constructor that takes no arguments.
Override methods as appropriate

<details><summary><b style="color:DodgerBlue;">CLICK HERE FOR A HINT</b></summary>
Some classes may need more than one constructor.
</details>


Before moving on in this lab, submit your code to gradescope to make sure
the output is correct.


## Exercise 2: ExpandableArray

Working with arrays are great, we can easily access
data from an array and insert data into an array. 
Just give me the index, and accessing and inserting
data is easy!

But, what happens we run out of space in our array - Oh no!
We need to create a new bigger array, then copy over all the data
from the older smaller array to the new bigger array - that doesnt sound like fun at all!

Wouldn't it be nice if we have a data structure that took care of all this building
and expanding for us. Thats what we are going to build now.
We will create a class called `ExpandableArray` that takes care of that.
So, if a programmer wants to just store data in an array,
they dont have to worry about running out of space, your data structure will do that 
automatically.

You will be using and adding more functionality to your `ExpandableArray` in Homework02.

#### Testing

We have provided a file called 

<a href="{{ site.url }}{{ site.baseurl }}/labs/lab02/ExpandableArrayTests.java">
`ExpandableArrayTests.java`
</a>
that you can use 
to test your `ExpandableArray`.
You can download it by running:

```
wget https://raw.githubusercontent.com/BMC-CS-151/BMC-CS-151.github.io/main/labs/lab02/ExpandableArrayTests.java 
```

The tests will not compile until you've written completed the lab.

Below we list some of the instance methods you will need to implement.

### 2.1 Class definition

Lets start by creating a file called
`ExpandableArray.java`. We can define our class with the following line:

```java
public class ExpandableArray<E>
```

**Question:** In our class definition what is `E` and what does it denote?

<details><summary><b style="color:DodgerBlue;">CLICK HERE FOR THE ANSWER</b></summary>
1. E is a generic
<br>
2. E tells us that when a user creates an ExpandableArray object, 
they get to determine what type of data can be stored in the object.
</details>

### 2.2 Instance variables

Our `ExpandableArray` class will need to keep track of some data. 

**Question:** What data do you think we will need to store?

<details><summary><b style="color:DodgerBlue;">CLICK HERE FOR A HINT</b></summary>
There are two things we need to keep track of.
</details>

<br>
<details><summary><b style="color:DodgerBlue;">CLICK HERE FOR THE ANSWER</b></summary>
1. An array of items that the user is inserting
<br>
2. How many items are we currently storing.
</details>

Now add those instance variables


### 2.3 Constructors

Create two constructors: 
1. The first should take an argument to specify the initial capacity of our data structure. We call these kinds of constructors "value constructors."
1. In the empty constructor,
you as the designer get to specify a default value. In order to make sure
that the remaining methods work correctly, I would recommend you limit the default to at most 10.

### 2.4 Inserting

We will create two `insert` methods. The first will take in an item and insert
the item at the **begining** of the `ExpandableArray`.
The second will take in an item and a location and insert
the item in the specified location.
When a user inserts an item in the array, make sure to move 
shift elements up or down to maintain our rule of always storing an element whose list index is `i` at index `i` of the array.


For the insert method which takes an index to insert at, ensure that the index is valid.
If the user specifies an invalid index, throw an `IndexOutOfBoundsException` error.
An index is invalid if does not correspond to an element in the array. If our underlying array is of size 20, but only 4 of them are filled, any index > 4 is invalid.
 
Your error should include an informative message. 
Similar to how the follow code 

```java
int[] test = new int[2];
int a = test[3];
```
would throw the following error with the following message:

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
```
Both `insert` methods should be named `insert` and return `void` type.

### 2.5 Accessing
Write a method named `get` that will extract
an item from the `ExpandableArray`. The user should be able to specify
an index and the `ExpandableArray` will return the item at that index.

Again, if the user specifies an index that is greater than the number
of elements in the `ExpandableArray`, throw an `IndexOutOfBoundsException`. 

### 2.6 Remove
Write a remove method that enables a user to specify the index and 
the `ExpandableArray` will remove the item at that index.
Since we do not want any empty spaces in the middle of our `ExpandableArray`,
make sure to move over every item that you need to when removing the item
in the index specified by the user. Your remove method should return the removed element.

### 2.7 toString()

Write a `toString()` method that will print out each item
in the `ExpandableArray`. Each item should be seperated by a comma and space.

### 2.8 set()
Write a `set` method which takes an element and an index, and sets the value accordingly.

Again, if the user specifies an index that is greater than the number of elements in the `ExpandableArray`, throw an `IndexOutOfBoundsException`. 

### 2.9 size()
Write a `size` method which returns the number of elements in the array.

### Test it!
After compiling the test class, make sure to include the `ea` flag when running
the program:

```
java -ea ExpandableArrayTests
```

This will ensure that all tests actually run. We are using `assert`
to test the `ExpandableArray`.

Once your tests pass, submit your code to Gradescope.


## Exercise 3: Mammals again

After getting `ExpandableArrayTests.java` to pass all the test,
change the data structure in exercise 1 to use your `ExpandableArray`.
Make sure the
program works the same.

## Wrap up

In todays lab we covered Inheritance and creating our first
data structure.

### Signing out
Before leaving, make sure you submit to Gradescope.
