import java.util.Scanner;
class NNode {
    int data;
    NNode llink;
    NNode rlink;
}
class DoubleLinkedList {
    public static void main(String[] args) {
        int data,Choice,pos;
        Scanner sc = new Scanner (System.in);
        DoubleList Dl = new DoubleList();
        do {
            System.out.println("press 1 for Append");
            System.out.println("press 2 for add at the Begining");
            System.out.println("press 3 for Insert any number");
            System.out.println("press 4 for Delete any number");
            System.out.println("press 5 for Display forward");
            System.out.println("press 5 for Display backward");
            System.out.println("press 6 for exit ");
            System.out.println("enter your Choice \n ");
            Choice = sc.nextInt();
            switch(Choice) {
                case 1:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    Dl.append(data);
                    break;
                case 2:
                    System.out.println("Enter the data to be add at begining");
                    data = sc.nextInt();
                    Dl.AtTheBeginning(data);
                    break;
                case 3:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    System.out.println("Enter the position");
                    pos = sc.nextInt();
                    Dl.insert(data, pos);
                    break;
                case 4:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    Dl.delete(data);
                    break;
                case 5:
                    Dl.displayforward();
                    break;
                case 6:
                    Dl.displaybackward();
                    break;

                case 7:
                    System.out.println("press 6 for exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while(Choice!=7);

    }

}
class DoubleList{
    NNode head;
    void append(int data){
        NNode n = new NNode();
        n.data = data;
        if(head==null){
            head=n;
            return;
        }else {
            NNode temp = head;
            while (temp.rlink != null) {
                temp = temp.rlink;
            }
            temp.rlink = n;
            n.llink = temp;
            n.rlink = null;
            return;
        }
    }
    void displayforward(){
        if(head==null){
            System.out.println("list is empty");
            return ;
        }
        NNode temp=head;
        System.out.println("the content of the list");
        while(temp.rlink!=null){
            System.out.println("data = "+temp.data);
            temp=temp.rlink;
        }
        System.out.println("\n");
    }
    void displaybackward(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        NNode temp=head;
        while(temp.rlink!=null){
            temp=temp.rlink;
        }
        System.out.println("contents od the list");
        while(temp.llink!=null){
            System.out.println("data"+temp.data);
            temp=temp.llink;
        }
        System.out.println("\n");

    }
    void AtTheBeginning(int data){
        NNode n =new NNode();
        n.data=data;
        if(head==null){
            n.rlink=null;
            n.llink=null;
            head=n;
            return;
        }else{
            NNode temp=head;
            n.rlink=temp;
            temp.llink=n;
            n.llink=null;
            head=n;
            return;
        }
    }
    void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        NNode cur = head;
        NNode prev = null;
        if (cur.data == data) {
            head = cur.rlink; // move head
            System.out.println("Item deleted: " + data);
            return;
        }
        while (cur != null && cur.data != data) {
            prev = cur;
            cur = cur.rlink;
        }
        if (cur == null) {
            System.out.println("item not found: " + data);
            return;
        }
        prev.rlink = cur.rlink;
        System.out.println("item deleted: " + data);
    }


}

