package april_program;

public class Pattern_Program {
	
	public static void main(String[] args) {
		//Pattern 1
		for(int row=1; row<=5;row++) {
			for(int col=5;col>=row;col--) {
			System.out.print(col+"   ");
			}
			System.out.println();
			}
		//Pattern 2
for(int row=1; row<=5;row++) {
	for(int col=5;col>=row;col--) {
	System.out.print(row+"   ");
	}
	System.out.println();
	}
//Pattern 3
for(int row=5; row>=1;row--) {
	for(int col=1;col<=row;col++) {
	System.out.print(row+"   ");
	}
	System.out.println();
	}
//Pattern 4
for(int row=5; row>=1;row--) {
	for(int col=1;col<=row;col++) {
	System.out.print(row+"   ");
	}
	System.out.println();
	}
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

