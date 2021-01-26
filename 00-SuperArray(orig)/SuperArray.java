/**
 *  @author : Wai Hlaing
 * 
 */


public class SuperArray {
    public int length;
    private String[] arr;

     /***
     * @Name | SuperArray(int arrlength)
     * @purpose | Make a new super array
     * @param arrLength | Takes in an int to build a new SuperArray.
     * @return new SuperArray
     */

    public SuperArray(int arrLength) {
      this.length = arrLength;
      this.arr = new String[arrLength];
      
    }

     /***
     * @name | SuperArray()
     * @purpose | Make a new super array, but has no params so we pass it onto another constructor with a predefined length : 10
     * @return new SuperArray
     */

    public SuperArray() {
      this(10);

    }

     /***
     * @name | SuperArray()
     * @purpose | Make a new super array, But takes in your weak old previous array and rebrands it with our own SuperArray tm.
     * @return new SuperArray
     */

    public SuperArray(String[] pastArr) {
      this.arr = pastArr;
      this.length = pastArr.length;

    }

     /**
     * @name | grow(int size)
     * @purpose | grow this array to a certain size (adding old array with new int size)
     * @return nothing
     */

    public void grow(int size) {
      this.length = this.length + size;
      String[] temp = new String[this.length];

      int i = 0;
      for ( String elements : arr) {
        temp[i] = elements;
        i++;

      }
      this.arr = temp;

    }

      /***
     * @Name | isEmpty()
     * @purpose | Checks if this SuperArray is empty, if it is then it return true.
     * @return boolean
     */

    public boolean isEmpty() {
      boolean flag = false;
      if (this.length == 0) return true;

      for(int i = 0; i < this.length; i++) {
        flag = isEmpty(i);
        if (flag == true) break; 

      }
      return flag;
      
    }

     /***
     * @Name | isEmpty(int index)
     * @purpose | Checks if this SuperArray is empty, if it is then it return true.
     * @return boolean
     */

    public boolean isEmpty(int index) {
      boolean flag = false;

      if (this.arr[index] == null) flag = true;
      return flag;

    }

      /***
     * @Name | toString()
     * @purpose | Presents arr in a readable manner.
     * @return boolean
     */

    public String toString() {
      //if (isEmpty()) return "Your SuperArray(tm) is Empty!"; Stupid idea
      String str = "[";
      int i = 0;
      for (String elements : this.arr) {
        //loop through all the elements
        
        if (i >= this.length - 1) { 
          str += elements + "]"; 
          break;
        }
        str += (isEmpty(i) ? elements : '\"' + elements + '\"') + ", "; //if this spot is empty then we dont apply the " " onto the element 
        i++;
        
      }


      return str;

    }

    public void add(String val) {
      add(this.length, val);

    }

    public void add(int index, String value) {

    }

    public void append(String val) {
      add(val);
    }

    public void set(int index, String value) {

    }
    
    public String remove(int index) {
      String ret = "";

      return ret;

    }

    public String pop() {
      String ret = "";

      return ret;

    }


    
    

 }
