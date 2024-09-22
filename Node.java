package project_stackqueuelinkedlist;

/**
 *
 * @author hannahgsimon
 */

public class Node<T extends Comparable>
{
    T value;
    Node<T> next;
    
    public Node(T val)
    {
        value = val;
        next = null;
    }
    
    public void setNext(Node<T> newNext)
    {
        next = newNext;
    }
    
    public void setValue(T val)
    {
        value = val;
    }
}