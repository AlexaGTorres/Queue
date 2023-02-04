public class Queue
{
    //Variables
    private Node head;
    private Node tail;

    //Constructor

    //Output method


    //The other class, yes
    private class Node
    {
        //Variables
        private int data;
        private Node next;

        //Constructor
        private Node (int data)
        {
            this.data = data;
        }

        public boolean isEmpty()
        {
            return head == null;
        }

        public int peek ()
        {
            return head.data;
        }

        public void add (int data)
        {
            Node node = new Node(data);

            if (tail != null)
            {
                tail.next = node;
            }

            tail = node;

            if (head == null)
            {
                head = node;
            }
        }//End add method

        public int remove ()
        {
            int data = head.data;
            head = head.next;

            if (head == null)
            {
                tail = null;
            }
            return data;
        }//End remove method

        //toString

    }//End Node class

}//End class Queue
