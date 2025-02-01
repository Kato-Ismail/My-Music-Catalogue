import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        // Set up the main frame
        JFrame frame = new JFrame("Music Catalogue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);

        // Add the MusicCataloguePanel which handles the components and layout
        MusicCataloguePanel panel = new MusicCataloguePanel();
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }
}
