import java.util.Scanner;
class node {
    int data;
    node llink;
    node rlink;
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
    node head;
    void append(int data){
        node n = new node();
        n.data = data;
        if(head==null){
            head=n;
            return;
        }
        node temp=head;
        while(temp.rlink!=null){
            temp=temp.rlink;
        }
        temp.rlink=n;
        n.llink=temp;
        n.rlink=null;
        return;
    }
    void displayforward(){
        if(head==null){
            System.out.println("list is empty");
            return ;
        }
        node temp=head;
        System.out.println("the content of the list");
        while(temp.rlink!=null){
            System.out.println("data = "+temp.data);
            temp=temp.rlink;
        }
        System.out.println("\n");
    }
    void AtTheBeginning(data){
        node n =new node();
        n.data=data;
        if(head==null){
            n.rlink=null;
            n.llink=null;
            head=n;
            return;
        }else{
            node temp=head;
            n.rlink=temp;
            temp.llink=n;
            n.llink=null;
            head=n;
            return;
        }
    }


}

