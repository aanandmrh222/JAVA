import java.util.Comparator;
import java.util.PriorityQueue;

public class AK_75_PriorityQueue {
    private static class Student {
        private final  String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }


    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                return t1.getGrade() - t2.getGrade();
            }
        });

        queue.offer(new Student("Rohan",'A'));
        queue.offer(new Student("Sohan",'C'));
        queue.offer(new Student("Shyam",'A'));
        queue.offer(new Student("Mohan",'B'));

        System.out.println("Queue is: "+ queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
