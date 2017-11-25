package Package016;

/**
 * created by cicek on 25.11.2017 20:01
 */

public class Arrays06 {
    public static void main(String[] args){

        int[][] array1={{1,2,3},{4,5,6},{1,1,1}};
        int[][] array2={{7,8,9},{2,2,2},{3,3,3}};

        int[][] sum = new int[3][3];

        System.out.printf("\nArray 1 ; \n");
        outputArray(array1);

        System.out.printf("\nArray 2 ; \n");
        outputArray(array2);

        for (int r=0;r<3;r++){

            for (int c=0;c<3;c++){

                sum[r][c]=array1[r][c]+array2[r][c];

            }
        }

        System.out.printf("\nArray1 + Array 2 ; \n");
        outputArray(sum);
    }//main


    public static void outputArray(int[][] array){//

        for (int row=0;row<array.length;row++){

            for (int column=0;column<array.length;column++){

                System.out.printf("%d ",array[row][column]);
            }
            System.out.println();

        }
    }//
}
