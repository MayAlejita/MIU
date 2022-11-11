package MPP_Pretest.datastructure.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList = linkedList.insert(linkedList, "Y");
        linkedList = linkedList.insert(linkedList, "Z");
        linkedList = linkedList.insert(linkedList, "C");
        linkedList = linkedList.insert(linkedList, "D");
        linkedList = linkedList.insert(linkedList, "E");
        linkedList = linkedList.insert(linkedList, "F");
        linkedList = linkedList.insert(linkedList, "G");
//        printList(linkedList);

//        linkedList = linkedList.deleteByKey(linkedList, "Y");
//        printList(linkedList);
//
//        linkedList = linkedList.deleteByKey(linkedList, "A");
//        printList(linkedList);
//
//        linkedList = linkedList.deleteAtPosition(linkedList, 4);
//        printList(linkedList);
//
//        linkedList = linkedList.deleteAtPosition(linkedList, 10);
//        printList(linkedList);

        boolean resultFind = linkedList.findElement(linkedList, "D");
        System.out.println(resultFind);

        boolean resultFind1 = linkedList.findElement(linkedList, "Dd");
        System.out.println(resultFind1);
    }

    public static void printList(LinkedList list){
        LinkedList.Node currNode = list.head;
        System.out.println("LinkedList: ");
        StringBuilder sb = new StringBuilder();
        while(currNode != null){
            //System.out.print(currNode.data + ", ");
            sb.append(currNode.data).append(", ");
            currNode = currNode.next;
        }
        System.out.print(sb.toString());
    }
}
