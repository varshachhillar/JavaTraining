package JavaBasics.linkedlist;


import java.util.Iterator;
import java.util.LinkedList;
class Node {
    int data;
    Node next;



    public static Node reverse(Node current){
        Node next = null;
        Node pre = null;
        while (current != null){
            next = current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        return pre;
    }

        public static void main(String[] args){
        Node n1= new Node();
        Node n2= new Node();
        Node n3= new Node();
        Node n4= new Node();
        n1.data = 3;
        n2.data = 5;
        n3.data = 4;
        n4.data = 2;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        Node head = n1;
        while(n1 != null){
                System.out.print(n1.data + " ");
                n1 = n1.next;
            }
            System.out.println();

        Node rev = reverse(head);

        while(rev != null){
            System.out.print(rev.data + " ");
            rev = rev.next;
        }

    }


}
