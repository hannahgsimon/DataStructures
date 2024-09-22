package project_stackqueuelinkedlist;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;

/**
 *
 * @author hannahgsimon
 */

public class QueueArray<T extends Comparable> implements Comparable<T>
{
    //ArrayDeque<T> data = new ArrayDeque<>();
    T[] data = (T[]) new Comparable[5];
    int tail = 0, head = 0;
    
    public String getAuthorInfo()
    {
        return("Hannah Simon\n");
    }
    
    public void enque(T item)
    {
        //data.offer(item);
        
        if (!hasData()) //Array is empty
        {
            head = 0; tail = 0;
            data[tail] = item;
        }
        
        else if (tail + 1 != data.length && data[tail + 1] == null)
        {
           data[++tail] = item;
           //tail ++; Unccessary.
        }
                
        else if (tail + 1 == data.length && data[0] == null)
        {
           data[0] = item;
           tail = 0;
        }
        
        else
        {
            T[] tmp = (T[])new Comparable[data.length*2];
            for (int i = 0; i <= tail; i++)
            {
                tmp[i] = data[i];     
            }
            if (head != 0)
            {
                for (int i = tmp.length - 1; i >= tmp.length - (data.length - head); i--)
                {
                    tmp[i] = data[i - data.length]; 
                }
                head = tmp.length - (data.length - head);
            }
            tmp[++tail] = item;
            data = tmp; //Data is now pointing to tmp.
        }
            
    }
    
    public T dequeue()
    {
        //return(data.poll());
        
        //Checking if array is empty
        T tmp = data[head];
        if (hasData())
        {
            data[head] = null;
            if (head == data.length - 1)
            {
                head = 0;
            }
            else
            {
                head++;
            }
            //return (T) ("Removing " + tmp + " from Queue");
        }
        return tmp;
//        else
//        {
//            head = 0; tail = 0;
//            return(T) ("Storage is empty; cannot remove any values.");
//        }
        
    }
    
    public T peek()
    {
        //return(data.peek());
        return data[head];
    }
    
    
    @Override
    public String toString()
    {
        //return(data.toString());
        return(Arrays.toString(data));
    }
    
    @Override
    public int compareTo(T o) { //passing in object o of type T
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
    
    public boolean hasData()
    {
        //return(!data.isEmpty());
        return (data[head] != null);
    }
    
}