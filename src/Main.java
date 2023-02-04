public class Main
{
    public static void main(String[]args)
    {
        Queue myQueue = new Queue();
        myQueue.add(23);
        myQueue.add(57);
        myQueue.add(18);

        myQueue.showList();
        System.out.println("\nRemove 1");

        myQueue.remove();
        myQueue.showList();

        System.out.println("\nRemove 2");

        myQueue.remove();
        myQueue.showList();
    }
}//End class Main