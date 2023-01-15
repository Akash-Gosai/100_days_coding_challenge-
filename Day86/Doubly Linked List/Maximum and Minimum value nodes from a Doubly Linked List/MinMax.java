
public class MinMax {  
  
    //Represent a node of the doubly linked list  
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    //Represent the head and tail of the doubly linked list  
    Node head, tail = null;  
  
    //addNode() will add a node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //MinimumNode() will find out minimum value node in the list  
    public int minimumNode() {  
        //Node current will point to head  
        Node current = head;  
        int min;  
  
        //Checks if list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else {  
            //Initially, min will store the value of head's data  
            min = head.data;  
            while(current != null) {  
                //If the value of min is greater than the current's data  
  
                //Then, replace the value of min with current node's data  
  
                if(min > current.data)  
                    min = current.data;  
                current = current.next;  
            }  
        }  
        return min;  
    }  
  
    //MaximumNode() will find out maximum value node in the list  
    public int maximumNode() {  
        //Node current will point to head  
        Node current = head;  
        int max;  
  
        //Checks if list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else {  
            //Initially, max will store the value of head's data  
            max = head.data;  
            //If value of max is lesser than current's data  
            //Then, replace value of max with current node's data  
            while(current != null) {  
                if(current.data > max)  
                    max = current.data;  
                current = current.next;  
            }  
        }  
        return max;  
    }  
  
    public static void main(String[] args) {  
  
        MinMax dList = new MinMax();  
        //Add nodes to the list  
        dList.addNode(15);  
        dList.addNode(71);  
        dList.addNode(92);  
        dList.addNode(18);  
        dList.addNode(278);  
  
        //Prints the minimum value node in the list  
        System.out.println("Minimum value node in the list: "+ dList.minimumNode());  
        //Prints the maximum value node in the list  
        System.out.println("Maximum value node in the list: "+ dList.maximumNode());  
    }  
}  

/*
Minimum value node in the list: 15
Maximum value node in the list: 278
*/
