public class MatrixOps {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}}, b = {{5,6},{7,8}};
        int[][] sum = new int[2][2], prod = new int[2][2];
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++) {
                sum[i][j]=a[i][j]+b[i][j];
                prod[i][j]=a[i][0]*b[0][j]+a[i][1]*b[1][j];
            }
        System.out.println("Sum: " + sum[0][0] + " " + sum[0][1] + " " + sum[1][0] + " " + sum[1][1]);
        System.out.println("Prod: " + prod[0][0] + " " + prod[0][1] + " " + prod[1][0] + " " + prod[1][1]);
    }
}
