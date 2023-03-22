public class TestHW5 {
    public static void main(String[] args) {
        Dictionary<Integer, String> Entry = new Dictionary<>();
        System.out.println("is the list empty???" + Entry.isEmpty());
        System.out.println("");
        Entry.add(1, "Carlos");
        Entry.add(2, "Poop");
        Entry.add(1, "Erik");
        System.out.println("Adding Test");
        System.out.println(Entry);
        System.out.println("");
        System.out.println("is the queue empty now????" + Entry.isEmpty());
        System.out.println("");

        System.out.println("Getting the value test");
        System.out.println(Entry.getValue(1));
        System.out.println(Entry.getValue(2));
        System.out.println(Entry.getValue(3));
        System.out.println("");
        System.out.println("clear all test");
        Entry.clearDictionary();
        System.out.println("Getting the value test");
        System.out.println(Entry.getValue(1));

    }

}
