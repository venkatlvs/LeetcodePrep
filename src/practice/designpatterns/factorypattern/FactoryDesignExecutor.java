package practice.designpatterns.factorypattern;

public class FactoryDesignExecutor {

    public static void main(String[] args) {
        RemoteFactory factoryA = new AcRemoteUse();
        RemoteFactory factoryB = new TvRemoteUse();
        Remote remoteA = factoryA.access();
        Remote remoteB = factoryB.access();
        remoteA.turnOn("ON");
        remoteB.turnOn("ON");
    }
}
