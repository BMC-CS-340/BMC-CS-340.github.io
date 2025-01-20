---
layout: default
title: Lectures
active_tab: lectures
---

<!-- Create a HTML anchor for the most recent lecture -->
{% assign anchor_created = false %}
{% capture now %}{{'now' | date: '%s'}}{% endcapture %}
<!-- End create a HTML anchor for the most recent lecture -->


<div class="alert alert-info">
You can <a href="https://brynmawr.hosted.panopto.com/Panopto/Pages/Sessions/List.aspx?folderID=a8497e12-44f6-49f2-be6c-b0740022f257">>watch recordings of the Fall 2023 lecture videos online</a>.
<br><br>
You can <a href="https://brynmawr.hosted.panopto.com/Panopto/Pages/Sessions/List.aspx?folderID=ff498393-6d3d-45d5-a5e5-b0ff014a35bd">>watch recordings of the Spring 2024 lecture videos online</a>.
<br><br>
You can <a href="https://brynmawr.hosted.panopto.com/Panopto/Pages/Sessions/List.aspx?folderID=46258ebd-f926-4015-95a7-b1e001443a8c">>watch recordings of the Fall 2024 lecture videos online</a>.
<br><br>

Recordings are saved on Panopto and require a BMC/HC login.
</div>

The lecture schedule will be updated as the term progresses. 

### Pre-course

Make sure you are registered for the course [Gradescope](https://www.gradescope.com/) and [Piazza](https://piazza.com/class/m0jmvenkle36yh).

Please complete <a href="{{ site.url }}{{ site.baseurl }}/labs/Lab00.html">Lab00</a> before the first lab meeting.

{% for week in site.data.schedule %}
  <h3>
    {{ week.name }}
  </h3>
  	
  	
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Date</th> 
        <th>Topic</th>
        <!--<th>Recordings</th>-->
        <!--<th>Reading</th>-->
        <th>Assignment</th>
      </tr>
    </thead>
    <tbody>

      {% for lecture in week.lectures %}

      <!-- Create a HTML anchor for the most recent lecture -->
      {% capture lecture_date %}{{lecture.date | date: '%s'}}{% endcapture %}
      {% assign lecture_date = lecture_date | plus: 0 %}
      {% assign now = now | minus: 14400 %}

      <tr
      {% if anchor_created != true and lecture_date >= now %}
        {% assign anchor_created = true %}
        id="now" 
      {% endif %}
      
      {% if lecture.type %}
        {% if lecture.type and lecture.type == 'exam' %}
          class="info" 
        {% else if lecture.type and lecture.type == 'deadline' %}
          class="warning"
        {% else if lecture.type and lecture.type == 'no_lecture' %}
          class="success"
        {% endif %}
      {% endif %}
      >

      <!-- End create a HTML anchor for the most recent lecture -->
        <td>{{ lecture.date | date: '%a, %b %-d, %Y' }}</td>
        <td>
         
            {{ lecture.title }} 
            {% if lecture.slides %}
              <a href="{{ lecture.slides }}">[slides]</a>
            {% endif %}
            {% if lecture.recording %}
              <a href="{{ lecture.recording }}">[video] </a>
            {% endif %}
            {% if lecture.code %}
              <a href="{{ lecture.code }}">[Code]</a>
            {% endif %}
            {% if lecture.completed_notebook %}
              <br>
              <a href="{{ lecture.completed_notebook }}">[completed notebook]</a>
            {% endif %}
            <br>

  	    {% if lecture.speaker %}
            {% if lecture.speaker_url %}
              by <a href="{{ lecture.speaker_url }}">{{ lecture.speaker }}</a> 
            {% else %} 
            by {{ lecture.speaker }}
            {% endif %}
  	    {% endif %}

        </td>
        <td>
          {% if lecture.assignments %} 
            {% for assignment in lecture.assignments %}
                {% if assignment.canceled %}<strike> {% endif %}
                {% if assignment.optional %}<b>Optional:</b> {% endif %}
                {% if assignment.url %}
               		<a href="{{ assignment.url }}">{{ assignment.title }}</a>
                {% else %}   {{ assignment.title }}
		{% endif %}
                {% if assignment.deadline %} 
                   (Due {{assignment.deadline | date: '%a, %b %-d, %Y' }})
                {% endif %}
                {% if assignment.canceled %}</strike> {% endif %}
            <br />
            {% endfor %}
          {% endif %}
        </td>
      </tr>
      {% endfor %}
      
    </tbody>
  </table>

  {% endfor %}
