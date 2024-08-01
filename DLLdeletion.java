import java.util.Scanner;

public class DLLdeletion{
    Node head;
    Node tail;
    
    class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int val){
            data = val;
            next = null;
            prev = null;
        }
    }
    DLLdeletion(){
        head = null;
        tail =null;
    }
    public void insertbegin(int val){
        Node newnode = new Node(val);
        
        newnode.next=head;
        if (head == null){
            head=newnode;
            tail = newnode;
        }
        else{
            head.prev = newnode;
        }
        head = newnode;
    }
    public void deleteatbegin(){
        head=head.next;
    }
    public void deleteatend(){

        tail=tail.prev;
        tail.next=null;
    }
    public void deleteatindex(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        DLLdeletion list = new DLLdeletion();
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            list.insertbegin(val);
        }
        
        list.deleteatbegin();
        list.display();
        list.deleteatend();
        list.display();
        int index=sc.nextInt();
        list.deleteatindex(index);
        list.display();
    }
}