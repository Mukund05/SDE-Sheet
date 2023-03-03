
class pow_ {
    public double myPow(double x, int n) {
        if(n>0) return pow(x,n);
        long pp=n;
        pp=pp*-1;
        double ans=pow(x,pp);
        return 1.0/ans;
    }

    public double pow(double x,long n){
        if(n==0) return 1;

        double xnm=pow(x,n/2);
        double ans=xnm*xnm;
        if(n%2==1){
            ans=ans*x;
        }
        return ans;
    }
}
