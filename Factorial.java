class Factorial {
     public static int fact(int n){

        int fac=1;
        if(fac==1 || fac==0) return 1;
                
        fac=fac*fact(n-1);
        return fac;
     }
    public static void main(String[] args) {
        
        System.out.println(fact(5));

        
    }
    
}
