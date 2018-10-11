package classDataArray;

class ClassDataArray {
    private Person[] p;
    private int nElem;

    public ClassDataArray(int max){
        p = new Person[max];
        nElem=0;
    }

    public Person find(String searchName){
        int i;
        for(i=0;i<nElem;i++){
            if(p[i].getName().equals(searchName)){
                break;
            }
        }
        if(i == nElem)
            return null;
        else
            return p[i];
    }

    public void insert (String name,int age,String job){
        p[nElem]=new Person(name,age,job);
        nElem++;
    }

    public boolean delete(String name){
        int i;
        for(i = 0;i < nElem; i++){
            if(p[i].getName().equals(name))
                break;
        }
        if(i == nElem)
            return false;
        else{
            for(int j = i;j<nElem;j++){
                p[j]=p[j+1];
            }
            nElem--;
            return true;
        }
    }

    public void display(){
        for(int i = 0 ; i<nElem;i++){
            p[i].display();
        }
    }
}
