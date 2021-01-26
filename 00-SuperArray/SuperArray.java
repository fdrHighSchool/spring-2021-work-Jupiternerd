

/**
 *  @author : Wai Hlaing
 * 
 */
class Data {
  public Object value;

  public Data(Object value) {
    this.value = value;

  }

  public Data() {
    this.value = null;
  }

  public Object getData() {

    return this.value;

  }
}

public class SuperArray {
    public int length;
    private Data[] arr;

     /***
     * @Name | SuperArray(int arrlength)
     * @purpose | Make a new super array
     * @param arrLength | Takes in an int to build a new SuperArray.
     * @return new SuperArray
     */

    public SuperArray(int arrLength) {
      this.length = arrLength;
      this.arr = new Data[arrLength];
      for (Object stuff : this.arr ) {
        System.out.println(stuff);
      }
      //System.out.println(this.arr.toString());

    }

     /***
     * @name | SuperArray()
     * @purpose | Make a new super array, but has no params so we pass it onto another constructor with a predefined length : 10
     * @return new SuperArray
     */

    public SuperArray() {
      this(10);

    }

     /**
     * @name | grow(int size)
     * @purpose | grow this array to a certain size (adding old array with new int size)
     * @return new arr
     */

    public Data[] grow(int size) {
      this.length = this.length + size;
      Data[] temp = new Data[this.length];

      int i = 0;
      for ( Data elements : arr) {
        temp[i] = elements;
        i++;

      }
      this.arr = temp;
      return this.arr;

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

      if (this.arr[index].value == null) flag = true;
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
      for (Data elements : this.arr) {
        //loop through all the elements
        
        if (i >= this.length - 1) { 
          str += elements.value + "]"; 
          break;
        }
        str += (isEmpty(i) ? elements.value : '\"' + elements.value.toString()+ '\"') + ", "; //if this spot is empty then we dont apply the " " onto the element 
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