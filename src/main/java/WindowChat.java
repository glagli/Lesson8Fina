import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowChat extends JFrame {
    private String br;
    String text;

    public WindowChat() {
        setTitle("Чат");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 700);
        setLayout(null);

        // добавил фон
        Font font = new Font("TimesRoman", Font.BOLD, 20);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(5, 2, 380, 580);
        textArea.setFont(font);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEnabled(false);
        add(textArea);


        JButton button = new JButton(">");
        button.setBounds(300, 600, 60, 32);
        button.setFont(font);
        add(button);


        JTextField field = new JTextField();
        field.setBounds(10, 600, 280, 33);
        add(field);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText(field.getText() + br + text);
                field.setText("");
                br = "\n";
                text = textArea.getText();
            }
        });

        setVisible(true);
    }


    public static void main(String[] args) {
        new WindowChat();
    }
}
