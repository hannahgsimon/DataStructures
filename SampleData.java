package project_stackqueuelinkedlist;

/**
 *
 * @author hannahgsimon
 */

public class SampleData implements Comparable<SampleData>
{
    int data;
    
    public SampleData(int data)
    {
        this.data = data;
    }
    
    @Override
    public int compareTo(SampleData o)
    {
        return(Integer.compare(data, o.data)); //o.data references the data field of object o which is of type SampleData
    }
    
    @Override
    public String toString()
    {
        return(Integer.toString(data));
    }
    
}