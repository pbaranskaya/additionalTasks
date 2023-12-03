package OOP_Matrix;
import java.util.Arrays;
import java.util.Random;


public class Matrix {

    double[][] matrix;
    int lines;
    int columns;


    public Matrix(int lines, int columns) {
        super();
        this.lines = lines;
        this.columns = columns;
        matrix = new double[lines][columns];
        Random rand = new Random();
        for (int i = 0;i < matrix.length;i++) {
            for (int j = 0;j < matrix[i].length;j++) {
                matrix[i][j] = rand.nextDouble(10);
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static double[][] sum(double[][] first, double[][] second) {
        int lines = first.length;
        int columns = first[0].length;
        double[][] sum = new double[lines][columns];

        for (int r = 0; r < lines; r++) {
            for (int c = 0; c < columns; c++) {
                sum[r][c] = first[r][c] + second[r][c];
            }
        }
        return sum;
    }



    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.toString(matrix) +
                ", lines=" + lines +
                ", columns=" + columns +
                '}';
    }
}
