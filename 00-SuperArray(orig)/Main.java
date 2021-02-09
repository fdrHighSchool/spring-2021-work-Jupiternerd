
public class Main {
    public static void main(String[] args) {
        String[] myStringArray;
        myStringArray = new String[]{"one", "two", "three"};
        SuperArray arr = new SuperArray(myStringArray);
        arr.add("four", "five");
        System.out.println(arr);


        //System.out.println(arr.toString());
        //System.out.println(arr.length);
      }
}