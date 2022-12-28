/*
Original List: 
 1 2 3 4
Updated List: 
 1 3 4
Updated List:
 1 4
Updated List:
 4
Updated List:
List is empty
*/
public class DeleteMid {    
    //Represents the node of list.    
    public class Node{    
        int data;    
        Node next;    
        public Node(int data) {    
            this.data = data;    
        }    
    }    
public int size;    
    //Declaring head and tail pointer as null.    
    public Node head = null;    
    public Node tail = null;    
        
    //This function will add the new node at the end of the list.    
    public void add(int data){    
        //Create new node    
        Node newNode = new Node(data);    
        //Checks if the list is empty.    
        if(head == null) {    
             //If list is empty, both head and tail would point to new node.    
            head = newNode;    
            tail = newNode;    
            newNode.next = head;    
        }    
        else {    
            //tail will point to new node.    
            tail.next = newNode;    
            //New node will become new tail.    
            tail = newNode;    
            //Since, it is circular linked list tail will point to head.    
            tail.next = head;    
        }    
        //Counts the number of nodes in list    
        size++;    
    }    
        
    //Deletes node from the middle of the list    
    public void deleteMid() {    
        Node current, temp;    
        //Checks whether list is empty    
        if(head == null) {    
            return;    
        }    
        else {    
            //Store the mid position of the list    
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);    
            //Checks whether head is equal to tail or not, if yes then list has only one node.    
            if( head != tail ) {    
                //Initially temp will point to head;    
                temp = head;    
                current = null;    
                //Current will point to node previous to temp    
                //If temp is pointing to node 2 then current will points to node 1.    
                for(int i = 0; i < count-1; i++){    
                    current = temp;    
                    temp = temp.next;    
                }    
                    
                if(current != null) {    
                    //temp is the middle that needs to be removed.    
                    //So, current node will point to node next to temp by skipping temp.    
                    current.next = temp.next;    
                    //Delete temp;    
                    temp = null;    
                }    
                //Current points to null then head and tail will point to node next to temp.    
                else {    
                    head = tail = temp.next;    
                    tail.next = head;    
                    //Delete temp;    
                    temp = null;    
                }    
                    
            }    
            //If the list contains only one element     
            //then it will remove it and both head and tail will point to null    
            else {    
                head = tail = null;    
            }    
        }    
        size--;    
    }    
        
    //Displays all the nodes in the list    
    public void display() {    
        Node current = head;    
        if(head == null) {    
            System.out.println("List is empty");    
        }    
        else {    
             do{    
                //Prints each node by incrementing pointer.    
                System.out.print(" "+ current.data);    
                current = current.next;    
            }while(current != head);    
            System.out.println();    
        }    
    }    
        
    public static void main(String[] args) {    
        DeleteMid cl = new DeleteMid();    
        //Adds data to the list    
        cl.add(1);    
        cl.add(2);    
        cl.add(3);    
        cl.add(4);    
        //Printing original list    
        System.out.println("Original List: ");    
        cl.display();    
        while(cl.head != null) {    
            cl.deleteMid();    
            //Printing updated list    
            System.out.println("Updated List: ");    
            cl.display();    
        }    
    }    
}   
