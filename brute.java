public public class brute {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };

        for(int i =0;i< matrix.length;i++){

            for(int j=0;j< matrix[0].length;j++){

                if(matrix[i][j]==0){

                    System.out.println("Zero at: " + i + ", " + j);

                    // for row
                    for(int col = 0 ;col<matrix[0].length;col++){

                       if(matrix[i][col]!=0){

                           matrix[i][col] =  -1;

                       }

                       // for col


                        }

                    for(int row = 0;row< matrix.length;row++ ){

                        if(matrix[row][j] !=0 ){

                            matrix[row][j] = -1;
                        }
                    }



                }
            }
        }

        // for changing -1 to 1

        for(int i =0;i< matrix.length;i++){

            for(int j=0;j< matrix[0].length;j++){

               if(matrix[i][j]==-1){

                   matrix[i][j] = 0;


               }
            }



        }

        for(int i =0;i< matrix.length;i++){

            for(int j=0;j< matrix[0].length;j++){

                System.out.print(matrix[i][j] + " ");


            }

            System.out.println();
        }


    }
} {
    
}
