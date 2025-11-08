package practice.designpatterns.factorypattern;

public class TvRemoteUse implements RemoteFactory {

    @Override
    public Remote access() {
        return new TvRemote();
    }

}
