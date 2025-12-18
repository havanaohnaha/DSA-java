import java.util.Scanner;
class nodec {
    int data;
    nodec link;
}
class CircularLinearLinkedList {
    public static void main(String[] args) {
        int data,Choice,pos;
        Scanner sc = new Scanner (System.in);
        CircularLinkedList Cll = new CircularLinkedList();
        do {
            System.out.println("press 1 for Append");
            System.out.println("press 2 for add at the Beginning");
            System.out.println("press 3 for Insert any number");
            System.out.println("press 4 for Delete any number");
            System.out.println("press 5 for Display");
            System.out.println("press 6 for exit ");
            System.out.println("enter your Choice \n ");
            Choice = sc.nextInt();
            switch(Choice) {
                case 1:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    Cll.append(data);
                    break;
                case 2:
                    System.out.println("Enter the data to be add at begining");
                    data = sc.nextInt();
                    Cll.AtTheBeginning(data);
                    break;
                case 3:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    System.out.println("Enter the position");
                    pos = sc.nextInt();
                    Cll.insert(data, pos);
                    break;
                case 4:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    Cll.delete(data);
                    break;
                case 5:
                    Cll.display();
                    break;
                case 6:
                    System.out.println("press 6 for exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while(Choice!=6);

    }

}
class CircularLinkedList {
    nodec head;

    void append(int data) {
        nodec n = new nodec();
        n.data = data;
        n.link = n;

        if (head == null) {
            head = n;
            n.link=head;
        } else {
            nodec temp = head;
            while (temp.link != head) {
                temp = temp.link;
            }
            temp.link = n;
            n.link=head;
        }
    }

    void AtTheBeginning(int data) {
        nodec n=new nodec();
        n.data=data;
        n.link= head;
        head=n;
    }
    void insert(int data, int pos) {
        int i=1;
        nodec n = new nodec();
        n.data = data;
        nodec temp = head;
        while (i < pos)
        {
            temp = temp.link;
            i++;
        }
        n.link=temp.link;
        temp.link=n;

    }

    void delete(int data) {
        nodec temp = head;
        nodec pre = head;
        if (head == null)
        {
            System.out.println("list is empty");
        }
        else
        {
            while (temp!= null) {
                if (temp.data == data)
                {
                    if (head == temp)
                    {
                        head = temp.link;
                        break;
                    }
                    else
                    {
                        pre.link = temp.link;
                        break;
                    }
                }
                else
                {
                    pre=temp;
                    temp=temp.link;
                }

            }
        }
        return;
    }

    void display () {
        if (head == null) {
            System.out.println("list is empty");

        } else {
            nodec temp = head;
            do{
                System.out.println("data" + temp.data);
                temp = temp.link;
            }while(temp!=head);

        }

    }
}