
public class Main {
    public static void main(String[] args) {

        // inialize 2d array

        int[][] matrix = new int[5][2];

        // assigning values manually
        matrix[0][0] = 12;
        matrix[0][1] = 89;

        matrix[1][0] = 45;
        matrix[1][1] = 67;

        matrix[2][0] = 23;
        matrix[2][1] = 90;

        matrix[3][0] = 11;
        matrix[3][1] = 56;

        matrix[4][0] = 78;
        matrix[4][1] = 34;

        // print matrix

        for(int i =0;i< 5;i++){

            for(int j = 0;j<2;j++){

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();


        }
    }
}