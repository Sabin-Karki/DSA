package LinkedList;

class Node{
    Node next;
    int data;
public Node(int data){
    this.data=data;
    this.next=null;

}
    
}
class Main{

   
    Node head;
    public void deleteLast(){
        if (head == null) {
        
            return;
        }
    
        if (head.next == null) {
          
            head = null;
            return;
        }


        Node currNode=head;
        while(currNode.next.next!=null){
              currNode=currNode.next;
        }
        currNode.next=null;
     }
   




    public void insertAtFirst(int data){

        Node newNode=new Node(data);
      
        if(head==null){
        head=newNode;
        return;
        }
        else{
            newNode.next= head;
            head= newNode;
        }

    }



    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " " );
            current = current.next;
        }
    }

    
public  void insertLast(int  data){
   
    Node newNode=new Node(data);
  
   //Traverse until last node
   Node current=head;
   while (current.next!=null){
    current=current.next;
   }
   current.next=newNode;

}
public static void main(String[] args) {
    

Main list= new Main();
list.insertAtFirst(4);
list.insertAtFirst(2);
list.insertAtFirst(1);

list.insertLast(6);
list.deleteLast();
list.display();
}

}