
public class Main {
    public static void main(String[] args) {
        String[] myStringArray;
        myStringArray = new String[]{"a", "b", "c"};
        SuperArray arr = new SuperArray(myStringArray);
        //System.out.println(arr.length);

        arr.grow(5);
        System.out.println(arr.toString());
        //System.out.println(arr.length);
      }
}