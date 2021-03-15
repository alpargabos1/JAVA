package lab5_2;

import java.util.Random;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double[][] data) {
        this.data = data;
        this.rows = data[0].length;
        this.columns = data.length;
    }

    public Matrix(Matrix matrix) {
        this.columns = matrix.columns;
        this.rows = matrix.rows;
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] = matrix.data[i][j];
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void fillRandom(double a, double b) {
        Random r = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] = a + (r.nextDouble() * (b - a));

            }
        }
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        int i, j;
        Matrix result = new Matrix(m1.rows, m1.columns);

        if (m1.rows != m2.rows || m1.columns != m2.columns) {
            System.out.println("Nem osszeadhato!");
            return null;
        }

        for (i = 0; i < m1.rows; i++) {
            for (j = 0; j < m1.columns; j++) {
                result.data[i][j] = m1.data[i][j] + m2.data[i][j];
            }
        }
        return result;
    }

    public static Matrix multiply(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(m1.rows, m2.columns);
        if (m1.columns != m2.rows) {
            System.out.println("Nem szorozhato!");
            return null;
        }
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.columns; j++) {
                for (int k = 0; k < m2.rows; k++) {
                    result.data[i][j] = m1.data[i][k] * m2.data[k][j];
                }
            }
        }
        return result;
    }

    public static Matrix transpose(Matrix matrix) {
        if (matrix == null) {
            System.out.println("A matrix ures!");
            return null;
        }
        Matrix result = new Matrix(matrix.columns, matrix.rows);
        for (int i = 0; i < matrix.columns; i++) {
            for (int j = 0; j < matrix.rows; j++) {
                result.data[i][j] = matrix.data[j][i];
            }
        }
        return result;
    }

    public void printMatrix() {
        if (this.data == null) {
            System.out.println("A matrix ures!");
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(this.data[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


}
