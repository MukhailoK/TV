import controller.RemoteController;
import model.Channel;
import model.TV;
import model.TVShow;

public class Main {
    public static void main(String[] args) {
        RemoteController remoteController;

        Channel channel = new Channel("Discovery", 1);
        Channel channel1 = new Channel("Comedy", 2);

        for (int i = 0; i < 10; i++) {
            channel.addShow(new TVShow("show " + (i + 1)));
            channel1.addShow(new TVShow("stand up " + (i + 1)));
        }

        TV tv = new TV();

        tv.addChannel(channel);
        tv.addChannel(channel1);

        remoteController = new RemoteController(tv);
        remoteController.onTV();
        remoteController.onChannel(2);
        remoteController.volumeUp();
        remoteController.standby();
        remoteController.onTV();
        remoteController.volumeDown();
        remoteController.offTV();
        remoteController.onTV();
        remoteController.standby();
    }
}
