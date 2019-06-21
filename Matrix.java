package linearAlgebra;

/** Deals with Matrix's
 */
public class Matrix {
    private int length;
    private int width;
    private int[][] data;

    /**
     * @param length The Length of the data matrix
     * @param width The Width of the data matrix
     * @param data Matrix containg data
     */
    public Matrix(int length, int width, int[][] data){
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
        int[][] product = new int[this.length][this.width];
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
        int[][] product = new int[this.length][m.width];

        for(int i = 0; i < this.length; i ++){
            for(int j = 0; j < m.width; j ++){
                for(int k = 0; k < this.width; k++ ){
                    product[i][j] = this.data[i][k] * m.data[k][j];
                }
            }
        }
        return new Matrix(this.length, m.width,product);
    }
    public static void main(String[] args) {
        int[][] aData = new int[1][1];
        aData[0][0] = 1;
        aData[0][1] = 0;
        aData[1][0] = 1;
        aData[1][1] = 2;
        int[][] bData = new int[0][1];
        bData[0][0] = 1;
        bData[0][1] = 2;
        int[][] cData = new int[1][1];
        cData[0][0] = 4;
        cData[0][1] = 5;
        cData[1][0] = 1;
        cData[1][1] = 2;

        Matrix aMatrix = new Matrix(2,2,aData);
        Matrix bMatrix  = new Matrix(2,2,bData);
        Matrix cMatrix = new Matrix(2,2,cData);
        Matrix dMatrix = aMatrix.plus(bMatrix);
        Matrix productMatrix = dMatrix.multiply(cMatrix);





    }
    //Homework get Rid of Static Methods InLine Methods, add Documentation, and Remake Testers
    //ObjectOrientation Reading and Explanation

}
