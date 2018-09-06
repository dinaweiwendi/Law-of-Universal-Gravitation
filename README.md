# Law-of-Universal-Gravitation
a simple code to show how does the universe work influenced by gravity
<br> A simple practice for implementing physical principles in programming.

![from https://sp18.datastructur.es/materials/proj/proj0/proj0](https://sp18.datastructur.es/materials/proj/proj0/netforce.png)

##Planet constructor : 
<br>double xxPos : its current x position
<br>                     double yyPos : its current y position
<br>                     double xxVel : its current velocity in the x direction
<br>                     double yyVel : its current velocity in the y direction
<br>                     double mass : its mass<dr>                     
<br>                     String imgFileName : the name of the file that corresponds to the image that depicts the planet

<br>By calling
<br>*calNetForceExertedByX(allPlanets) 
<br>*calNetForceExertedByY(allPlanets) 
to calculate force in two dimension
<br>run the code by calling 
        *javac NBody.java
        *java NBody 157788000.0 25000.0 data/planets.txt
<br> the first variable is time of simulation, the second variable is the length of step to increase the time. The last one is the file name which describ the universe radius and planets.
