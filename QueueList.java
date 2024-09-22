package project_stackqueuelinkedlist;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author hannahgsimon
 */

public class QueueList<T extends Comparable> implements Comparable<T>
{
    //ArrayDeque<T> data = new ArrayDeque<>();
    Node<T> root = null, tail = null;
    
    public String getAuthorInfo()
    {
        return("Hannah Simon\n");
    }
    
    public void enque(T item)
    {
        //data.offer(item);
        Node<T> newVal = new Node<>(item);
        
        if (!hasData())
        {
            root = tail = newVal;
        }
        else
        {
            tail.next = newVal;
            tail = newVal;
        }
        
    }
    
    public T dequeue()
    {
//        return(data.poll());
        T tmp = root.value;
        if (hasData())
        {
            if (root.next == null) //LinkedList has one item
            {
                root = null; 
                tail = null; //LinkedList is now empty
            }
            else
            {
                root = root.next; //new root.
            }
        }
        return tmp;
    }
    
    public T peek()
    {
//        return(data.peek());
        return root.value;
    }
    
    
    @Override
    public String toString()
    {
//        return(data.toString());
        if (hasData())
        {
            String queueList = "";
            Node<T> tmp = root;
            while (tmp.next != null)
            {
                queueList += (tmp.value.toString() + ", ");
                tmp = tmp.next;
            }
            if (tmp.next == null)
            {
                queueList += (tmp.value.toString());
            }
            return ("[" + queueList + "]");
        }
        return null;
    }

    @Override
    public int compareTo(T o)
    {
//        if (data.isEmpty() && o == null)
//        {
//            return(0);
//        }
//        else if (data.isEmpty())
//        {
//            return(-1);
//        }
//        else if (o == null)
//        {
//            return(1);
//        }
//        return(data.peek().compareTo(o));
        if (hasData() == false && o == null)
        {
            return(0);
        }
        else if (hasData() == false)
        {
            return(-1);
        }
        else if (o == null)
        {
            return(1);
        }
        return peek().compareTo(o);
    }
    
    public boolean hasData()
    {
//        return(!data.isEmpty());
        return (root != null);
    }
}