---
title: Data Structures - Bryn Mawr College
layout: default
img: <!-- turk-engraving-detail -->
img_link: <!-- http://en.wikipedia.org/wiki/The_Turk -->
caption: <!--An engraving of the Mechanical Turk, the 18th century chess-playing automaton -->
active_tab: main_page 
---


This course is an introduction to the fundamental data structures of computer science: linked lists,
stacks, queues, trees (BSTs, heaps, AVLs and other self-balancing BSTs), hash tables,
sets (Union-Find), graphs and their accompanying algorithms. Principles of algorithmic
analysis and object reasoning and design will be introduced using mathematical techniques
for the notions of both complexity and correctness. More practical issues, such as memory
management, searching, sorting and hashing, will also be covered.

<!-- Display an alert about upcoming homework assignments -->
{% capture now %}{{'now' | date: '%s'}}{% endcapture %}
{% for page in site.pages %}
{% if page.release_date and page.due_date %}
{% capture release_date %}{{page.release_date | date: '%s'}}{% endcapture %}
{% capture due_date %}{{page.due_date | date: '%s'}}{% endcapture %}
{% if release_date < now and due_date >= now %}
<div class="alert alert-info">
<a href="{{site.url}}{{site.baseurl}}{{page.url}}">{{ page.title }}</a> has been released.  
{% if page.deliverables %}
The assignment has multiple deliverables.
{% for deliverable in page.deliverables %}
The {{deliverable.description}} is due before {{ deliverable.due_date | date: "%I:%M%p" }} on {{ deliverable.due_date | date: "%A, %B %-d, %Y" }}.  
{% endfor %}
{% else %}
It is due before {{ page.due_date | date: "%I:%M%p" }} on {{ page.due_date | date: "%A, %B %-d, %Y" }}.
{% endif %}
</div>
{% endif %}
{% endif %}
{% endfor %}
<!-- End alert for upcoming homework assignments -->


<!--
<div class="alert alert-info" markdown="1">
Check out the [excellent final projects](http://crowdsourcing-class.org/final-projects-2016.html) from last year's class.
</div>
-->


Course number
: CMSC B151 

Instructor
: [Elizabeth Dinella](https://www.seas.upenn.edu/~edinella/)

Teaching Assistants
: [Course Staff](staff.html) 

Website 
: [https://bmc-cs-151.github.io/](https://bmc-cs-151.github.io/)

Code Samples From Lecture
: [Github](https://github.com/BMC-CS-151/class-examples-s25)

Discussion Forum
: [Piazza](https://piazza.com/class/m0jmvenkle36yh)

Time and place
: Spring 2025, MW 1:10-2:30pm, Location: Park 337
: Lab W: 2:40-4:00pm, Location: Park 231

Prerequisites
: One of the following courses is required with a grade of 2.0 or better (or permission of
the instructor):
1. CS B110
2. CS B113
3. CS H105

Course Readings
: Each lecture has an optional accompanying chapter/section of the [textbook](https://www.wiley.com/en-us/Data+Structures+and+Algorithms+in+Java%2C+6th+Edition-p-9781118771334). We will be using the 6th edition of Data Structures and Algorithms by Goodrich, Tamassia and Goldwasser. 
: 

Grading
* Homeworks: 50%
* Labs: 5%
* Midterm: 15%
* Final: 25% 
* Participation: 5%


<!---
Late day policy
: As a general rule, no late homework will be accepted.
<br>
See the <a href="{{ site.url }}{{ site.baseurl }}/policies.html">Policies</a> for more details.
-->

<!--#### Acknowledgments-->
