package pattern_program;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //    *******
     //		  *****
    //		    ***
   //		      *
//		Row =4 column=7
//		space=0 star=7
		int space=0;
		int star=7;
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
				}
			System.out.println();
			space ++;
			star=star -2;
		}
	}

}
