package MVC;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class controller extends JFrame {
    model model;
    view view;

    public controller(model m, view v) {
        this.model = m;
        this.view = v;

        this.setContentPane(view.getPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setTitle("Forum");
    }

    public static void main(String[] args) {
        model m = new model();
        view v = new view();
        controller c = new controller(m, v);
        c.setVisible(true);

        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://db.umea-ntig.se:3306/te20? "+
                    "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",m.getUser(),m.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            Statement stmt = conn.createStatement();
            String SQLQuery = "SELECT * FROM adh31forum";
            //SQLQuery = "INSERT INTO book(title,author) VALUES ('"+title+"', '"+author+')";
            ResultSet result = stmt.executeQuery(SQLQuery);

            ResultSetMetaData metadata = result.getMetaData();

            int numCols = metadata.getColumnCount();
            for (int i = 1 ; i <= numCols ; i++) {
                System.out.println(metadata.getColumnClassName(i));
            }

            while (result.next()) {
                String output = "";
                output += result.getInt("id") + ", " +
                        result.getString("content") + ", " +
                        result.getString("title") + ", " +
                        result.getTimestamp("createdAt") + ", " +
                        result.getInt("authorId");
                //System.out.println(output);
                m.addMessage(output);
                v.setMessage(m.getForum());
                // byt sout med setTextArea
            }

            //koden nedan är för register user

            //Scanner in = new Scanner(System.in);
            //System.out.println("Ange namn");
            //String name = in.nextLine();
            //System.out.println("Ange lösenord");
            //String passwordSt = in.nextLine();
            //SQLQuery = "INSERT INTO adh31users(user,password) VALUES ('"+name+"', '"+passwordSt+"')";
            //stmt.executeUpdate(SQLQuery);

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
