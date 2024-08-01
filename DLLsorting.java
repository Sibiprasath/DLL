import java.util.Scanner;
public class DLLsorting{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
    Node(int val){
            data = val;
            next = null;
            prev=null;
        }
    }
    
    DLLsorting(){
        head = null;
        tail=null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);
        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        }
    }
    
    public void sort(){
        if(head==null || head.next==null)
        {
            return;
        }
        else
        {
            Node current,index;
            int temp;
            for(current=head;current.next!=null;current=current.next)
            {
                for(index=current.next ; index !=null ; index=index.next)
                {
                    if(current.data>index.data)
                    {
                        temp = current.data;
                        current.data=index.data;
                        index.data=temp;
                    }
                }
            }
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        DLLsorting list = new DLLsorting();
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
        int val = sc.nextInt();
        list.insertend(val);
    }
    list.sort();
    System.out.print("SORTING \n");
    list.display();
    }
}
