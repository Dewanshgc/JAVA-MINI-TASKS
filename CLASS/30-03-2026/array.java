class dk{
	public static void main(String[]args){
		int a[]={5,8,9,56,7,56,5,1,5,5};
		for(int i=0;i<a.length;i++){
			boolean b=false;
			for(int j=0;j<i;j++){
				if(a[i]==a[j]){
					b=true;
					break;
				}
				if (b) continue;
				for(int k=i+1;k<a.length;k++){
					if(a[i]==a[k]){
						System.out.println(a[i]);
						break;
					}
				}
				}
			}
			}
		}
	