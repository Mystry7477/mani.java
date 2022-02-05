public class LL
 {
       class Node
       {
              String data;
              Node next;
              
              Node(String data)
              {
                     this.data=data;
                     this.next=null;
              }
              //add at first,last
              public void addFirst(String data)
              {
                     Node newNode= new Node(data);
                     if(head==null)
                     {
                            head=newNode;
                            return;
                     }
                     newNode.next=head;
                     head=newNode;
              }
              public void addLast(String data)
              {
                     Node newNode= new Node(data);
                     if(head==null)
                     {
                            head=newNode;
                            return;
                     }
                     NOde currNode=head;
                     while(currNode.next!=null)
                     {
                            currNode=currNode.next;
                     }
                     currNode.next=newNode;
              }
              //print
       public void printList()
       {
              if(head==null)
              {
               System.out.print("list is empty");
                return;
              }
             Node currNode=head;
              while(currNode.next!=null)
              {
              System.out.print(currNode.data +"->");
              currNode=currNode.next;
              }
              System.out.print("NULL");
       }
       
       public static void main(String[] args)
       {
              LL list=new LL();
              list.addFirst("a");
              list.addFirst("is");
              list.printList();
       }
       
       

       
       
}
