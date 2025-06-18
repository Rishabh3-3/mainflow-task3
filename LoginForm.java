
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * LoginForm.java
 * 
 * This form was created as part of Task 3 in the Java Developer Internship.
 * It includes a simple login interface using Java Swing with proper layout, alignment, 
 * tooltips, and visual styling. All components are arranged using GridBagLayout 
 * inside a nested JPanel for better control.
 * 
 * Developer: Rishabh Singh
 * Date: June 18, 2025
 */
public class LoginForm extends javax.swing.JFrame {

    // Constructor to initialize and center the login window
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null); // Center the window on screen
    }
    @SuppressWarnings("unchecked")                         

    private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    // Create a panel to hold all form elements using GridBagLayout
    javax.swing.JPanel formPanel = new javax.swing.JPanel(new java.awt.GridBagLayout());

    // Declare Swing components
    jLabel1 = new javax.swing.JLabel();  //Main title
    jLabel2 = new javax.swing.JLabel();  //Username label
    usernameField = new javax.swing.JTextField();  //Username input
    jLabel3 = new javax.swing.JLabel();  //Password label
    passwordField = new javax.swing.JPasswordField();  //Password input
    loginButton = new javax.swing.JButton();  //Login button

    // Setting up the main JFrame properties
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Login");
    setPreferredSize(new java.awt.Dimension(800, 400)); // Set window size
    setResizable(false); // Prevent window resizing
    getContentPane().setLayout(new java.awt.GridBagLayout()); // Use GridBagLayout on the main frame

    // ===== Title Label =====
    jLabel1.setFont(new java.awt.Font("Arial", 1, 24));
    jLabel1.setText("Login Page");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 30, 0);
    getContentPane().add(jLabel1, gridBagConstraints);

    // ===== Username Label =====
    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16));
    jLabel2.setText("Username");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    formPanel.add(jLabel2, gridBagConstraints);
    
    // ===== Username Field =====
    usernameField.setPreferredSize(new java.awt.Dimension(200, 30));
    usernameField.setFont(new java.awt.Font("Segoe UI", 0, 14));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    formPanel.add(usernameField, gridBagConstraints);
    usernameField.setToolTipText("Enter your username");

    // ===== Password Label =====
    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16));
    jLabel3.setText("Password");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    formPanel.add(jLabel3, gridBagConstraints);

    // ===== Password Field =====
    passwordField.setPreferredSize(new java.awt.Dimension(200, 30));
    passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    formPanel.add(passwordField, gridBagConstraints);
    passwordField.setToolTipText("Enter your password");

    // ===== Login Button =====
    loginButton.setFont(new java.awt.Font("Segoe UI", 1, 16));
    loginButton.setText("Login");
    loginButton.setPreferredSize(new java.awt.Dimension(100, 35));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
    gridBagConstraints.insets = new java.awt.Insets(20, 10, 10, 10);
    formPanel.add(loginButton, gridBagConstraints);

    // ===== Add the form panel to the center of the JFrame =====
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    getContentPane().add(formPanel, gridBagConstraints);

    pack(); // Adjust frame size based on components
}

    /**
     * Main method to run the LoginForm
     */
    public static void main(String args[]) {
        // Set Nimbus Look and Feel for better appearance
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // Fall back to default look and feel
        }
        // Show the login form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
       
    // Swing component declarations
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;                  
}