/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix2d;

import java.util.Arrays;

/**
 * 2 boyutlu matrisler tanımlayabilen ve bu matrsler üzerinde çeşitli işlemler yapabilen bir class'dır.
 *
 * @author Oğuz Sözen
 */
public class Matrix2D {

    float[][] arr;
    
    Matrix2D(int row, int column) {
        arr = new float[row][column];
    }
    
    Matrix2D(int row, int column, float value) {
        arr = new float[row][column];

        for (int i = 0; i < row; i++) {
            Arrays.fill(arr[i], value);
        }
    }
    
    Matrix2D(float[][] arr) {
        this.arr = arr;
    }

    public int getRowSize() {
        return arr.length;
    }

    public int getColumnSize() {
        return arr[0].length;
    }

    public float getValue(int row, int column) {
        return arr[row][column];
    }

    public void setValue(int row, int column, float value) {
        arr[row][column] = value;
    }

    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < getRowSize(); i++) {
            output += Arrays.toString(arr[i]) + "\n";
        }

        return output;
    }

    public Matrix2D Transpose() {
        Matrix2D newMat = new Matrix2D(getColumnSize(), getRowSize());

        for (int i = 0; i < newMat.getRowSize(); i++) {
            for (int j = 0; j < newMat.getColumnSize(); j++) {
                newMat.setValue(i, j, getValue(j, i));
            }
        }

        return newMat;
    }

    public static Matrix2D add(Matrix2D mat1, Matrix2D mat2) throws Exception {

        if (mat1.getRowSize() != mat2.getRowSize() || mat1.getColumnSize() != mat2.getColumnSize()) {
            throw new Exception("Matris boyutları aynı değil.");
        }

        Matrix2D newMat = new Matrix2D(mat1.getRowSize(), mat1.getColumnSize());

        for (int i = 0; i < newMat.getRowSize(); i++) {
            for (int j = 0; j < newMat.getColumnSize(); j++) {
                newMat.setValue(i, j, mat1.getValue(i, j) + mat2.getValue(i, j));
            }
        }

        return newMat;
    }

    public static Matrix2D subtract(Matrix2D mat1, Matrix2D mat2) throws Exception {

        if (mat1.getRowSize() != mat2.getRowSize() || mat1.getColumnSize() != mat2.getColumnSize()) {
            throw new Exception("Matris boyutları aynı değil.");
        }

        Matrix2D newMat = new Matrix2D(mat1.getRowSize(), mat1.getColumnSize());

        for (int i = 0; i < newMat.getRowSize(); i++) {
            for (int j = 0; j < newMat.getColumnSize(); j++) {
                newMat.setValue(i, j, mat1.getValue(i, j) - mat2.getValue(i, j));
            }
        }

        return newMat;
    }

    public static Matrix2D scalarMultiply(Matrix2D mat1, Matrix2D mat2) throws Exception {

        if (mat1.getRowSize() != mat2.getRowSize() || mat1.getColumnSize() != mat2.getColumnSize()) {
            throw new Exception("Matris boyutları çarpım için uygun değil.");
        }

        Matrix2D newMat = new Matrix2D(mat1.getRowSize(), mat1.getColumnSize());

        for (int i = 0; i < newMat.getRowSize(); i++) {
            for (int j = 0; j < newMat.getColumnSize(); j++) {
                newMat.setValue(i, j, mat1.getValue(i, j) * mat2.getValue(i, j));
            }
        }

        return newMat;
    }

    public static Matrix2D multiply(Matrix2D mat1, Matrix2D mat2) throws Exception {

        if (mat1.getColumnSize() != mat2.getRowSize()) {
            throw new Exception("Matris boyutları çarpım için uygun değil.");
        }

        Matrix2D newMat = new Matrix2D(mat1.getRowSize(), mat2.getColumnSize());

        for (int i = 0; i < newMat.getRowSize(); i++) {
            for (int j = 0; j < newMat.getColumnSize(); j++) {

                float temp = 0f;

                for (int k = 0; k < mat1.getColumnSize(); k++) {
                    temp += mat1.getValue(i, k) + mat2.getValue(k, j);
                }

                newMat.setValue(i, j, temp);
            }
        }

        return newMat;
    }
}
