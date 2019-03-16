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
        if(map[index] == null){
            map[index] = new Entry(-1,-1,null);
        }
        Entry e = map[index];
        if(e.next == null){
            map[index].next = new Entry(key,value,null);
            size++;
            use++;
            if(use >= map.length*LOAD_FACTOR){
                resize();
            }
        }else{
            for(e = e.next; e != null; e = e.next){
                int k = e.key;
                if(k == key){
                    e.value = value;
                    return;
                }
            }
            Entry temp = map[index].next;
            Entry newEntry = new Entry(key,value,temp);
            map[index].next = newEntry;
            size++;
        }
    }

    /**
     * 删除
     */
    public void remove(int key){

    }

    /**
     * hash()
     * 根据key来通过计算得到元素存储的位置
     * 计算方法：拿Key对数组长度取余
     */
    public int hash(int key){
        return key%map.length;
    }

    /**
     * resize()
     * 扩容方法：创建一个大小为原数组2倍的新数组
     */
    public void resize(){
        int newLength = map.length*2;
        Entry[] oldMap = map;
        map = new Entry[newLength];
        use = 0;
        for(int i = 0; i < oldMap.length; i++){
            if(oldMap[i] != null && oldMap[i].next != null){
                Entry e = oldMap[i];
                while (null != e.next){
                    Entry next = e.next;
                    int index = hash(next.key);
                    if(map[index] == null){
                        use++;
                        map[index] = new Entry(-1,-1,null);
                    }
                    Entry temp = map[index].next;
                    Entry newEntry = new Entry(next.key,next.value,temp);
                    map[index].next = newEntry;

                    e =next;
                }
            }
        }
    }
}
