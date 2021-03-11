//Group: Thomas Huang && Wai Hlaing
import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 8, 19, 42, 7, 26, 19, -8)); //new arraylist 

    ArrayList<Integer> x = reverse3(list); //insert it into our algorithm 
    System.out.print(x.toString());
  } 

  /**
   * @Name | reverse3
   * @Purpose | reverse the order for every three indexes, if the index is not divisible by 3 then we ignore the whole set of those three.
   * [3, 8, 19, 42, 7, 26, 19, -8]
   * 
   * Final Result is [19, 8, 3, 26, 7, 42, 19, -8]
   * Notice how 19 and -8 are not touched since they were only one index away from being flipped. 
   * 
   * @param |intList
   * @return sorted List
   */

  public static ArrayList<Integer> reverse3(ArrayList<Integer> intList) {
    int size = intList.size(); //we get the size of the whole list to use for later.
    ArrayList<Integer> temp = new ArrayList<Integer>();
    //we make a temporary one to store our reversed integers.

    for(int limit = size / 3; limit > 0; limit--) {
    // limit = size / 3 which will equate to the highest divisible # since its an int on int action.
    //we use that to control how many times we want to run this alg, we subtract it every time it is ran.


    /**
     * int limit = 8 / 3 = 2 (3 * 2 == 6) 
     * 
     * Since 6 is the highest it can divide we get 2 as it's quotient. We then use it to limit how many times our alg is ran so we dont over
     * run the integers that did not fit the criteria.
     * 
     * First run may look like this, see previous example.
     * 
     * intList = [?, ?, ?, 42, 7, 26, 19, -8]
     * 
     * The questionmarks are the ones that got deleted and moved to the temp array. Since they are removed 
     * from right to left it automatically gets flipped. 
     * 
     * We then let it run through it's course and we end up with 
     * 
     * intList = [19, -8]
     * 
     * Which is not touched since the alg finished working through two loops.
     */
      for(int counter = 2; counter >= 0; counter--) { 
          /**
           * we remove the ints right to left, starting with the one here:
           * [19, 8, 3, 26, 7, 42, 19, -8]
           *         ^
           * which has the index of 2 and is the limit we were given to where we stop the flipping.
           * then as the counter decrements we start removing the left two final ones. 
           * Then we are left with the one we see in the above above example.
           * 
           */

        //we get the integer to remove so that we can add it to our temp arraylist.
        int toRemove = intList.remove(counter);
        //we delete it.
        temp.add(toRemove);
        //we add it to the temp array, remember we are adding the ones right to left so it will look like this:
        //[3, 8, 19, ...]
        
      }
    
      
    }
    /**
     * finally we append the intList which is now reduced to this :
     * 
     * intList = [19, -8] 
     * 
     * to the final temp array.
     * resulting in the final:
     * 
     * [3, 8, 19, 42, 7, 26, 19, -8]
     */

    temp.addAll(intList);
    
    return temp;
  
  }
}
