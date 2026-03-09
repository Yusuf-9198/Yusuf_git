package college;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CourseRegistrationGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Online Course Registration Portal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 450);

        // Main panel with padding
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(new EmptyBorder(20, 30, 20, 30));
        panel.setBackground(new Color(240, 248, 255)); // AliceBlue

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel title = new JLabel("Course Registration", JLabel.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 22));
        title.setForeground(new Color(0, 85, 135));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(title, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;

        // a) Student Info
        panel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        JTextField nameField = new JTextField(18);
        panel.add(nameField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        JTextField emailField = new JTextField(18);
        panel.add(emailField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Mobile:"), gbc);
        gbc.gridx = 1;
        JTextField mobileField = new JTextField(18);
        panel.add(mobileField, gbc);

        // b) Course Selection
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Select Course:"), gbc);
        gbc.gridx = 1;
        String[] courses = {"Java", "Python", "C++", "Web Dev", "Data Science"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        courseBox.setFont(new Font("SansSerif", Font.PLAIN, 14));
        panel.add(courseBox, gbc);

        // c) Study Mode
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Study Mode:"), gbc);
        gbc.gridx = 1;
        JPanel modePanel = new JPanel();
        modePanel.setBackground(new Color(240, 248, 255));
        JCheckBox onlineBox = new JCheckBox("Online");
        JCheckBox offlineBox = new JCheckBox("Offline");
        modePanel.add(onlineBox);
        modePanel.add(offlineBox);
        panel.add(modePanel, gbc);

        // d) Course Duration
        gbc.gridx = 0; gbc.gridy++;
        panel.add(new JLabel("Course Duration (Weeks):"), gbc);
        gbc.gridx = 1;
        JSlider durationSlider = new JSlider(1, 52, 12);
        durationSlider.setMajorTickSpacing(13);
        durationSlider.setPaintTicks(true);
        durationSlider.setPaintLabels(true);
        durationSlider.setBackground(new Color(240, 248, 255));
        panel.add(durationSlider, gbc);

        // e) Register Button
        gbc.gridx = 0; gbc.gridy++;
        gbc.gridwidth = 2;
        JButton registerButton = new JButton("Register");
        registerButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        registerButton.setBackground(new Color(0, 85, 135));
        registerButton.setForeground(Color.WHITE);
        registerButton.setFocusPainted(false);
        registerButton.setBorder(new RoundedBorder(10));
        panel.add(registerButton, gbc);

        frame.setContentPane(panel);
        frame.setLocationRelativeTo(null); // center on screen
        frame.setVisible(true);
    }

    // Custom button border for rounded effect
    static class RoundedBorder extends LineBorder {
        public RoundedBorder(int radius) {
            super(Color.WHITE, 2, true);
            this.arc = radius;
        }
        private int arc;
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(lineColor);
            g.drawRoundRect(x, y, width - 1, height - 1, arc, arc);
        }
    }
}

