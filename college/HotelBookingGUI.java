package college;

import java.awt.*;
import javax.swing.*;

public class HotelBookingGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hotel Booking System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(new GridLayout(7, 2, 8, 8));

        // a) Customer details
        frame.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        frame.add(nameField);

        frame.add(new JLabel("Phone:"));
        JTextField phoneField = new JTextField();
        frame.add(phoneField);

        frame.add(new JLabel("Email:"));
        JTextField emailField = new JTextField();
        frame.add(emailField);

        // b) Room Type (Single, Double, Deluxe)
        frame.add(new JLabel("Room Type:"));
        JComboBox<String> roomBox = new JComboBox<>(new String[]{"Single", "Double", "Deluxe"});
        frame.add(roomBox);

        // c) Check in/out (TextFields)
        frame.add(new JLabel("Check In:"));
        JTextField checkInField = new JTextField();
        frame.add(checkInField);

        frame.add(new JLabel("Check Out:"));
        JTextField checkOutField = new JTextField();
        frame.add(checkOutField);

        // d) Amenities (List)
        frame.add(new JLabel("Amenities:"));
        JList<String> amenityList = new JList<>(new String[]{"WiFi", "Breakfast", "Parking"});
        amenityList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        frame.add(new JScrollPane(amenityList));

        // e) Text Area for additional service
        frame.add(new JLabel("Additional Services:"));
        JTextArea serviceArea = new JTextArea(2, 15);
        frame.add(new JScrollPane(serviceArea));

        // f) Buttons
        JButton bookButton = new JButton("Book");
        JButton resetButton = new JButton("Reset");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(bookButton);
        buttonPanel.add(resetButton);
        frame.add(buttonPanel);

        // Empty label for layout symmetry
        frame.add(new JLabel(""));

        frame.setVisible(true);
    }
}
