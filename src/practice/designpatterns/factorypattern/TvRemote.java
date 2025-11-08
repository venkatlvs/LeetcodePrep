package practice.designpatterns.factorypattern;

public class TvRemote implements Remote{

    @Override
    public void turnOn(String function){
        System.out.println("Tv turned: "+function);
    }
}
