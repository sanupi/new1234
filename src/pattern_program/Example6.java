package pattern_program;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		        *
//		      **
//          ***
//        ****
//      *****
		//Row=5 column=5
		//Space=4 star=1
		int space=4;
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
				space--;
				star++;
				
			}
		}
	}


