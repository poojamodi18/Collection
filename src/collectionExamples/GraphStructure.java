package collectionExamples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Vertex {
    int num;
    List<Vertex> adjacent;

    Vertex(int num) {
        this.num = num;
    }

    public Vertex(int num, List<Vertex> adjacent) {
        this.num = num;
        this.adjacent = adjacent;
    }

    public int getNum() {
        return num;
    }

    public List<Vertex> getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(List<Vertex> adjacent) {
        this.adjacent = adjacent;
    }

    public void addAdjacent(Vertex v) {
        this.adjacent.add(v);
    }

    public void displayAdjacent() {
        System.out.print("Vertex : " + "num=" + num + ", adjacent= ");
        adjacent.stream().forEach(v -> System.out.print(v.getNum() + " "));
        System.out.println();
    }
}
class Graph{
    List<Vertex> adjacentList;

    public Graph(List<Vertex> adjacentList) {
        this.adjacentList = adjacentList;
    }

    public List<Vertex> getAdjacentList() {
        return adjacentList;
    }

    public void setAdjacentList(List<Vertex> adjacentList) {
        this.adjacentList = adjacentList;
    }

    public void displayAdjacentList(){
        for (Vertex vertex : adjacentList) {
            vertex.displayAdjacent();
        }
    }
    /*Map<Vertex, List<Vertex>> adjacent;

    public Graph(Map<Vertex, List<Vertex>> adjacent) {
        this.adjacent = adjacent;
    }
    void addAdjacent(Vertex v , Vertex adj){
    }*/
}
public class GraphStructure {
    public static void main(String[] args) {
        Vertex one = new Vertex(1);
        Vertex two = new Vertex(2);
        Vertex three = new Vertex(3);
        Vertex four = new Vertex(4);
        Vertex five = new Vertex(5);
        one.setAdjacent(Stream.of(two, four, three).collect(Collectors.toCollection(ArrayList::new)));
        two.setAdjacent(Stream.of(one, four, five).collect(Collectors.toCollection(ArrayList::new)));
        three.setAdjacent(Stream.of(one, five, four).collect(Collectors.toCollection(ArrayList::new)));
        four.setAdjacent(Stream.of(two, one, five).collect(Collectors.toCollection(ArrayList::new)));
        five.setAdjacent(Stream.of(two, four, three).collect(Collectors.toCollection(ArrayList::new)));
        /*one.displayAdjacent();
        two.displayAdjacent();
        three.displayAdjacent();
        four.displayAdjacent();
        five.displayAdjacent();*/

        Graph graph = new Graph(Stream.of(one,two,three,four,five).collect(Collectors.toCollection(ArrayList::new)));
        graph.displayAdjacentList();

    }
}


