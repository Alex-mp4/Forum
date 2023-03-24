package MVC;

import javax.swing.*;

public class view {
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton loginButton;
    private JButton newPostButton;

    public view(JTextArea textArea1, JPanel panel1, JButton loginButton, JButton newPostButton) {
        this.textArea1 = textArea1;
        this.panel1 = panel1;
        this.loginButton = loginButton;
        this.newPostButton = newPostButton;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JButton getNewPostButton() {
        return newPostButton;
    }

    public void setNewPostButton(JButton newPostButton) {
        this.newPostButton = newPostButton;
    }
}
