package CircularDoublyLinkedList;

public class Node {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

}
class Circular{
    Node head;
    Node tail;


    //insert at FIRST


    void insertAtbeginning(int data){

    
    Node newNode=new Node(data);
if (head==null){


    head=newNode;
    tail=newNode;
    head.next=newNode;
    head.prev=newNode;

}
else{

    newNode.next=head;
    newNode.prev=tail;
    tail.next=newNode;
    head.prev=newNode;
    head=newNode;

}
   

}

// INSERT AT LASTT
Node currNode;
void insertAtLast(int data){
    Node newNode= new Node(data);
    if (head==null){


        head=newNode;
        tail=newNode;
        head.next=newNode;
        head.prev=newNode;
    

    }
    
    else{
        newNode.next=head;
        newNode.prev=tail;
        tail.next=newNode;
        head.prev=newNode;
        tail=newNode;

    }
}



void display(){
    Node current = head;
      do{
        System.out.print(current.data + " " );
        current = current.next;

    }
    while(current!=head);
}

public static void main(String[] args) {
    Circular circular=new Circular();
    circular.insertAtbeginning(5);
    circular.insertAtbeginning(4);
    circular.insertAtbeginning(3);
    circular.insertAtbeginning(2);
    circular.insertAtbeginning(1);
    circular.insertAtLast(6);
   
    circular.display();
   
 

    
    
}

}

