class example100{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8};
		int temp=0;
		System.out.println(a.length);
			 
for (int j=1;j<9;j++){


		for(int i=0;i<(a.length);i++){
			if (i==0)
			{
				
				temp=a[(a.length)-1];
		
				 a[(a.length)-1]=a[0];
			
			}

			else{
			
		
				a[i-1]=a[i];
		}

		}
		System.out.println(temp);
		a[(a.length)-2]=temp;
	


	}
		for(int x:a)
		{
			System.out.print(x);
		}
}
}