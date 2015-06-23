package NumericalMethods;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Влад on 03.06.2015.
 */
public class Iteration {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double accuracy = 0.001;
        /*double[][] B = {
                {0.13, 0.23, -0.44, -0.05},
                {0.24, 0, -0.31, 0.15},
                {0.06, 0.15, 0, -0.23},
                {0.72, -0.08, -0.05, 0}*/
        double[][] B = {
                {0, -0.1333333333333333, 0.0666666666666667, 0.0666666666666667},
                {0.1, 0, -0.1, -0.2},
                {-0.1666666666666667, -0.0833333333333333, 0, -0.0833333333333333},
                {-0.0909090909090909, -0.0909090909090909, -0.0909090909090909, 0}
        };
       // double[] F = {2.13, -0.18, 1.44, 2.42};
        double[] F = {1.466666666666667, 1.4, -0.8333333333333333, -1.818181818181818};
        double[] Xo = F;
        matrixDisplay(B,B.length);

        System.out.println("\n\n" + Arrays.toString(Xo));

        double[] X = jacobiIteration(B,F,Xo,accuracy);

        System.out.println("\n\n" + Arrays.toString(X));
        System.out.println();

    }

    public static double[] jacobiIteration(double[][] B, double[] F, double[] Xo, double accuracy) {
        double norm;
        double[] tX = new double[B.length];
        double sum = 0;
        tX[0] = 0;
        do {
            for (int i = 0; i < B.length; i++) {
                for (int j = 1; j < B.length; j++) {
                    sum += B[i][j] * tX[j];
                }
                tX[i] = sum + F[i];
                return tX;

            }
            norm = Math.abs(Xo[0] - tX[0]);
            for (int n = 0; n < B.length; n++) {
                if (Math.abs(Xo[n] - tX[n]) > norm)
                    norm = Math.abs(Xo[n] - tX[n]);
                Xo[n] = tX[n];
            }
        }
        while (norm > accuracy);
        return tX;
    }
    private static void matrixDisplay(double[][] array, int length) throws IOException, ClassNotFoundException {
        int k = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (k != i) {
                    System.out.println("\t");
                }
                k = i;
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(array[i][j]);
            }
        }
    }
}
