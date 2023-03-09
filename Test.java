public class Test {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        System.out.println("is the queue empty???" + queue.isEmpty());
        System.out.println("");
        queue.add(2, "Steven");
        queue.add(1, "Alan");
        queue.add(2, "pam");
        queue.add(3, "cheese");
        queue.add(4, "carlos");
        queue.add(2, "lui");
        queue.add(6, "gerardo");
        queue.add(7, "dale");
        System.out.println("Adding Test");
        System.out.println(queue);
        System.out.println("");
        System.out.println("is the queue empty now????" + queue.isEmpty());
        System.out.println("");
        System.out.println("peek test");
        System.out.println(queue.peekTopPriority());
        System.out.println("");
        System.out.println("remove test");
        System.out.println(queue.removeTopPriority());
    }

}
