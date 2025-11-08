package practice.designpatterns.factorypattern;

public class AcRemote implements Remote{

    @Override
    public void turnOn(String function){
        System.out.println("AC turned: "+function);
    }
}
