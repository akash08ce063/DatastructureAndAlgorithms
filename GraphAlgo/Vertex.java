/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;

/**
 *
 * @author Ricardo KAKA
 */
public class Vertex implements Comparable<Vertex>{
    String name;
    public Edge adjacencies[];
    double minDistance = Double.POSITIVE_INFINITY ;
    Vertex previous;
      public int compareTo(Vertex other)
    {
        return Double.compare(minDistance, other.minDistance);
    }
    Vertex(String name){
        this.name = name ;
    }
    
    public String toString(){
        return name ;
    }
    
    
}
