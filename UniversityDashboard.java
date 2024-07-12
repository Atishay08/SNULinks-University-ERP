import javax.swing.*;
import java.awt.*;

public class UniversityDashboard extends JFrame {

    public UniversityDashboard() {
        // Set up the frame
        setTitle("University Dashboard");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top panel for logo, search bar, and username
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(new Color(0, 51, 102));

        JLabel logoLabel = new JLabel("SHIV NADAR UNIVERSITY", JLabel.CENTER);
        logoLabel.setForeground(Color.WHITE);
        logoLabel.setFont(new Font("Arial", Font.BOLD, 30));
        topPanel.add(logoLabel, BorderLayout.WEST);

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        searchPanel.setBackground(new Color(0, 51, 102));
        JTextField searchField = new JTextField(30);
        JButton searchButton = new JButton("Search");
        searchButton.setBackground(new Color(255, 153, 51));
        searchButton.setForeground(Color.WHITE);
        searchButton.setFocusPainted(false);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        topPanel.add(searchPanel, BorderLayout.CENTER);

        JLabel usernameLabel = new JLabel("Hi Atishay Jain");
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JPanel usernamePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        usernamePanel.setBackground(new Color(0, 51, 102));
        usernamePanel.add(usernameLabel);
        topPanel.add(usernamePanel, BorderLayout.EAST);

        add(topPanel, BorderLayout.NORTH);

        // Main panel for buttons
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 6, 20, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(Color.WHITE);

        String[] buttonLabels = {
            "University ERP", "Anti-Ragging Compliance", "Assistantship/ Award", "Blackboard", "CCT", "Certificate Issuance",
            "Course Evaluation Survey", "Doctoral Portal", "Event Repository", "Hostel Management", "ID Card Management", "Mobile App CMS",
            "On Campus Job", "Student Outbound Mobility", "Student Attendance Recording", "Student Attendance Management", "Student Clearance", "Student Payment Center"
        };

        String[] iconPaths = {
            "path/to/icon1.png", "path/to/icon2.png", "path/to/icon3.png", "path/to/icon4.png", "path/to/icon5.png", "path/to/icon6.png",
            "path/to/icon7.png", "path/to/icon8.png", "path/to/icon9.png", "path/to/icon10.png", "path/to/icon11.png", "path/to/icon12.png",
            "path/to/icon13.png", "path/to/icon14.png", "path/to/icon15.png", "path/to/icon16.png", "path/to/icon17.png", "path/to/icon18.png"
        };

        Dimension buttonSize = new Dimension(180, 80);

        for (int i = 0; i < buttonLabels.length; i++) {
            JButton button = new JButton(buttonLabels[i]);
            button.setIcon(new ImageIcon(iconPaths[i]));
            button.setPreferredSize(buttonSize);
            button.setBackground(new Color(0, 51, 102));
            button.setForeground(Color.WHITE);
            button.setFocusPainted(false);
            mainPanel.add(button);
        }

        add(mainPanel, BorderLayout.CENTER);

        // Bottom panel for links
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.setBackground(new Color(0, 51, 102));

        JPanel linksPanel = new JPanel();
        linksPanel.setLayout(new FlowLayout());
        linksPanel.setBackground(new Color(0, 51, 102));

        String[] links = {"Student Policy", "Student Handbook", "Academic Research", "University Library", "Mess Menu", "SNU Wiki"};
        for (String link : links) {
            JButton linkButton = new JButton(link);
            linkButton.setBackground(new Color(255, 153, 51));
            linkButton.setForeground(Color.WHITE);
            linkButton.setFocusPainted(false);
            linksPanel.add(linkButton);
        }

        bottomPanel.add(linksPanel, BorderLayout.CENTER);

        JLabel footerLabel = new JLabel("2024 Institute of Eminence", JLabel.CENTER);
        footerLabel.setForeground(Color.BLACK);
        footerLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        bottomPanel.add(footerLabel, BorderLayout.SOUTH);

        add(bottomPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UniversityDashboard().setVisible(true);
            }
        });
    }
}
