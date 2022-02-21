package structural.adapter;

/**
 * Advanced Media Player
 *  -> loadFile()
 *  -> listen()
 *
 *  MediaPlayer
 *   -> play()
 *
 *  MP4 -> AMP
 *  VLC -> AMP
 *
 *  AMPA 1 ---<> AMP
 *  AMPA -> MP
 *
 *
 *
 */
public class MediaPlayerClient
{

    public static void main(String[] args) {
        MediaPlayer vlcPlayer = new AdvancedMediaPlayerAdapter(new AdvancedMediaPlayerVlc());
        MediaPlayer mp4Player = new AdvancedMediaPlayerAdapter(new AdvancedMediaPlayerMp4());

        vlcPlayer.play();

        mp4Player.play();
    }
}
