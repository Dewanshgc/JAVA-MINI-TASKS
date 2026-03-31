class dk{
		public static void main(String[]args){
			int a[]={5,6,7,8,7,5,1,5,5};
			
			for(int i=0;i<a.length;i++){
				int count=0;
				for(int j=i+1;j<a.length;j++){
					if(a[i]==a[j]){
						count++;
					}
				}
				if(count!=0){
					System.out.println(a[i]);
				}
			}
		}
}