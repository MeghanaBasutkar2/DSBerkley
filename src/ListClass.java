public class ListClass {
   static int lastItem;
    static int[] arr;

    public ListClass(){
         lastItem = -1;
         arr = new int[10];
        insertItem(2, 4);

    }

    public static void main(String[] args) {
    }
    public static void insertItem(int num, int location){
        for(int i = arr.length-1; i>=location; i--){
            arr[i+1] = arr[i];
        }
        arr[location] = num;
        lastItem++;
        for(int array: arr)
        System.out.println(arr);
    }
}
