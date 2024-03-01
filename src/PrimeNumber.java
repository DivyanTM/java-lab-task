public class PrimeNumber {
    public void printPrimeNumbers(int n){
        System.out.print("Prime numbers : ");
        for(int i=1;i<=n;i++){
            int f=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    f++;
                }
            }
            if(f==2){
                System.out.print(i+" ");
            }
        }
    }
}
