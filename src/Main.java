import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Set up the main frame
        JFrame frame = new JFrame("Music Catalogue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        // North: Title label
        JLabel titleLabel = new JLabel("My Music Catalogue", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(titleLabel, BorderLayout.NORTH);

        // South: Buttons Panel (Submit, Exit)
        JPanel buttonPanel = new JPanel();
        JButton submitButton = new JButton("Submit");
        JButton exitButton = new JButton("Exit");
        buttonPanel.add(submitButton);
        buttonPanel.add(exitButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // West: List of Categories (Rap, Reggae, Ballads)
        String[] categories = {"Rap", "Reggae", "Ballads"};
        JList<String> categoryList = new JList<>(categories);
        categoryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane categoryScroll = new JScrollPane(categoryList);
        frame.add(categoryScroll, BorderLayout.WEST);

        // Center: Form Panel with GridLayout
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5,2, 10, 10));

        // Artist Name field
        JLabel artistLabel = new JLabel("Artist Name:");
        JTextField artistField = new JTextField();

        // Recording Studio field
        JLabel studioLabel = new JLabel("Recording Studio:");
        JTextField studioField = new JTextField();

        // Category dropdown
        JLabel categoryLabel = new JLabel("Category:");
        JComboBox<String> categoryComboBox = new JComboBox<>(categories);

        // Available checkbox
        JLabel availableLabel = new JLabel("Available:");
        JCheckBox availableCheckBox = new JCheckBox();

        formPanel.add(artistLabel);
        formPanel.add(artistField);
        formPanel.add(studioLabel);
        formPanel.add(studioField);
        formPanel.add(categoryLabel);
        formPanel.add(categoryComboBox);
        formPanel.add(availableLabel);
        formPanel.add(availableCheckBox);

        frame.add(formPanel, BorderLayout.CENTER);

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

        // Display the frame
        frame.setVisible(true);
    }
}
