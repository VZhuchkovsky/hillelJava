package NumericalMethods;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Влад on 02.06.2015.
 */
public class IterativeMethod {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double eps = 0.001;
        double[][] A = {{1, -0.22, 0.11, -0.31},
                        {-0.38, 1, 0.12, -0.22},
                        {-0.11, -0.23, 1, 0.51},
                        {-0.17, 0.21, -0.31, 1}};
        int n = A.length;
        matrixDisplay(A, n);
        double[] F = {2.7, -1.5, 1.2, -0.17};
        double[] X = F;


        System.out.println("\n\n" + Arrays.toString(X));

        Jacobian(eps, A, n, F, X);

        System.out.println("\n\n" + Arrays.toString(X));
    }

    private static void Jacobian(double eps, double[][] a, int n, double[] f, double[] x) {
        double norm;
        double[] tempX = new double[n];
        do {
            for (int i = 0; i < n; i++) {
                tempX[i] = f[i];
                for (int g = 0; g < n; g++) {
                    if (i != g)
                        tempX[i] -= a[i][g] * x[g];
                }
                tempX[i] /= a[i][i];
            }
            norm = Math.abs(x[0] - tempX[0]);
            for (int h = 0; h < n; h++) {
                if (Math.abs(x[h] - tempX[h]) > norm)
                    norm = Math.abs(x[h] - tempX[h]);
                x[h] = tempX[h];
            }
        } while (norm > eps);
    }
   // for(int i = 0;)

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
