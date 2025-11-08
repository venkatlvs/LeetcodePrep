package practice.designpatterns.factorypattern;

public class AcRemoteUse implements RemoteFactory {

    @Override
    public Remote access() {
        return new AcRemote();
    }

}
