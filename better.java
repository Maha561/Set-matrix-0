
public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 0, 0, 1}
        };

       int m = matrix.length; // this is for row

        int n = matrix[0].length;  // this is for column

        // creating 2 arrays one row and another one for column

        boolean[] row = new boolean[m];

        boolean[] col = new boolean[n];



        for(int i =0 ;i<m;i++){

            for(int j =0;j<n;j++){

                if(matrix[i][j]==0){

                    row[i] = true;
                    col[j] = true;


                }
            }
        }

        for(int i =0 ;i<m;i++){

            for(int j =0;j<n;j++){

                if(row[i] || col[j] == true ){


                    matrix[i][j]=0;

                }
            }
        }

        for(int i =0 ;i<m;i++){

            for(int j =0;j<n;j++){

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }











    }
}