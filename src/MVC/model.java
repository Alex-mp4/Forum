package MVC;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class model {
    String user = "te20";
    JPasswordField pf = new JPasswordField();
    //JOptionPane.showConfirmDialog(null, pf, "password?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    //String password = new String(pf.getPassword());
    String password = JOptionPane.showInputDialog(pf, "password?");

    String forum = "";

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void addMessage(String c) {
        forum += c + "\n";
    }

    public String getForum() {
        return forum;
    }
}
