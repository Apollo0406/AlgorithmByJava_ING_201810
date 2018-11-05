package listInsertSort;

public class listInsertSortApp {
    public static void main(String[] args) {
        int size =10;
        Link[] linkArr = new Link[size];

        for(int i = 0; i < size; i++){
            int n = (int)(Math.random()*100);
            Link newLink = new Link(n);
            linkArr[i] = newLink;
        }

        System.out.print("Unsorted array:");
        for(int i = 0; i < size; i++ ){
            System.out.print(linkArr[i].data+" ");
        }
        System.out.println(" ");

        sortedList theList = new sortedList(linkArr);
        for(int i = 0; i < size; i++){
            linkArr[i] = theList.remove();
        }
        System.out.print("Sorted array after:");
        for(int j = 0; j < size; j++){
            System.out.print(linkArr[j].data+" ");
        }
        System.out.println(" ");
    }
}
