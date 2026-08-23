import java.util.Scanner;
class Hello {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{

            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
                
            }
            temp.next = newNode;
        }
        System.out.println("Node inserted at end");
    }

    void deleteFromBeginning(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else
            System.out.println("Deleted node:" + head.data);
            head = head.next;
        }
    
    void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        System.out.print("List");

        while(temp != null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hello list = new Hello();

        int choice, data;
        do { 
            System.out.println("single linkedlist menu");
            System.out.println("1. Insert at end");
            System.out.println("2. Delete from beginning");
            System.out.println("3. Display list");
            System.out.print("Exit");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the data to insert");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;

                case 2:
                    System.out.println("Delete data from begnning");
                    
            }
        } while (choice != 4);
    }
}
