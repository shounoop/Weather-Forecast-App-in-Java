package entry;

import graphicalUI.PrepareGUI;
import jaco.mp3.player.*;
import java.io.File;

public class Start {
    public static void main(String[] args)  {
        String song = "C:\\Users\\admin\\Downloads\\moi 2\\Background music.mp3";
        MP3Player mp3player = new MP3Player(new File(song));
        mp3player.play();
        PrepareGUI gui = new PrepareGUI();
        gui.getWeather().setVisible(true);
        mp3player.setRepeat(true);
    }
}