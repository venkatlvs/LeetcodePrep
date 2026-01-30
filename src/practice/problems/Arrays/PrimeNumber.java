package practice.problems.Arrays;

public class PrimeNumber {

    public void executePrimeNumber(){
        System.out.println("The given number is: 9 and it "+isPrimeNumber(9));
        System.out.println("The given number is: 13 and it "+isPrimeNumber(13));
    }

    private String isPrimeNumber(int num){
        if(isPrime(num)){
            return "is a Prime number.";
        }else{
            return "is not a Prime number.";
        }
    }

    private boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
