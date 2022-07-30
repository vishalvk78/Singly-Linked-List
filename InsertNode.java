import java.util.*;
public class Main
{   
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
	public static void main(String[] args) {
	    int data, n, m;
	    Node head=null;
	    Scanner sc=new Scanner(System.in);
	    do{
	    System.out.println("Enter data :");
	    data=sc.nextInt();
	    Node new_node=new Node(data);
	     if(head==null)
	     {
	         head=new_node;
	     }
	        else
	        {
	            System.out.println("Enter 1 for insert at beginning, Enter 2 for insert at end, Enter 3 for insert at speciifc locations");
	            m=sc.nextInt();
	            switch(m)
	            {
	                case 1 :
	                    new_node.next=head;
	                    head=new_node;
	                    break;
	                    
	               case 2 :
	                   Node temp=head;
	                   while(temp.next!=null)
	                   {
	                       temp=temp.next;
	                   }
	                   temp.next=new_node;
	                   break;
	                   
	               case 3 :
	                   System.out.println("Enter the position of enter ");
	                   int pos=sc.nextInt();
	                   Node temp1=head;
	                   for(int i=0;i<pos-2;i++)
	                   {
	                       temp1=temp1.next;
	                   }
	                   new_node.next=temp1.next;
	                   temp1.next=new_node;
	                   break;
	                   
	                   
	            }
	        }
	        
	    System.out.println("Do you want to enter more data, please press 1 : ");
	    n=sc.nextInt();
	    }while(n==1);
	    
	   
        {   Node temp=head;
            if(temp==null){
                System.out.println("LL does not exit");
            }
            else
            
	    
	    while(temp!=null)
	    {
	        System.out.print(temp.data + " ");
	        temp=temp.next;
	    }
        }
	    
		
	}
}
