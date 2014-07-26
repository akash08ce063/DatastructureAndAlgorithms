/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;
 class LinkList{
    private Link first ;
    public LinkList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void insert(int d1,double d2){
        Link link = new Link(d1,d2);
        link.nextLink = first ;
        first = link ;
    }
    
    public void afterinsert(int pos, int d1, double d2){
        Link link = new Link(d1,d2);
        Link currentLink = first; 
        Link previousLink = null ;
        boolean check = false;
        while(currentLink != null){
            
        //    System.out.println("Inside the loop");
            if(currentLink.data1 == pos ){
                previousLink.nextLink = currentLink;
                previousLink.nextLink.nextLink = link ;
                break;
            }else{
                previousLink = currentLink ; 
                currentLink = currentLink.nextLink ;
            }   
        }
    }
    
    public Link delete(){
        Link temp = first;
        first = first.nextLink;
        return temp;
    }
    
    public void printList(){
    
        Link currentLink = first; 
        System.out.println("List :");
        while(currentLink != null){
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        
        System.out.println("");
        
    }
    
}
