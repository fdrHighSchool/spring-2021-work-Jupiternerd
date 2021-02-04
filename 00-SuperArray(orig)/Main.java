
public class Main {
    public static void main(String[] args) {
        String[] myStringArray;
        myStringArray = new String[]{"one", "two", "three"};
        SuperArray arr = new SuperArray(myStringArray);
        


        //arr.grow(5);
        System.out.println(arr.toString());
        arr.append("dos", "tres");
        System.out.println(arr.toString());

        //System.out.println(arr.toString());
        //System.out.println(arr.length);
      }
}