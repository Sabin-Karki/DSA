package Queue;

public class Node {
    int data;
    
    Node next;

    Node(int data){
        this.data=data;
       this.next=null;
       
    }

}
class LinkedList{
    Node front,rear;
  boolean isEmpty(){
    return front==null;
  }

  


  void enQueue(int data){
    Node newNode=new Node(data);
    if(isEmpty()){
        front=newNode;
        rear=newNode;

    }
    else{
        rear.next=newNode;
        rear=newNode;

    }

  }
  void deQueue(){
    if(isEmpty()){
        System.out.println("empty ");
    }
    else{
        @SuppressWarnings("unused")
    int data=front.data;
    front=front.next;
    return;
  
    

    }
  }




  public void display() {

    Node current =front;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
public static void main(String[] args) {
    LinkedList list=new LinkedList();
    list.enQueue(4);
    list.enQueue(3);
    list.enQueue(2);
    list.deQueue();
    list.display();
    
}

} 
