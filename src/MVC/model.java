package MVC;

import javax.swing.*;
import java.sql.Connection;

public class model {
    Connection conn = null;
    String user = "te20";
    JPasswordField pf = new JPasswordField();
    //JOptionPane.showConfirmDialog(null, pf, "password?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    String password = new String(pf.getPassword());
}
