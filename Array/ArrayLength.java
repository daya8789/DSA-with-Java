public class ArrayLength{
    public static void main(String[] args) {
        int arr[][] = {{45, 42, 54, 78}, {78, 56, 21}, {13, 55, 58}};
        int multiArray[][][] = {{{7,8,5,4,8,6,5,7,2},{4,5,8,6,2}},{{1,2,3,4,5,6,7},{7,8,5,4,6,42},{8,9,5,4,6,2,1}}};
        // System.out.println("Length of array is : "+arr.length);
        // System.out.println("The length of Array of Array is :   "+arr[0].length);
        // for(int i=0; i<arr.length; i++){
        //     System.out.println("Length of Array is: "+arr[i].length);
        // }

        System.out.println(multiArray.length);
        System.out.println(multiArray[1].length);

        for(int i=0; i<multiArray.length; i++){
            //System.out.print(multiArray[i].length);
            for(int j=0; j<multiArray[i].length; j++){
                //System.out.print(multiArray[i][j].length);
                for(int k=0; k<multiArray[i][j].length;k++){
                    // System.out.print(multiArray[i][j].length);
                    // System.out.println(multiArray[i][j][k].length);?
                    System.out.print(multiArray[i][j][k]+" ");
                }
                //System.out.println();
            }
            //System.out.println();
        }

    }
}