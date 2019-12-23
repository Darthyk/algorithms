# algorithms
dijkstra module contains scheme.txt which is representation of next graph:
![Graph](/dijkstra/src/main/resources/graph.png)

To create jar file build project with maven. 
This file will apear in target folder with name dijkstra.jar.
Programm supports graph with number of edges equal or below 9.
You can create your own graph represenatation with next rules:
1) S is edge itself.
2) - means no relations
3) Digits are weights of ribs
4) Separate data with one space.

Aftert you have chousen file with graph put it with jar file in one directory.
To use jar file put next command to terminal:

  java -jar dijkstra.jar scheme.txt A I , where:
  - java -jar launches the programm
  - dijkstra.jar is jar file name
  - scheme.txt is file with graph representation
  - A is start edge
  - I is end edge
 You can put edges from A to I (9) or to your max edge number equal to alphabet character position.
