import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
   // System.out.println("Hello World!");
    Scanner sc =new Scanner(System.in);
    int row=sc.nextInt();
    int col =sc.nextInt();
    int mat[][]= new int[row][col];
	int mat2[][]= new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
        mat[i][j]=sc.nextInt();
    }
	for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
        mat2[i][j]=sc.nextInt();
    }
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
        System.out.print(mat[i][j]-mat2[i][j]+" ");
      System.out.println();
    }
    
  }
}