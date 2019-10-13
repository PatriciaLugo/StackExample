public class PrgDriver
{
    public static void main(String args[])
    {
        Stack s = new Stack(3);
        Listing l1 = new Listing("Tom","12th Avenue","555 6341");
        Listing l2 = new Listing("Jessie","East Avenue","555 0427");
        Listing l3 = new Listing("Ashley","67th Street","555 1803");
        Listing l4 = new Listing("Norah","West Avenue","555 0198");
        Listing l5 = new Listing("John","5th Avenue","555 3849");
        Listing l6 = new Listing("Matt","Second St.","555 2956");
        s.push(l1);
        s.push(l2);
        s.push(l3);
        s.showAll();
        System.out.println("Top element: \n" + s.peek());
        s.push(l4);
        System.out.println("Current elements in stack:");
        s.showAll();
        s.expandStack();
        s.push(l4);
        System.out.println("Current elements in stack:");
        s.showAll();
        s.pop();
        s.pop();
        s.pop();
        System.out.println("Current elements in stack:");
        s.showAll();
        s.pop();
        s.pop();

        s.reInitialize();
        s.push(l5);
        System.out.println("Current elements in stack:");
        s.showAll();
    }
}
