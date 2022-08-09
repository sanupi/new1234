package pattern_program;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
//*****
//	****
//    ***
//      **
//        *
         
		//Row=5 column=5
		//Space=0 star=5//1st row la
		//space=1 star=4//2nd la
		//To be continue
		int space=0;
		int star=5;
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
			star--;
			space++;
		}
	}

	}

