
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rishabh Singh
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")                         

    private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;
        
    javax.swing.JPanel formPanel = new javax.swing.JPanel(new java.awt.GridBagLayout());

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    usernameField = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    passwordField = new javax.swing.JPasswordField();
    loginButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Login");
    setPreferredSize(new java.awt.Dimension(800, 400));
    setResizable(false);
    getContentPane().setLayout(new java.awt.GridBagLayout());

    jLabel1.setFont(new java.awt.Font("Arial", 1, 24));
    jLabel1.setText("Login Page");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(20, 0, 30, 0);
    getContentPane().add(jLabel1, gridBagConstraints);

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16));
    jLabel2.setText("Username");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    formPanel.add(jLabel2, gridBagConstraints);
    
    usernameField.setPreferredSize(new java.awt.Dimension(200, 30));
    usernameField.setFont(new java.awt.Font("Segoe UI", 0, 14));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    formPanel.add(usernameField, gridBagConstraints);
    usernameField.setToolTipText("Enter your username");

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16));
    jLabel3.setText("Password");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    formPanel.add(jLabel3, gridBagConstraints);

    passwordField.setPreferredSize(new java.awt.Dimension(200, 30));
    passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
    formPanel.add(passwordField, gridBagConstraints);
    passwordField.setToolTipText("Enter your password");

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

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    getContentPane().add(formPanel, gridBagConstraints);

    pack();
}

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;                  
}
