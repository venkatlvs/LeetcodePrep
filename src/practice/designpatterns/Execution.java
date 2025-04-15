package practice.designpatterns;

public class Execution {

    public static void main(String[] args) {
        LazySingleton pattern1 = LazySingleton.getInstance();
        LazySingleton pattern2 = LazySingleton.getInstance();
        if(pattern1 == pattern2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
