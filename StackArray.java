package project_stackqueuelinkedlist;
import java.util.Stack;
import java.util.Arrays;

/**
 *
 * @author hannahgsimon
 */

public class StackArray <T extends Comparable> implements Comparable<T>
{
    //Stack<T> data = new Stack<>();
    T[] data = (T[]) new Comparable[5];
    int head = 0;
    
    public String getAuthorInfo()
    {
        return("Hannah Simon\n");
    }
    
    public void push(T item)
    {
        //data.push(item);       
        if (!hasData()) //Array is empty
        {
            data[head] = item;
        }
        
        else if (head + 1 != data.length)
        {
            data[++head] = item;
        }
        
        else
        {
            T[] tmp = (T[])new Comparable[data.length*2];
            for (int i = 0; i < data.length; i++)
            {
                tmp[i] = data[i];     
            }
            tmp[++head] = item;
            data = tmp; //Data is now pointing to tmp.
        }
    }
    
    public T pop()
    {
        //return(data.pop());
        T tmp = data[head];
        if (data[head] != null)
        { 
            data[head] = null;
            if (head != 0)
            {
                head--;
            }
            //return tmp;
        }
        return tmp;
        //return(T) ("Storage is empty; cannot remove any values.");  
    }
    
    public boolean hasData()
    {
        //return(!data.isEmpty());
        return (data[head] != null);
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
            return null;
        }
        return data[head];
    }
    
    @Override
    public String toString()
    {
        //return(data.toString());
        T[] dataReversed = (T[]) new Comparable[data.length];
        for (int i = 0; i < data.length; i++)
        {
            dataReversed[i] = data[data.length - 1 - i];
        }
        return(Arrays.toString(dataReversed));
    }
    
    @Override
    public int compareTo(T o)
    {
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
    }
}