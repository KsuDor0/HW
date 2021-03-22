package lesson7;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel{

    public static final int GM_PVE = 0;
    public static final int GM_PVP = 1;

    GameMap() {
        setBackground(Color.BLACK);
    }

    void start(int gameMod, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.println("fieldSizeX > " + fieldSizeX + " fieldSizeY > " +
                fieldSizeY + " winLength > " + winLength + " gameMod > " + gameMod);
    }

}
