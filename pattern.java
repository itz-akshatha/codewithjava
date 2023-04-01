package aksh;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of n : ");
		int n=sc.nextInt();*/
		int n=7;
		for(int i=0;i<=n-1;i++)
		{
			//JAVA
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || j==n/2 || i==n-1 && j!=0 && j<=n/2 || j==0 && i>=n/2 && i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<=n-1;j++)
			{
				if((j==0 || j==n-1) && i!=0 || i==n/2 || (i==0 && j!=0 && j!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if((j==0 || j==n-1) &&i<=n/2 || (i-j==n/2 ) || (i+j==n+n/2-1 ))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if((j==0 || j==n-1) && i!=0 || i==n/2 || (i==0 && j!=0 && j!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			
			for(int k=0;k<=7;k++)
			{
				System.out.print(" ");
			}
			
			//IS
			
			for(int j=0;j<=n-1;j++)
			{
				if(j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<=n-1;j++)
			{
				if((i==0 && j!=0) || (i==n-1 && j!=n-1) || (i==n/2 && j!=0 && j!=n-1) || (j==0 && i<n/2 && i!=0) || (j==n-1 && i>n/2 && i!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int k=0;k<=10;k++)
			{
				System.out.print(" ");
			}
			
			//AMAZING	
			
			for(int j=0;j<=n-1;j++)
			{
				if((j==0 || j==n-1) && i!=0 || i==n/2 || (i==0 && j!=0 && j!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || j==n-1 || (i==j ||i+j==n-1) && i<=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if((j==0 || j==n-1) && i!=0 || i==n/2 || (i==0 && j!=0 && j!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || i==n-1 || i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
				
			}
			
			for(int j=0;j<=n-1;j++)
			{
				if(j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || i==0 || (i==n-1 && j<=n/2) || (j==n/2 && i>=n/2) || (i==n/2 && j>=n/2) || (i>=n/2 && j==n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
		
			
		
		for(int k=0;k<=2;k++)
		{
			System.out.println();
		}
		
		//2nd ith loop
	    for(int i=0;i<=n-1;i++)
		{   
	    	//PROUD
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || (i==0 || i==n/2) && j!=n-1 || j==n-1 && i<n/2 && i!=0)
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || (i==0 || i==n/2) && j!=n-1 || j==n-1 && i<n/2 && i!=0 || (i==j && i>=n/2))
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
		        if(((i==0 || i==n-1) && j!=0 && j!=n-1) || ((j==0 || j==n-1) && i!=0 && i!=n-1))
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if((j==0 || j==n-1) && i!=n-1 || (i==n-1 && j!=0 && j!=n-1))
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || (i==0 || i==n-1) && j!=n-1 || (j==n-1 && i!=0 && i!=n-1))
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}
			
			for(int k=0;k<=10;k++)
			{
				System.out.print(" ");
			}
			
			
			//GQTIAN
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || i==0 || (i==n-1 && j<=n/2) || (j==n/2 && i>=n/2) || (i==n/2 && j>=n/2) || (i>=n/2 && j==n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
		        if(((i==0 || i==n/2+2) && j!=0 && j<=n/2) || ((j==0 || j==n/2+1) && i!=0 && i<=n/2) || (i==j && i>=n/2) || (j==0 && i==n/2+1))
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
		        System.out.print(" ");
				
			}
			
			
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			for(int j=0;j<=n-1;j++)
			{
				if(j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<=n-1;j++)
			{
				if((j==0 || j==n-1) && i!=0 || i==n/2 || (i==0 && j!=0 && j!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}			
					
			System.out.println();
		}
		
	    
	    
	    for(int k=0;k<=2;k++)
		{
			System.out.println();
		}
		
		//3rd ith loop
	    for(int i=0;i<=n-1;i++)
		{   
	    	//THANK
			for(int j=0;j<=n-1;j++)
			{
				if(i==0 || j==n/2)
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0|| j==n-1 || i==n/2)
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if((j==0 || j==n-1) && i!=0 || i==n/2 || (i==0 && j!=0 && j!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || i==j || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0  || (i+j==n/2) || i-j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			for(int k=0;k<= 10;k++)
			{
				System.out.print(" ");
			}
			
			//you
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if((i==j && i<=n/2) || i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
		        if(((i==0 || i==n-1) && j!=0 && j!=n-1) || ((j==0 || j==n-1) && i!=0 && i!=n-1))
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if((j==0 || j==n-1) && i!=n-1 || (i==n-1 && j!=0 && j!=n-1))
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}
			
			for(int k=0;k<= 10;k++)
			{
				System.out.print(" ");
			}
			
			//GR
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || i==0 || (i==n-1 && j<=n/2) || (j==n/2 && i>=n/2) || (i==n/2 && j>=n/2) || (i>=n/2 && j==n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || (i==0 || i==n/2) && j!=n-1 || j==n-1 && i<n/2 && i!=0 || (i==j && i>=n/2))
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}
			
			
			
			
			for(int k=0;k<= 10;k++)
			{
				System.out.print(" ");
			}

			
			//SIR
			
			for(int j=0;j<=n-1;j++)
			{
				if((i==0 && j!=0) || (i==n-1 && j!=n-1) || (i==n/2 && j!=0 && j!=n-1) || (j==0 && i<n/2 && i!=0) || (j==n-1 && i>n/2 && i!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
					
			for(int j=0;j<=n-1;j++)
			{
				if(j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
				if(j==0 || (i==0 || i==n/2) && j!=n-1 || j==n-1 && i<n/2 && i!=0 || (i==j && i>=n/2))
				{
						System.out.print("*");
				}
				else
				{
						System.out.print(" ");
				}
				
			}			
			
			System.out.println();
		}				

	}

}
