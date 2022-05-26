public class Main {
    public static void main(String[] args) {
        Integer [][] matrix=new Integer[3][2];
        matrix[1][0]=10;
        Matrix<Integer> matrixClass=new Matrix<Integer>(matrix);
        System.out.println(matrixClass);
        matrixClass.madeMatrixTransport();
        System.out.println(matrixClass);
    }
}
