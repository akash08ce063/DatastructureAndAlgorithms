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
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        LinkList list = new LinkList();
        list.insert(1, 1.0);
        list.insert(2, 2.0);
        list.insert(3, 3.0);
        list.insert(4, 4.0);
        list.afterinsert(2, 2, 3.33);
    
        list.printList();
    }
    
}
