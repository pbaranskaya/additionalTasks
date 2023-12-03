package OOP_Matrix;

import java.util.Arrays;

import static OOP_Matrix.Matrix.sum;


public class MatrixApp {


    public static void main(String[] args) {

        Matrix m1 = new Matrix(2,3);
        Matrix m2 = new Matrix(2,3);


        double[][] m3 = {{1,2}, {3,4}, {5,6}};
        double[][] m4 = {{1,2}, {3,4}, {5,6}};

        System.out.println("Сумма матриц: " + Arrays.deepToString(sum(m3,m4)));



    }
}
