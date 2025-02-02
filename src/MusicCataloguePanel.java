import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicCataloguePanel extends JPanel {
    public MusicCataloguePanel() {
        // Set the layout of the main panel
        setLayout(new BorderLayout());

        // North: Title label with bold and colorful font
        JLabel titleLabel = new JLabel("My Music Catalogue", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(new Color(255, 100, 150)); // Pinkish color
        add(titleLabel, BorderLayout.NORTH);

        // South: Buttons Panel (Submit, Exit)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(230, 230, 255)); // Light blue background

        // Buttons with colorful styles
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(100, 200, 100)); // Green
        submitButton.setForeground(Color.WHITE);
        JButton exitButton = new JButton("Exit");
        exitButton.setBackground(new Color(255, 100, 100)); // Red
        exitButton.setForeground(Color.WHITE);

        buttonPanel.add(submitButton);
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // West: List of Categories with colorful background
        String[] categories = {"Rap", "Reggae", "Ballads"};
        JList<String> categoryList = new JList<>(categories);
        categoryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        categoryList.setBackground(new Color(255, 255, 204)); // Light yellow background
        categoryList.setForeground(new Color(0, 102, 204)); // Dark blue text
        JScrollPane categoryScroll = new JScrollPane(categoryList);
        add(categoryScroll, BorderLayout.WEST);

        // Center: Form Panel with GridLayout and colorful fields
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(12, 2, 15, 15));
        formPanel.setBackground(new Color(255, 250, 230)); // Light peach background

        // Artist Name field with a label
        JLabel artistLabel = new JLabel("Artist Name:");
        artistLabel.setForeground(new Color(0, 102, 204)); // Dark blue color
        JTextField artistField = new JTextField();
        artistField.setBackground(new Color(240, 240, 255)); // Light blue background

        // Recording Studio field with a label
        JLabel studioLabel = new JLabel("Recording Studio:");
        studioLabel.setForeground(new Color(0, 102, 204));
        JTextField studioField = new JTextField();
        studioField.setBackground(new Color(240, 240, 255));

        // Category dropdown with a label
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setForeground(new Color(0, 102, 204));
        JComboBox<String> categoryComboBox = new JComboBox<>(categories);
        categoryComboBox.setBackground(new Color(240, 240, 255));

        // Available checkbox with a label
        JLabel availableLabel = new JLabel("Available:");
        availableLabel.setForeground(new Color(0, 102, 204));
        JCheckBox availableCheckBox = new JCheckBox();
        availableCheckBox.setBackground(new Color(255, 250, 230));

        // Adding components to the form panel
        formPanel.add(artistLabel);
        formPanel.add(artistField);
        formPanel.add(studioLabel);
        formPanel.add(studioField);
        formPanel.add(categoryLabel);
        formPanel.add(categoryComboBox);
        formPanel.add(availableLabel);
        formPanel.add(availableCheckBox);

        add(formPanel, BorderLayout.CENTER);

        // Submit button action: print details to console
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String artistName = artistField.getText();
                String recordingStudio = studioField.getText();
                String category = (String) categoryComboBox.getSelectedItem();
                boolean available = availableCheckBox.isSelected();

                // Print details to console
                System.out.println("Artist Name: " + artistName);
                System.out.println("Recording Studio: " + recordingStudio);
                System.out.println("Category: " + category);
                System.out.println("Available: " + available);
            }
        });

        // Exit button action: close the application
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
