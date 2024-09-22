package project_stackqueuelinkedlist;
import project_stackqueuelinkedlist.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
//import java.util.Stack;

/**
 *
 * @author hannahgsimon
 */

public class StackList <T extends Comparable> implements Comparable<T> {
    //Stack<T> data = new Stack<>();
    //Node data = new Node(null); Not needed because data isn't being stored in a specific reserved location, the LinkedList is only a cluster of values & pointers.
    Node<T> tail = null, root = null;
    
    public String getAuthorInfo()
    {
        return("Hannah Simon\n");
    }
    
    public void push(T item)
    {
        //data.push(item);
         Node<T> newVal = new Node<>(item); //Runs constructor method of Node, item is passed in as val.
         if (!hasData())    //LinkedList is empty
         {
             tail = root = newVal;
         }
         else
         {
            root.next = newVal;
            root = newVal;
         }
    }
    
    public T pop()
    {
        //return(data.pop());
        T tmp1 = root.value;
        if (hasData()) //LinkedList isn't empty
        { 
            Node<T> tmp2 = tail;
            if (tmp2.next == null) //LinkedList has one item.
            {
                root = null;
                tail = null;
            }
            else
            {
                while (tmp2.next != root)
                {
                    tmp2 = tmp2.next;
                }
                tmp2.next = null; //old root becomes null
                root = tmp2; //new root
            }
        }
        return tmp1;
    }
    
    public T peek()
    {   
//        if (data.isEmpty())
//        {
//            return(null);
//        }
//        return(data.peek());
        if (hasData() == false)
        {
            return(null);
        }
        return root.value;
    }
    
    @Override
    public String toString()
    {
        //return(data.toString());
        if (hasData())
        {
            String stackList = "";
            Node<T> tmp = tail;
            while (tmp != null)
            {
                stackList += (" ," + tmp.value.toString());
                tmp = tmp.next;
            }
            StringBuilder stackListReversed = new StringBuilder();
            stackListReversed.append(stackList);
            stackListReversed.reverse();
            stackListReversed.delete(stackListReversed.length() - 2, stackListReversed.length());
            return ("[" + stackListReversed.toString() + "]");
        }
        return null;
    }
    
    @Override
    public int compareTo(T o) {
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
        //return(!data.isEmpty());
        return (root != null);
    }
}