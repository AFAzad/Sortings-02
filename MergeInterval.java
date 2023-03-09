import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
public class MergeInterval {
    public static void mIntervals(Interval arr[])
    {
        // Test if the given set has at least one interval
        if (arr.length <= 0)
            return;
   
        // Create an empty stack of intervals
        Stack<Interval> stack=new Stack<>();
   
        // sort the intervals in increasing order of start time
        Arrays.sort(arr,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start-i2.start;
            }
        });
   
        // push the first interval to stack
        stack.push(arr[0]);
   
        // Start from the next interval and merge if necessary
        for (int i = 1 ; i < arr.length; i++)
        {
            // get interval from stack top
            Interval top = stack.peek();
   
            // if current interval is not overlapping with stack top,
            // push it to the stack
            if (top.end < arr[i].start)
                stack.push(arr[i]);
            else if (top.end < arr[i].end)
            {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }
   
        System.out.print("Merged Intervals are: ");
        while (!stack.isEmpty())
        {
            Interval t = stack.pop();
            System.out.print("["+t.start+","+t.end+"] ");
        } 
    } 
 
    public static void main(String args[]) {
        Interval arr[]=new Interval[5];
        arr[0]=new Interval(10,8);
        arr[1]=new Interval(1,7);
        arr[2]=new Interval(4,6);
        arr[3]=new Interval(2,5);
        arr[4]=new Interval(12,16);

        
        mIntervals(arr);
    }
}
 
class Interval
{
    int start,end;
    Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}
