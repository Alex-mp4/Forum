package MVC;

import javax.swing.*;

public class controller extends JFrame {
    model model;
    view view;

    public controller(model m, view v) {
        this.model = model;
        this.view = view;

        this.setContentPane(view.getPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setTitle("Chatprogram.Client Chat");
    }

    public static void main(String[] args) {
        model m = new model();
        view v = new view();
        controller c = new controller(m, v);
        c.setVisible(true);
    }
}
