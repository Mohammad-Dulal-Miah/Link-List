class Node{

    int data;
    Node next;

    Node(int data){

        this.data = data;
        this.next = null;
    }
       
}

class LinkL {

    Node head;

    //add value in first
    public void addFist(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    //add value in last
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

        Node curNode = head;
        while(curNode != null){

            System.out.print(curNode.data+"->");
            curNode = curNode.next;
        }
        System.out.print("->null");
    }


    


    public static void main(String[] args){

        LinkL obj = new LinkL();
        obj.addFist(56);
        obj.addFist(90);

        obj.addLast(76);

        obj.show();
    }
}
