package DataStructure.HashMapDemo;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1,10);
        map.put(2,20);
        map.put(5,50);
        System.out.println(map.getLength());
        map.put(3,30);
        System.out.println(map.getLength());
        map.put(6,60);
        map.put(7,70);
        System.out.println(map.getLength());
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        System.out.println(map.get(5));
        System.out.println(map.get(6));
    }
}
