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

    public SuperArray() { this(10); }

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
     * @name | grow(Str[] array, int size)
     * @purpose | grow an array array to a certain size (adding old array with new int size)
     * @return a string array.
     * @deprecated | not used anywhere in this version 
     */
    /** 


    private String[] grow(String[] array, int size) {
      this.length = this.length + size;
      String[] temp = new String[this.length];

      int i = 0;
      for ( String elements : arr) {
        temp[i] = elements;
        i++;

      }
      array = temp;
      return array;

    }
    */

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
      String isNull;
      int i = 0;
      for (String elements : this.arr) {
        //loop through all the elements
        isNull = (isEmpty(i) ? elements : '\"' + elements + '\"');
        
        if (i >= this.length - 1) { 
          str += isNull + "]";
          break;
        }
        str += isNull + ", "; //if this spot is empty then we dont apply the " " onto the element 
        i++;
        //System.out.println(elements);
        
      }
      return str;

    }

     /***
     * @Name | add(Str val)
     * @purpose | adds to string value to the superArray.
     * @see append(String val), essentially the same thing but re-worded.
     * @return nothing
     */

    public void add(String... val) {
      add(this.length - 1, val);

    }

     /***
     * @Name | add(int index, Str *value)
     * @purpose | adds to string value to the superArray but with index this time.
     * @return nothing
     */

    public void add(int index, String... value) {
      if (index > this.length - 1) throw new IndexOutOfBoundsException("(SuperArray | add) Index out of bound : " + index);
      this.length = this.length + value.length;
      String[] temp = new String[this.length]; //length of the amount of value we are going to stuff in.
      //System.out.println(temp.length);

      int toIndex = index + 1; //this is to find the spot where our new set of values will live. so if..
      /**
       * ["one", "two", "three"], we want to add "uno" and "dos" after "two" so..
       *   (0)    (1)     (2)
       * : superarr.add(1, "uno", "dos");
       * 
       * we make new temp arr with length of previous int length value (3) and the amount of value we have (2)
       * [null, null, null, null, null]
       *         x     *
       * we loop through one by one, until we hit the third one, if we only had the index (see x) to go off of we will be overwriting it with it's
       * original value of "two". the (*) is what we want so we can add.
       * 
       * we need to preserve two but if the index to overwrite is the original index, the loop will just overwrite index 1 which is "two".
       * 
       * 
       */
      int i = 0, z = 0; 
      while (i < temp.length - 1) {
        if (toIndex == i){ //if this is the index where to push in all the values
          for (String elements : value) {
            // loops through each value in the string[] we get from the arguments..

            //System.out.println("X adding values : " + elements + " at this value " + i);
            temp[i] = elements; 
            //System.out.println(temp[i]);
            
            i++;

          }
          

        } else { // if it is not then we just keep copying on.
          //System.out.println("adding values : " + this.arr[z] + " at this value " + i);
          //System.out.println(z + " z");
          //System.out.println(i + " i");
          temp[i] = this.arr[z];
          
          //System.out.println(temp[i]);
          i++;
          z++;
          
        }
        
      }
      
      this.arr = temp;
      
      //System.out.println(temp[4]);
      
      


    }

      /***
     * @Name | append(Str val)
     * @purpose | appends a string value to the superArray.
     * @see add(String val), essentially the same thing but re-worded.
     * @return nothing
     */

    public void append(String... val) {
      add(this.length - 1, val);
    }

     /***
     * @Name | set(Str val)
     * @purpose | adds to string value to the superArray.
     * @return nothing
     */

    public void set(int index, String value) {
      this.arr[index] = value;

    }

      /***
     * @Name | remove(int *index)
     * @purpose | removes a element from our super arr.
     * 
     * example :
     * 
     * ["one", "two", "three", "four"]
     * 
     * We want to remove the second element  ("two") as well as the final one (four), so : superarr.remove(2, superarr.length - 1)
     * it will set those to null
     * 
     * ["one", null, "three", "null"]
     * 
     * then the loop will clear all null values and we will have a clean ["one", "three"].
     * 
     * @return Nothing
     */

    public void remove(int... index) {

      //if (index > this.length) return "Index out of bounds for :" + index;
      for (int args : index) { 
        if (args > this.length - 1) throw new IndexOutOfBoundsException("(Super Array | remove) Index out of bound for argument : " + args);
        this.arr[args] = null;

      }
       //Sets the position as null so the code below can handle it.
      
      this.length = this.length - index.length; //since we can only remove one this is fine.
      String[] temp = new String[this.length]; //new temporary string

      int i = 0; //iteration number
      for (String elements : this.arr) {
        if (elements != null) {
          temp[i] = elements;
          i++;
          
        }

        
      }
      this.arr = temp;

    }
     /***
     * @Name | pop(Str val)
     * @purpose | "pops" or removes last index of this array. 
     * @see remove()
     */
    public void pop() {
      remove(this.length);
    }
    /**
     * @name | get(int index)
     * @purpose | get back a specific index of an array
     * @param index | 
     * @return
     */

    public String get(int index) {
      return this.arr[index];

    }
    /**
     * @name | get()
     * @purpose | get back the whole array
     * @return
     */

    public String[] get() {
      return this.arr;
    }


    
    

 }
