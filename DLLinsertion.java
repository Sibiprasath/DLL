import java.util.Scanner;

public class DLLinsertion{
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
    DLLinsertion(){
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
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertend(int val){
        Node newnode=new Node(val);
        
        if(tail==null){
            head=newnode;
            tail = newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    public void position(int pos , int k){
        Node newnode = new Node(k);
        
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newnode.prev=temp;
        newnode.next=temp.next;
        temp.next.prev=newnode;
        temp.next=newnode;
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
        DLLinsertion list = new DLLinsertion();
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            list.insertbegin(val);
            //list.insertend(val);
        }
        list.display();
        int pos=sc.nextInt();   
        int k=sc.nextInt();
        list.position(pos,k);
        list.display();
        
    }
}