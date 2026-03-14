import java.util.Comparator;
import java.util.PriorityQueue;

public class Heaps {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//Comparator.reverseOrder() for reverse the logic 
        // pq.add(3);
        // pq.add(2);
        // pq.add(1);
        // pq.add(5);
        // while (!pq.isEmpty()) {
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }

        PriorityQueue<Student> pq=new PriorityQueue<>();  
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+" ->"+pq.peek().rank);
            pq.remove();
        }
    }
}
