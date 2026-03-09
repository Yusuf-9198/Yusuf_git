package college;

import java.awt.*;
import javax.swing.*;

public class StudentInfoGrid {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Info Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Use GridLayout (6 rows, 2 columns)
        frame.setLayout(new GridLayout(6, 2, 10, 10));

        // a) Personal Details (Name, Gender, Branch)
        frame.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        frame.add(nameField);

        frame.add(new JLabel("Gender:"));
        JComboBox<String> genderBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        frame.add(genderBox);

        frame.add(new JLabel("Branch:"));
        JComboBox<String> branchBox = new JComboBox<>(new String[]{"CSE", "ECE", "ME", "IT"});
        frame.add(branchBox);

        // b) Area of Interest
        frame.add(new JLabel("Area of Interest:"));
        JTextField areaField = new JTextField();
        frame.add(areaField);

        // c) List of Skills (Multiple Selectable)
        frame.add(new JLabel("Skills:"));
        JList<String> skillsList = new JList<>(new String[]{"Java", "Python", "C++", "HTML"});
        skillsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        frame.add(new JScrollPane(skillsList));

        // d) Text Area for Address
        frame.add(new JLabel("Address:"));
        JTextArea addressArea = new JTextArea(2, 15);
        frame.add(new JScrollPane(addressArea));

        // e) Button labeled Submit
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);

        frame.setVisible(true);
    }
}

