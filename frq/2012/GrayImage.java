

public class GrayImage {

    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private static int[][] pixelValues = { {255, 184, 178, 84, 129}, {84, 255, 255, 130, 84}, {78, 225, 0, 0, 78}, {84, 130, 255, 130, 84}};
    /**
     * name | countWhitePixels() 
     * do | Counts white pixels in the pixelValues.
     * @return bucket | how many white pixels there are.
     */
    public static int countWhitePixels() {
        int bucket = 0;

        for (int[] rows : pixelValues) {
            //for loop to loop through the rows one by one, getting a row;
            for (int pixel : rows) {
                //we get the int pixel of each column in this row.
                if (pixel == WHITE) {
                    //if it is white we add it to the list.
                    bucket++;

                }

            }

        }

        return bucket;
        

    }
    /**
     * name | processImage()
     * do | gets x + 2,  y + 2 of each pixel (if it exists). Subtracts it with original and replaces it. If it is less than 0 we just put in 0.
     * 
     * params | None
     * 
     */

    public static void processImage() {
        int rLimit = pixelValues.length - 3; //hard limit so we dont go out of bounds.
        //  1 = account for arrays starting at 0;
        //+ 2 = account for the + 2 positional shift of the second value.
        //  3 
        
        System.out.println(rLimit);

        for (int row = 0; row <= rLimit; row++) {
     
            int[] pRow = pixelValues[row];
            int cLimit = pRow.length - 3;

            for (int col = 0; col <= cLimit; col++) {
                int valueOne = pRow[col];
                int valueTwo = pixelValues[row + 2][col + 2];
                int processed = valueOne - valueTwo;

                pixelValues[row][col] = ((processed) > 0 ? processed : 0);
                //is the processed number bigger than zero? if it is then we let it retun itself but if it isnt we return 0;


                
                

            }



        
        }

        System.out.println(pixelValues[0][0]);
        

    } 

    
}
