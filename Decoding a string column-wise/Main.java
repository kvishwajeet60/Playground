import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    String s =sc.nextLine();
    int col =sc.nextInt();
    StringBuilder sb =new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
		if(s.charAt(i) == ' ')
			continue;
		sb.append(s.charAt(i));
	}	
	String sb1 =sb.toString();
    //System.out.println(sb1);	
	//System.out.println(sb1.length());
	int len = (int)(sb1.length()/col) + 1;
	String arr[] = new String[len];
    //System.out.println(len);
	
	for(int i=0;i<len; i++)
	{
		String sss;
		if(i == len-1){
			String ss =sb1.substring(col*i,sb1.length());
			StringBuilder sbb =new StringBuilder(ss);
			if(ss.length() < col){
			for(int j=0;j<col-ss.length();j++)
				sbb.append("X");
			}
			sss = sbb.toString();
		}
		else{
		    sss = sb1.substring(col*i,(i*col)+col);
		}
		
		if(i%2 == 1)
		{
			StringBuilder sd =new StringBuilder(sss);
			arr[i] =sd.reverse().toString();
		}
		else
			arr[i] =sss;
	}
	
	/*for(int i=0;i<len; i++)
	{
		System.out.println(arr[i]);
	}*/
	//System.out.println("\n\n");
	for(int i=0;i<col;i++)
	{
		for(int j=0;j<len;j++)
			System.out.print(arr[j].charAt(i));
	}
  }
}