package view;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login() {
        // Configurações do JFrame
        setTitle("Login");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configuração do layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3, 3, 3, 3);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Label BEM VINDO
        JLabel welcomeLabel = new JLabel("BEM VINDO", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(welcomeLabel, gbc);

        // Label Usuario
        JLabel userLabel = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(userLabel, gbc);

        // Campo de texto Usuario
        JTextField userTextField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(userTextField, gbc);

        // Label Senha
        JLabel passwordLabel = new JLabel("Senha:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(passwordLabel, gbc);

        // Campo de texto Senha
        JPasswordField passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(passwordField, gbc);

        // Botão Login
        JButton loginButton = new JButton("Entrar");
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(loginButton, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Login loginScreen = new Login();
            loginScreen.setVisible(true);
        });
    }
}