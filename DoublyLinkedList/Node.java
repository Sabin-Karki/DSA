package DoublyLinkedList;

public class Node {

    int data;
    Node next,prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DoublyLinkedList{
    Node head;
  
    void insertAtbeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
          head=newNode;

        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }



    Node currentNode;

    //WE NEED TO TRAVERSE TILL LAST 

    void insertAtTail(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev=currentNode;
     
    }

    

    //Deleting the beginning node..

    // void deletefirstNode(){
   
    //     if(head==null){
    
    //         return;
    //     }
    //     head=head.next;
    // }


    
     public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " " );
            current = current.next;
        }
     }

     public static void main(String[] args) {
         DoublyLinkedList list=new DoublyLinkedList();
      
        list.insertAtbeginning(4);
        list.insertAtbeginning(5);
         list.insertAtbeginning(7);
         list.insertAtbeginning(8);
        //  list.deletefirstNode();
     
        list.display();
         list.insertAtTail(10);
         list.display();
    
       

}
}


