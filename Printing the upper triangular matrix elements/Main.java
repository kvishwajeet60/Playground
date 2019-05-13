import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int row=sc.nextInt();
    int col =sc.nextInt();
    int mat[][]= new int[row][col];
	
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
        mat[i][j]=sc.nextInt();
    }
	
    int count =0;
    while(count < col)
    {
      int cnt2 =row-count;      
      int i=0;
      int j=0+count;
      while(cnt2>0)
      {
      System.out.print(mat[i][j]+" ");
        i++;j++;
        cnt2--;
      }
      count++;
    }
    
    
  }
}