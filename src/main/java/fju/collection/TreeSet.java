package fju.collection;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> aa = new java.util.TreeSet<>();
        System.out.println(aa.size());
        aa.add(3);
        aa.add(4);
        aa.add(5);
        aa.add(3);
        System.out.println(aa.size());
        //
        java.util.TreeSet<String> bb = new java.util.TreeSet<>();
        System.out.println(bb.size());
        bb.add("Hank");
        bb.add("Tom");
        bb.add("Eva");
        bb.add("Hank");
        System.out.println(aa.size());
        System.out.println(bb);
        for (String b : bb) {
            System.out.println(b);
        }
    }
}
