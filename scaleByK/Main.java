import java.util.*;

class Main {
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, -1, 2)); //new arraylist 

    ArrayList<Integer> x = scaleByK(list); //insert it into our algorithm 
    System.out.print(x.toString());

  } 

  public static ArrayList<Integer> scaleByK(ArrayList<Integer> intList) {
      int index = 0;
      ArrayList<Integer> tintList = new ArrayList<Integer>();



      
      for (int each : intList) {
          
          for (int toRepeat = each; toRepeat > 0; toRepeat--) {
              tintList.add(index, each);
              index++;

          }
        
      }
      

      return tintList;
  }
}