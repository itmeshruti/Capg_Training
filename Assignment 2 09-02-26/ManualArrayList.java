
public class MannualArrayList {
	private int[] data;
    private int size;

    public MannualArrayList() {
        data = new int[4];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }
    public void remove(int index){
        if(index>0 && index<=size){
            index-=1;
            for(int i=index;i<size;i++)
            {
                data[i]=data[i+1];
            }
            size--;
        }
    }
    public int search(int key){
        int result=-1;
        for(int i=0;i<size;i++){
            if(data[i]==key){
                result=i+1;
                break;
            }
        }
        return result;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
    }
public static void main(String[] args) {
        MannualArrayList list = new MannualArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.print();
    }
}