import java.util.*;
class ArrayList2
{

	public static void main(String[] args) {
		int c=0;
		ArrayList<Integer> a=new ArrayList<Integer>();
		

		while (true){
			c++;
			    int size=a.size();
			    System.out.println("current size of your arraylist"+a.size());

		        
		        System.out.println("print how many items you want to insert");
		        Scanner sc=new Scanner(System.in);
		
		
		        int x=sc.nextInt();
		        System.out.println("Start Entering");
		        Scanner sc1=new Scanner(System.in);
		        for (int i=a.size();i<(size+x);i++){
			    
			    a.add(sc1.nextInt());
		}
		for (int j:a)
		{
			System.out.println(j);
		}
		if (c==4){
			System.exit(0);
		}
	}



			


	}
}