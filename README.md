# Law-of-Universal-Gravitation
a simple code to show how does the universe work influenced by gravity
<dr> A simple practice for implementing physical principles in programming.
![from https://sp18.datastructur.es/materials/proj/proj0/proj0](https://sp18.datastructur.es/materials/proj/proj0/netforce.png)

<dr>Planet constructor : double xxPos : its current x position
<dr>                     double yyPos : its current y position
<dr>                     double xxVel : its current velocity in the x direction
<dr>                     double yyVel : its current velocity in the y direction
<dr>                     double mass : its mass<dr>                     
<dr>                     String imgFileName : the name of the file that corresponds to the image that depicts the planet

<dr>By calling calNetForceExertedByX(allPlanets) and calNetForceExertedByY(allPlanets) to calculate force in two dimension
<dr>run the code by calling 
    javac NBody.java
    java NBody 157788000.0 25000.0 data/planets.txt
<dr> the first variable is time of simulation, the second variable is the length of step to increase the time. The last one is the file name which describ the universe radius and planets.
