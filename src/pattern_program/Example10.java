package pattern_program;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*  *  *  *
//  *  *  *
//    *  *
//      *
	//	row =4 column =4 space=0 star=4
		int space=0;
		int star=4;
		for( int i=1; i<=4; i++)
		{
			for(int j=1; j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*  ");
			}
	
				
			System.out.println();
				space++;
				star--;
			
		}

	}

	
	}


