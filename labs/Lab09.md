---
layout: default
title: "Hashmaps"
type: Lab
number: 09
active_tab: lab
release_date: 2024-04-08

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
1. Getting practice with HashMaps and probing


### Paired Programming rules
This lab is a **paired programming assignment.** What exactly does that mean? 
You will be working in pairs on the CS lab computers. Each pair will be working on one computer. One person will be the **driver** and the other person
 will be the **navigator**. Here is the rule: the **driver** controlls the lab computer, but the **driver** can only type what the **navigator** tells 
them to type. For this to work well, each pair should be constantly talking 
among themselves. After each problem, you will switch roles, the navigator will become the driver and the driver will become the navigator.

### Files
All files to download are available at:
`{{ site.url }}{{ site.baseurl }}/labs/lab09/`. Just append
the file name to that url.

1. Download `Entry.java`, `Map.java`, 
`AbstractMap.java`, `AbstractHashMap.java`
and `ProbeHashMap.java`.
This is the book’s implementation of a
linear-probing hash table.

2. Study `ProbeHashMap.java` and make sure you understand the implementation details.

3. Download `dictionary.txt` and `search.txt`.

## Exercise 1 - Inserting `dictionary.txt`:
You will write a program that first creates a
`ProbeHashMap`, and then insert words in 
`dictionary.txt` one by one as keys into that hash
table. Values are the same words. 
There are 24,520 words in the file. 
Your initial hash table
capacity should be chosen as a reasonably large prime number.

As you insert each word, compute the average number of probes and maximum number of
probes. Number of probes is the number of times 
an open-addressing hashtable needs to try
before finding the correct array location to either insert or find 
a key-value pair. With no
collision, the average and max number of probes per key should be 0.
Print these values after all insertions are completed. 
Note that, to be able to compute these values, you will need to
update `ProbeHashMap` class. The lines of the output should print the hash table statistics in
the following order:

```
average number of probes during insertions:
max number of probes during insertions:
load factor after insertions:
```

The load factor is the number of elements in the hash table divided by the capacity of the
hash table. It indicates how full the hash table is.

## Exercise 2 - `search.txt`
Now, read each word from search.txt (one word per line) and search for each one in the
hashtable. If the word is found, just print it back out. If the word you are looking for is not
in the dictionary, assume that it is misspelled. To suggest corrections, for each misspelled
word, list any words in the dictionary that are obtainable by any of the following rules:

- Change one letter: For example, if the misspelled word is “kest”, try all possibilities
of changing one character at a time, and look the modified word up in the dictionary.
The possibilities will be “aest”, “best”,...,”zest”, “kast”,...,”kzst”, etc. Assume that the
words in the dictionary file are given in lower case. So, before looking up a word in the
dictionary, convert the word to lower case.
- Exchange adjacent letters: For example, if the misspelled word is “ebst”, try “best”,
esbt” and “ebts”.
- Remove one letter: For example, if the misspelled word is “tbird”, try all possibilities of
removing one letter at a time, and look the modified word up in the dictionary, which
are: “bird”, “tird”, “tbrd”, and “tbir”.

Note that, you have to try all possibilities, but only the ones that are actually found in the
dictionary are possible corrections to be suggested.

**Output Format**: For each misspelled word, generate a single output line as follows. First
print the word itself, then colon(:), and finally the list of possible corrections separated by
commas. For example, if the misspelled word is “kest”, the output may be:
kest: best, fest, jest, kent, kept, lest, nest, pest, rest, test, vest, west,
zest, est

As you search each word/possibly corrected word, compute the average number of probes,
and maximum number of probes. Print these values once after all searches are completed.

# Summary

In this lab we covered hashmaps and got hands on experience with probing.

### Signing out
Before leaving, make sure your TA/instructor have signed you out of the lab. If you finish the lab early, you are free to go.
If you do not finish the lab in time, you will need to go to office hours so
that a TA can check your work. This lab must be completed by the HW7 Deadline 
