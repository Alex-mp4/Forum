package MVC;

import javax.swing.*;

public class view {
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton loginButton;
    private JButton newPostButton;
    private JList list1;


    public JPanel getPanel() {
        return panel1;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
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

    public JList getList1() {
        return list1;
    }

    public void setList1(JList list1) {
        this.list1 = list1;
    }

    public void setMessage(String c) {
        textArea1.setText(c);
    }
}
