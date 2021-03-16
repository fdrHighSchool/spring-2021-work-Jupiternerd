import java.util.*;

public class Points{
    private int x;
    private int y;

    
    /**
     * Name | Points
     * does | constructor for when there is no args.
     */
    public Points(){
      this.x = 0;
      this.y = 0;
    }
    /**
     * Name | Points
     * does | constructor for when there is x and y.
     */
    public Points(int x , int y){
        set(x,y);
    }
    /**
     * Name | set
     * does | sets x and y values.
     */
    public void set(int x ,int y){
      this.x = x;
      this.y = y;
    }
    /**
     * name | setX
     * does | sets x
     * @param x
     */
    public void setX(int x){
        this.x = x;
        
    }
    /**
     * name | setY
     * does | sets y
     * @param y
     */
    public void setY(int y){
        this.y = y;
        
    }
    /**
     * name | getX
     * does | gets back x;
     * @return int x
     */
    public int getX(){
      return this.x;
    }
    /**
     * name | getY
     * does | gets back y;
     * @return int y
     */
    public int getY(){
      return this.y;
    }
    /**
     * name | distanceFromOrigin
     * does | gets back x;
     * @return int of distance from the origin
     */
    public double distanceFromOrigin(){
        int x = this.x;
        int y = this.y;
      return Math.sqrt(x * x + y * y);
    }
      /**
     * name | translate
     * does | translates it to a location. +, -
     */
  public void translate(int x2,int y2){
    set(this.x + x2, this.y + y2);
  }
  /**
   * name | distance
   * does | gets back distance
   * @param point
   * @return
   */
  public double distance(Points point){
      int pX = point.getX();
      int pY = point.getY();
      //Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
    return Math.sqrt(Math.pow(this.x - pX, 2) + Math.pow(this.y - pY, 2));
  }
  /**
   * name | midpoint 
   * does | gets back midpoint
   */
  public Points midpoint(Points point){
    int x=((this.x + point.getX())/2);
    int y=((this.y + point.getY())/2);
    return new Points(x,y);
  }
  /**
   * name | slope
   * does | finds slope of point.
   * @param point
   * @return double
   */
  public double slope(Points point){
       int pX = point.getX();
       int pY = point.getY();
    return ((pY-this.y)/(pX-this.x));
  }
  /**
   * name | is Colinear 
   * does | see if 2 points are colinear
   * @param point
   * @param point2
   * @return boolean 
   */
  public boolean isColinear(Points point, Points point2) {
      if (this.slope(point) == this.slope(point2)){
        return true;
      }
      return false;
  }
  /**
   * name | toString
   * does | converts to readable format.
   */
  public String toString(){
    return "(" + this.x + ", " + this.y + ")";
    }
  } 
