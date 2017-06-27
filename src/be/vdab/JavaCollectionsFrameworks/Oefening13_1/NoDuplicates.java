package be.vdab.JavaCollectionsFrameworks.Oefening13_1;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class NoDuplicates<E> extends PriorityQueue<E> {

    public boolean offer (E e)
    {
        boolean isAdded = false;
        if (!super.contains(e))
        {
            isAdded = super.offer(e);
        }
        return isAdded;

    }

    public static void main (String [] args){

        PriorityQueue<String> p = new NoDuplicates<String>();
        p.add("George");
        p.add("Jim");
        p.add("John");
        p.add("Blake");
        p.add("Kevin");
        p.add("Michael");

        for (int i = 0; i<p.size();i++){
        }
        System.out.println(p);

        PriorityQueue<String> p2 = new NoDuplicates<>();
        p2.add("George");
        p2.add("Katie");
        p2.add ("Kevin");
        p2.add ("Michelle");
        p2.add ("Ryan");

        for (int i = 0; i<p2.size();i++){
        }
        System.out.println(p2);

        System.out.println("union: " + union(p,p2));
        System.out.println("difference: " + difference(p,p2));
        System.out.println("intersection: "+ intersection(p,p2));
    }


    private static <T> PriorityQueue<T> union(PriorityQueue<T>p, PriorityQueue<T>p2)
    {
        PriorityQueue<T> union = new PriorityQueue<>(p);
        union.addAll(p2);
        return union;
    }


    private static <T> PriorityQueue<T> difference(PriorityQueue<T>p, PriorityQueue<T>p2){
        PriorityQueue<T> difference = new PriorityQueue<>(p);
        difference.removeAll(p2);
        return difference;
    }

    private static <T> PriorityQueue<T> intersection (PriorityQueue<T>p, PriorityQueue<T>p2){
        PriorityQueue<T> intersection = new PriorityQueue<>(p);
        intersection.retainAll(p2);
        return intersection;
    }







}
