package project_stackqueuelinkedlist;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hannahgsimon
 */

public class Project_StackQueueLinkedList
{
    public static void main(String[] args)
    {
        Project_StackQueueLinkedList proj = new Project_StackQueueLinkedList();
        proj.run();
    }

    public void run()
    {
        StackArray<SampleData> saData = new StackArray<>();
        StackList<SampleData> slData = new StackList<>();
        QueueArray<SampleData> qaData = new QueueArray<>();
        QueueList<SampleData> qlData = new QueueList<>();
        int sel = 0;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("1)\tAuthor Info\n2)\tAdd Stack Array Data\n3)\tAdd Stack List Data\n4)\tAdd Queue Array Data\n5)\tAdd Queue List Data\n6)\tRemove Stack Array Data\n7)\tRemove Stack List Data\n8)\tRemove Queue Array Data\n9)\tRemove Queue List Data\n10)\tGet Max Pending Data\n11)\tPrint Data\n0)\tExit");
            
            sel = getInt(input);
            
            if (sel == 0)
            {
                break;
            }
            else if (sel == 1)
            {
                sel = rand.nextInt();
                if (sel % 4 == 0)
                {
                    System.out.println(saData.getAuthorInfo());
                }
                else if (sel % 4 == 1)
                {
                    System.out.println(slData.getAuthorInfo());
                }
                else if (sel % 4 == 2)
                {
                    System.out.println(qaData.getAuthorInfo());
                }
                else if (sel % 4 == 3)
                {
                    System.out.println(qlData.getAuthorInfo());
                }
            }
            else if (sel == 2)
            {
                System.out.println("Enter data");
                sel = getInt(input);
                SampleData data = new SampleData(sel);
                saData.push(data);
            }
            else if (sel == 3)
            {
                System.out.println("Enter data");
                sel = getInt(input);
                SampleData data = new SampleData(sel);
                slData.push(data);
            }
            else if (sel == 4)
            {
                System.out.println("Enter data");
                sel = getInt(input);
                SampleData data = new SampleData(sel);
                qaData.enque(data);
            }
            else if (sel == 5)
            {
                System.out.println("Enter data");
                sel = getInt(input);
                SampleData data = new SampleData(sel);
                qlData.enque(data);
            }
            else if (sel == 6)
            {
                if (saData.hasData())
                {
                    System.out.printf("Removing %s from Stack\n", saData.pop());
                }
                else
                {
                    System.out.println("Storage Empty");
                }
            }
            
            else if (sel == 7)
            {
                if (slData.hasData())
                {
                    System.out.printf("Removing %s from Stack\n", slData.pop());
                }
                else
                {
                    System.out.println("Storage Empty");
                }
            }
            else if (sel == 8)
            {
                if (qaData.hasData())
                {
                    System.out.printf("Removing %s from Queue\n", qaData.dequeue());
                }
                else
                {
                    System.out.println("Storage Empty");
                }
            }
            else if (sel == 9)
            {
                if (qlData.hasData())
                {
                    System.out.printf("Removing %s from Queue\n", qlData.dequeue());
                }
                else
                {
                    System.out.println("Storage Empty");
                }
            }
            else if (sel == 10)
            {
                SampleData max = saData.peek();
                if (slData.compareTo(max) > 0)
                {
                    max = slData.peek();
                }
                if (qaData.compareTo(max) > 0)
                {
                    max = qaData.peek();
                }
                if (qlData.compareTo(max) > 0)
                {
                    max = qlData.peek();
                }
                System.out.printf("The largest pending value is: %s\n", max);
            }
            else if (sel == 11)
            {
                System.out.println("Stack Array: " + saData);
                //System.out.println("head: " + saData.head);
                System.out.println("Stack List: " + slData);
                System.out.println("Queue Array: " + qaData);
                //System.out.println("head: " + qaData.head +"\ntail: " + qaData.tail);
                System.out.println("Queue List: " + qlData);
            }
        }
    }
    
    public int getInt(Scanner input)
    {
        while(true)
        {
            if (input.hasNextInt())
            {
                return(input.nextInt());
            }
            else
            {
                input.next();
                System.out.println("\nInvalid Selection\n");
            }
        }
    }
    
}