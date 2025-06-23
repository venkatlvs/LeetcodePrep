package practice.designpatterns;

public class Execution {

    public static void main(String[] args) {
        LazySingleton pattern1 = LazySingleton.getInstance();
        LazySingleton pattern2 = LazySingleton.getInstance();
        System.out.println(pattern1 == pattern2);
    }
}
