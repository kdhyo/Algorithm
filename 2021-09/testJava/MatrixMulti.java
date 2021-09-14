package testJava;

public class MatrixMulti {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(var i = 0; i < arr1.length; i++) {
            for(var j = 0; j < arr2[0].length; j++) {
                for(var k = 0; k < arr2.length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        var matrix = new MatrixMulti();

        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = new int[][]{{1, 4}, {2, 5}, {3, 6}};

        matrix.solution(arr1, arr2);
    }
}
