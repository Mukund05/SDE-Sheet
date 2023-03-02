
class rotate_Matrix {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){          //act as a row
            for(int j=i+1;j<arr.length;j++){    //act as a col
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    
    public void reverse(int[][] arr){
        for(int i=0;i<arr.length;i++){        //act as row
            for(int j=0;j<arr.length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=temp;
            }
        }
    }
}
