package structural.adapter;

public class AdvancedMediaPlayerMp4 implements AdvancedMediaPlayer
{

    @Override
    public void loadFile() {
        System.out.println("Loaded MP4 File");
    }

    @Override
    public void listen() {
        System.out.println("Playing MP4 File");
    }
}
