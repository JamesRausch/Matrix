package Matrix;
/** Deals with Matrix's
 */
public class Matrix {
    private int length;
    private int width;
    private double[][] data;

    /**
     * @param length The Length of the data matrix
     * @param width The Width of the data matrix
     * @param data Matrix containg data
     */
    public Matrix(int length, int width, double[][] data){
        this.length = length;
        this.width = width;
        this.data = data;

    }

    /**
     * @param m is the input Matrix
     * @return product is the original matrix added to the input matrix;
     */
    public Matrix plus(Matrix m){
        if(this.length != m.length || this.width != m.width){
            throw new IllegalArgumentException("Input Matrix Length and or Width does not match M's length or width");
        }
        double[][] product = new double[this.length][this.width];
        for(int i = 0; i < this.length; i++){
            for (int j = 0; j < this.width; j++){
                product[i][j] = this.data[i][j] + m.data[i][j];
            }
        }
        return new Matrix(m.length,m.width, product);
    }

    /**
     * @param m is the input Matrix
     * @return product is the original Matrix multiplied by the input matrix;
     */
    public Matrix multiply(Matrix m){
        if(this.length != m.width || this.width != m.length) {
            throw new IllegalArgumentException(("Input Matrix Length and or Width does not Match M's length or width"));
        }
        double[][] product = new double[this.length][m.width];

        for(int i = 0; i < this.length; i ++){
            for(int j = 0; j < m.width; j ++){
                for(int k = 0; k < this.width; k++ ){
                    product[i][j] = this.data[i][k] * m.data[k][j];
                }
            }
        }
        return new Matrix(this.length, m.width,product);
    }

    /**
     * @param obj is of type Matrix,
     * @return If Obj equals Destination Object
     */
    public boolean Equals(Object obj){
        Matrix hold;
        if(obj instanceof Matrix) {
            hold = ((Matrix) obj);
        } else {
            return false;
        }
        if(this.length == hold.length && this.width == hold.width){

                    for(int i = 0; i < this.width; i++){
                        for (int j = 0; j < this.length; j++){
                            if(this.data[i][j] != ((Matrix) obj).data[i][j]);{
                                return false;
                            }


                    }
                }
                    return true;
            } else {
            return false;
        }



    }
    //Homework get Rid of Static Methods InLine Methods, add Documentation, and Remake Testers
    //ObjectOrientation Reading and Explanation

}


