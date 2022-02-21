package structural.adapter;

public class AdvancedMediaPlayerVlc implements AdvancedMediaPlayer
{
    @Override
    public void loadFile() {
        System.out.println("Loaded VLC File");
    }

    @Override
    public void listen() {
        System.out.println("Playing VLC File");
    }
}
