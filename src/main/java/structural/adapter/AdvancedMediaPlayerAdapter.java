package structural.adapter;

public class AdvancedMediaPlayerAdapter implements MediaPlayer
{
    AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play() {
        advancedMediaPlayer.loadFile();
        advancedMediaPlayer.listen();
    }
}
