class Example500{
	public static void main(String[] args) {
		int[] x={33,55,1111,333,442,4224,4242};
		boolean b=true;
		while (b){
			b=false;
			int temp;
			for (int i=0;i<(x.length-1);i++){
				if (x[i+1]>x[i]){
					temp=x[i+1];
					x[i+1]=x[i];
					x[i]=temp;
					 b=true;

				}


			}
			
		
		}
		for (int z:x)
		{
			System.out.println(z);
		}
	}
}