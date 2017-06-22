package be.vdab.MemoryManagement;

import java.util.LinkedList;
public class oefening9_1 {
    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();
        for(int i=0; true; i++) {
            data.addFirst(i);
            data.addFirst(i);
            data.removeLast();
            if(data.size() == 20_000_000) {
                data.clear();
                System.out.println("Clearing");
            }
            if(i % 1_000_000 == 0) System.out.println("Size: " + data.size());
        }
    }
}
