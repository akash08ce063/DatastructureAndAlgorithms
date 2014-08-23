/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Ricardo KAKA
 */
public class Dijekstra {
    public static void computePath(Vertex source){
        source.minDistance = 0 ;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
        vertexQueue.add(source);
        while(!vertexQueue.isEmpty()){
            Vertex u = (Vertex) vertexQueue.poll() ;
            for(Edge e : u.adjacencies){
              Vertex v =   e.target;
              if(u.minDistance + e.wieght < v.minDistance){
                  vertexQueue.remove(v);
                  v.minDistance = u.minDistance + e.wieght;
                  v.previous = u;
                  vertexQueue.add(v);
              }
            }
        }
    }
    
    public static List getShortestPath(Vertex target){
        List<Vertex> path = new ArrayList();
        for(Vertex vertex = target ; vertex != null ; vertex = vertex.previous){
            path.add(vertex);
        }
        Collections.reverse(path);
        return path;
    }
    
}
