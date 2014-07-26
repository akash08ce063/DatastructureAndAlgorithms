/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

/**
 *
 * @author Ricardo KAKA
 */
public class Link {
    public int data1;
    public double data2;
    public Link nextLink ;
    
    public Link(int d1, double d2){
        data1 = d1;
        data2 = d2;
    }
    
    public void printLink(){
        System.out.println("{"+ data1 + "," + data2 + "}");
    }
    
}

