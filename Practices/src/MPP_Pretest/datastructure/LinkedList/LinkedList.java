package MPP_Pretest.datastructure.LinkedList;

public class LinkedList {
    Node head;

    class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList insert(LinkedList list, String data){
        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return  list;
    }

    public LinkedList deleteByKey(LinkedList list, String key){
        Node currNode = list.head;
        Node prev = null;

        //only in the head
        if(currNode != null && currNode.data.equals(key)){
            list.head = currNode.next;

            System.out.println(key + " found and deleted");
            return list;
        }

        //other nodes
        while(currNode != null && !currNode.data.equals(key)){
            prev = currNode;
            currNode = currNode.next;
        }

        if(currNode != null){
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }

        if(currNode == null){
            System.out.println(key + " not found");
        }
        return list;
    }

    public LinkedList deleteAtPosition(LinkedList list, int index){
        Node currNode = list.head;
        Node prev = null;

        if(index == 0 && currNode != null){
            list.head = currNode.next;
            System.out.println(" position element deleted");

            return list;
        }

        int counter = 0;

        while(currNode != null){
            if(counter == index){
                prev.next = currNode.next;
                System.out.println(" position element deleted");

                break;
            }
            else{
                prev = currNode;
                currNode = currNode.next;
                counter ++;
            }
        }

        if(currNode == null) {
            System.out.println("position element not found");
        }
        return  list;
    }

    public boolean findElement(LinkedList list, String key){
        Node currNode = list.head;

        while(currNode != null){
            if(currNode.data.equals(key)){
                System.out.println("element found");
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }
}

