---
title: Analysis of Algorithms - Bryn Mawr College
layout: default
img: <!-- turk-engraving-detail -->
img_link: <!-- http://en.wikipedia.org/wiki/The_Turk -->
caption: <!--An engraving of the Mechanical Turk, the 18th century chess-playing automaton -->
active_tab: main_page 
---


This course will cover qualitative and quantitative analysis of algorithms and their corresponding data structures from a precise mathematical point of view. Topics include: performance bounds, asymptotic analysis, correctness and complexity. Particular classes of algorithms will be studied in detail, including greedy, divide-and-conquer, dynamic programming, networkflow, NPC and approximation algorithms.

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
: CMSC B340 

Instructor
: [Elizabeth Dinella](https://elizabethdinella.github.io/)

Teaching Assistants
: [Course Staff](staff.html) 

Website 
: [https://bmc-cs-340.github.io/](https://bmc-cs-340.github.io/)

Discussion Forum
: [Piazza](https://piazza.com/brynmawr/fall2025/cmscb340)

Time and place
: Fall 2025, MW 1:10-2:30pm, Location: Park 337
: Lab Thurs: 1:10-2:30pm, Location: Park 230

Prerequisites
: One of the following courses is required with a grade of 2.0 or better (or permission of
the instructor):
1. CS 151
2. CS 231

Course Readings
: Required: Algorithm Design by Jon Kleinberg and Eva Tardos
: Each lecture has an optional accompanying chapter/section of the textbook.

Learning Goals
: Students who complete the course will have demonstrated the ability to do the following:
: • Analyze the asymptotic performance of algorithms.
: • Write rigorous correctness proofs for algorithms.
: • Demonstrate a familiarity with major algorithms and data structures.
: • Apply important algorithmic design paradigms (Greedy, Divide-and-Conquer, Dynamic
Programming, major graph algorithms and approximation algorithms) and methods
of analysis.
: • Synthesize efficient algorithms in common design situations.

**Grading**
* Homeworks: 15%
* Project: 15%
* Labs: 5%
* Midterm: 25%
* Final: 40% 

<!---
Late day policy
: As a general rule, no late homework will be accepted.
<br>
See the <a href="{{ site.url }}{{ site.baseurl }}/policies.html">Policies</a> for more details.
-->

<!--#### Acknowledgments-->
