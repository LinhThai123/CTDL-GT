import java.net.Socket;

public class _1572_Matrix_Diagonal_Sum {
      public static void main(String[] args) {
            int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9}};
            System.out.println(diagonalSum(mat));
      }
      public static int diagonalSum(int[][] mat) {
            int sum1 = 0;
            int sum2 = 0; 
            for (int i = 0; i < mat.length; i++) {
                  for (int j = 0; j < mat.length; j++) {
                        if (i == j) {
                              sum1 = sum1 + mat[i][j];
                        }
                        if (i + j == mat.length - 1) {
                              sum2 = sum2 + mat[i][j];
                        }
                  }
            }
            int soOgiua = 0; 
                  if (mat.length % 2 != 0) {
                        soOgiua = mat[mat.length / 2][mat.length / 2]; 
                  }
            return sum1 + sum2 - soOgiua; 
      }
}
