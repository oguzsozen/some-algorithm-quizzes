/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix2d;

/**
 *
 * @author Oğuz Sözen
 */
public class Main {

    public static void main(String[] args) {

        float[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrix2D mat1 = new Matrix2D(3, 3, 5);
        Matrix2D mat2 = new Matrix2D(arr);

        System.out.println("Matrix 1:\n" + mat2.Transpose());
        System.out.println("Matrix 2:\n" + mat2.Transpose());
        System.out.println("Matrix 2 Transpose:\n" + mat2.Transpose());

        try {
            System.out.println("Matrix 1 + Matrix 2:\n" + Matrix2D.add(mat1, mat2));
            System.out.println("Matrix 1 - Matrix 2:\n" + Matrix2D.subtract(mat1, mat2));
            System.out.println("Matrix 1 * Matrix 2:\n" + Matrix2D.multiply(mat1, mat2));
            System.out.println("Matrix 1 .* Matrix 2:\n" + Matrix2D.scalarMultiply(mat1, mat2));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
