import java.util.Arrays;

public class Matrix<T> {
    private T[][] array;
    private int m=0, n=0;

    public Matrix(T[][] array) {
        this.array = array.clone();
        m=this.array.length;
        n=this.array[0].length;
    }
    public Matrix(int m, int n){
        array = (T[][]) new Object[m][n];
    }
    public T[][] transport(){
        T[][] res= (T[][]) new Object[this.n][this.m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[j][i]=this.array[i][j];
            }
        }

        return res;
    }
    public void madeMatrixTransport(){
        this.array=transport();
        this.m=array.length;
        this.n=array[0].length;
    }

    public T set(int m, int n, T elem){
        this.array[m][n]=elem;
        return elem;
    }

    @Override
    public String toString() {
        String res="";
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res+=this.array[i][j]+" ";
            }
            res+="\n";
        }
        return res;
    }
}