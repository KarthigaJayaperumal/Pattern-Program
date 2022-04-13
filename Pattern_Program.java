package april_program;

public class Pattern_Program {
	
	public static void main(String[] args) {
		int no=1;
		for(int row=1; row<=5;row++) {
			 
			for(int col=5;col>=row;col--) {
			System.out.print(no+"   ");
			no++;
			}
			if(no>15)
			{
				break;
			}
			System.out.println();
			}}}


