package LowArray;

public class LowArrayApp {
    public static void main(String[] args){
        LowArray arr;
        arr = new LowArray(100);
        int nElem = 0;
        int i;

        arr.setElem(0,77);
        arr.setElem(1,99);
        arr.setElem(2,44);
        arr.setElem(3,55);
        arr.setElem(4,22);
        arr.setElem(5,88);
        arr.setElem(6,11);
        arr.setElem(7,00);
        arr.setElem(8,66);
        arr.setElem(9,33);
        nElem = 10;

        System.out.println("the original data:");
        for(i=0;i<nElem;i++){
            System.out.println("arr["+i+"]="+arr.getElem(i));
        }

        System.out.println("the answer of search the searchKey(26):");
        int searchKey = 26;
        for(i=0;i<nElem;i++){
            if(arr.getElem(i)== searchKey)
                break;
        }
        if(i == nElem){
            System.out.println("Can not find :"+searchKey);
        }else{
            System.out.println("Founded:"+searchKey);
        }

        System.out.println("the answer of delete 55");
        for(i=0;i<nElem;i++){
            if(arr.getElem(i)==55){
                System.out.println("Deleted the number.");
                break;
            }
        }
        for (int k=i;k<nElem;k++){
            arr.setElem(k,arr.getElem(k+1));
        }
        nElem--;

        for(i=0;i<nElem;i++){
            System.out.println("arr["+i+"]="+arr.getElem(i));
        }


    }
}
