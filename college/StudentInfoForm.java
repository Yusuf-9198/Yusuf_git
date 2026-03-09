package college;

import java.awt.*;
import javax.swing.*;

public class StudentInfoForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Info");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Use FlowLayout
        frame.setLayout(new FlowLayout());

        // a) Labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel courseLabel = new JLabel("Course:");

        // b) TextField for name
        JTextField nameField = new JTextField(15);

        // c) Checkboxes for gender
        JCheckBox maleBox = new JCheckBox("Male");
        JCheckBox femaleBox = new JCheckBox("Female");

        // d) Dropdown for course selection
        String[] courses = {"B.Tech", "B.Sc", "BCA", "MCA"};
        JComboBox<String> courseDropdown = new JComboBox<>(courses);

        // e) Button labeled Submit
        JButton submitButton = new JButton("Submit");

        // g) Multiline TextArea for comments
        JTextArea commentsArea = new JTextArea(4, 15);

        // h) List showing Hobbies
        String[] hobbies = {"Reading", "Sports", "Music", "Painting"};
        JList<String> hobbiesList = new JList<>(hobbies);

        // i) Horizontal and Vertical Scroll Bar for TextArea
        JScrollPane commentsScroll = new JScrollPane(commentsArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(genderLabel);
        frame.add(maleBox);
        frame.add(femaleBox);

        frame.add(courseLabel);
        frame.add(courseDropdown);

        frame.add(new JLabel("Comments:"));
        frame.add(commentsScroll);

        frame.add(new JLabel("Hobbies:"));
        frame.add(hobbiesList);

        frame.add(submitButton);

        frame.setVisible(true);
    }
}
