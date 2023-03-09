public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        System.out.println("is the queue empty???" + queue.isEmpty());
        System.out.println("");
        for (int i = 0; i < 5; i++)
            queue.add(i, i);
        System.out.println("Adding Test");
        System.out.println(queue);
        System.out.println("");
        System.out.println("is the queue empty now????" + queue.isEmpty());
    }

}
