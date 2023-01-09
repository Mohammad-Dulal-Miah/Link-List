public class LinkL {
    
    Node head;
    class Node{

        int data;
        Node next;
        private int size;
        
        Node(){
            this.size = 0;
        }
        Node(int data){

            this.data  = data;
            this.next = null;
        }
    }


    //addFirst in Link List

    public void addFirst(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    //addLast in Link list
    public void addLast(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode != null){

            currNode = currNode.next;
        }

        currNode.next = newNode;
    }


    //show link list

    public void show(){

        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }



    //deleteFirst

    public void deleteFirst(){

        if(head == null){
            System.out.println("Empty list");
            return;
        }

        head = head.next;
    }


    //deleteLast

    public void deleteLast(){

        if(head == null){
            System.out.println("Empty list");
            return;
        }

        if(head.next == null){

            head = head.next;
            return;
        }


        Node secondLastNode = head;
        Node lastNode = head.next;

        while(lastNode != null){
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }

        secondLastNode = null;
    }

    public static void main(String[] args){

        LinkL obj = new LinkL();

        obj.addFirst(45);
        obj.addFirst(56);

        obj.show();

        obj.deleteFirst();
        obj.show();
    }
}
