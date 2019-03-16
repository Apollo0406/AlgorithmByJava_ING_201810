package DataStructure.HashMapDemo;

public class HashMap {

    //默认散列表的初始化长度
    private static final int DEFAULT_INITIAL_CAPACITY = 4;

    //扩容因子
    private static final float LOAD_FACTOR = 0.75f;

    //散列表数组
    private Entry[] map = new Entry[DEFAULT_INITIAL_CAPACITY];

    //散列表元素的个数
    private int size = 0;

    //散列表已使用地址的个数
    private int use = 0;

    /**
     * 添加/修改
     */
    public void put(int key,int value){
        int index = hash(key);
    }

    /**
     * hash()
     * 根据key来通过计算得到元素存储的位置
     * 计算方法：拿Key对数组长度取余
     */
    public int hash(int key){
        return key%map.length;
    }
}
