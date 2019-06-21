package linearAlgebraTester;

import linearAlgebra.Matrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @Test
    void addMatrix() {

        int[][] a = new int[2][1];
        int[][] b = new int[2][1];
        int[][] c = new int[2][1];
        a[0][0] = 0;
        a[0][1] = 1;
        a[0][2] = 2;
        a[1][0] = 9;
        a[1][1] = 8;
        a[1][2] = 7;
        Matrix matrixa = new Matrix(2,1, a);

        b[0][0] = 6;
        b[0][1] = 5;
        b[0][2] = 4;
        b[1][0] = 3;
        b[1][1] = 4;
        b[1][2] = 5;
        Matrix matrixB = new Matrix(2,1,b);
        c[0][0] = 6;
        c[0][1] = 6;
        c[0][2] = 6;
        c[1][0] = 12;
        c[1][1] = 12;
        c[1][2] = 12;
        Matrix matrixC = new Matrix(2,1,c);
        assertEquals(matrixC,matrixa.plus(matrixB));
    }

    @Test
    void mulMatrix() {

        int[][] a = new int[1][2];
        int[][] b = new int[2][1];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        b[0][0] = 7;
        b[0][1] = 8;
        b[1][0] = 9;
        b[1][1] = 10;
        b[2][0] = 11;
        b[2][1] = 12;
        int[][] c = new int[1][1];
        c[0][0] = 58;
        c[0][1] = 64;
        c[1][0] = 139;
        c[1][1] = 154;
        Matrix matrixA = new Matrix(1,2,a);
        Matrix matrixB = new Matrix(2,1,b);
        Matrix matrixC = new Matrix(1,1,c);
        assertEquals(matrixC,matrixA.multiply(matrixB));
        int[][] d = new int[3][1];
        int[][] e = new int[0][1];
        e[0][0] = 0;
        e[0][1] = 1;
        d[0][0] = 1;
        d[0][1] = 2;
        d[1][0] = 1;
        d[1][1] = 0;
        d[2][0] = 1;
        d[2][1] = 2;
        d[3][0] = 3;
        d[3][1] = 4;
        int[][] f = new int[0][1];
        f[0][0] = 3;
        f[0][1] = 4;
        Matrix matrixD = new Matrix(3,1,d);
        Matrix matrixE = new Matrix(0,1,e);
        Matrix matrixF = new Matrix(0,1,f);
        assertEquals(f,matrixE.multiply(matrixF));
        int[][] g = new int[3][1];
        g[0][0] = 1;
        g[0][1] = 0;
        g[1][0] = 1;
        g[1][1] = 0;
        g[2][0] = 1;
        g[2][1] = 0;
        g[3][0] = 0;
        g[3][1] = 1;
        int[][] h = new int[0][1];
        h[0][0] = 0;
        h[0][1] = 1;
        int[][] i = new int[0][1];
        i[0][0] = 0;
        i[0][1] = 1;
        Matrix matrixG = new Matrix(3,1,g);
        Matrix matrixH = new Matrix(0,1,h);
        Matrix matrixI = new Matrix(0,1,i);
        assertEquals(matrixI,matrixG.multiply(matrixH));


    }

}
