import controller.RemoteController;
import model.Channel;
import model.TV;
import model.TVShow;

public class Main {
    public static void main(String[] args) {
        RemoteController remoteController;

        Channel channel = new Channel("channel1", 1);
        Channel channel1 = new Channel("channel2", 2);

        for (int i = 0; i < 10; i++) {
            channel.addShow(new TVShow("show" + (i + 1)));
            channel1.addShow(new TVShow("stand up" + (i + 1)));
        }

        TV tv = new TV();

        tv.addChannel(channel);
        tv.addChannel(channel1);

        remoteController = new RemoteController(tv);

        remoteController.onChannel(2);
    }
}
