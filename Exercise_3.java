//Space Complexity - O(1)
//Time Complexity - O(n)  
class Exercise_3 
{ 
    Node head; // head of linked list 
  
    /* Linked list node */
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to print middle of linked list */
   //Complete this function
    void printMiddle() 
    { 
        //Write your code here
	//Implement using Fast and slow pointers
    if (head != null) 
    { 
        Node fast_ptr= head;
        Node slow_ptr= head;
        while (fast_ptr != null && fast_ptr.next != null) 
        { 
            fast_ptr = fast_ptr.next.next; 
            slow_ptr = slow_ptr.next; 
          
        } 
        System.out.println("The middle element is [" + 
                            slow_ptr.data + "] \n"); 
    } 
}
  
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 

    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
  
    public static void main(String [] args) 
    { 
        Exercise_3 llist = new Exercise_3(); 
        for (int i=12; i>0; --i) 
        { 
            llist.push(i); 
            llist.printList(); 
            llist.printMiddle(); 
        } 
    } 
} 