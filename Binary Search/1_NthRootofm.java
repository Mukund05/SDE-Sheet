public static double findNthRootOfM(int n, int m) {
		// Write your code here.
		double low=1;
		double high=m;
		double exp=1e-7;
		// System.out.println(exp);
		while((high-low)>exp){
			double mid=(low+high)/2.0;
			double multiple=multiply(mid,n);
			if(multiple<m){
				low=mid;
			}else{
				high=mid;
			}
		}
		return low;


	}
	//mid==4
	//is nth power of mid is bigger then our m or smaller then
	public static double multiply(double mid,int n){
		double ans=1.0;
		for(int i=1;i<=n;i++){
			ans*=mid;
		}
		return ans;
	}