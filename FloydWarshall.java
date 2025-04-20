public class FloydWarshall {
    public static int[][] warshall(int[][] arr, int n) {
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = arr[i][j]<(arr[i][k]+arr[k][j])?arr[i][j]:(arr[i][k]+arr[k][j]);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {0, 1000, 15, 40, 1000},
            {1000, 0, 1000, 25, 60},
            {15, 1000, 0, 10, 1000},
            {40, 25, 10, 0, 30},
            {1000, 60, 1000, 30, 0}
        };

        int n = arr.length;
        arr = warshall(arr, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
    }
}
