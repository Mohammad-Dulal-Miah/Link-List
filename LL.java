class LL{

    Node head;
    class Node{

        int data;
        Node next;

        Node(int data){

            this.data = data;
            this.next = null;
        }

    }


    //add -> first

    public void addFirst(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    // add -> last

    public void addLast(int data){

        Node newNode = new Node(data);
         if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){

            currNode = currNode.next;
        }

        currNode.next = newNode;
        
    }


    //show

    public void show(){


        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;

        while(currNode != null){

            System.out.print("data -->"+currNode.data);
            currNode = currNode.next;
        }

        System.out.println("-->Null");
    }

    //delete--> first

    public void deleteFirst(){

        if(head == null){
            System.out.println("Empty list");
            return;
        }

        head = head.next;

    }


    //delete --> last

    public void deleteLast(){

        if(head == null){
            System.out.println("Empty list");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null);
        {
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }

        secondLastNode.next = null;
    }



    public static void main(String[] args){

        LL obj = new LL();
        obj.addFirst(34);
        obj.addLast(90);
        obj.addFirst(39);

        obj.show();
    }
}