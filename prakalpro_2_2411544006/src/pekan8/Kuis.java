package pekan8;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kuis {

    private JFrame frame;
    private JTextField Nama;
    private JTextField Umur;
    private JLabel Hasil;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Kuis window = new Kuis();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Kuis() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 376);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("Aplikasi Razia Motor Online");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(93, 11, 256, 36);
        frame.getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel = new JLabel("Nama");
        lblNewLabel.setBounds(46, 78, 46, 14);
        frame.getContentPane().add(lblNewLabel);

        Nama = new JTextField();
        Nama.setBounds(181, 75, 171, 20);
        frame.getContentPane().add(Nama);
        Nama.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Umur");
        lblNewLabel_1.setBounds(46, 113, 46, 14);
        frame.getContentPane().add(lblNewLabel_1);

        Umur = new JTextField();
        Umur.setBounds(181, 110, 86, 20);
        frame.getContentPane().add(Umur);
        Umur.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("SIM C");
        lblNewLabel_2.setBounds(46, 148, 46, 14);
        frame.getContentPane().add(lblNewLabel_2);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Pilih", "Iya", "Tidak"}));
        comboBox.setBounds(181, 144, 83, 22);
        frame.getContentPane().add(comboBox);

        JButton btnNewButton = new JButton("Proses");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nama = Nama.getText();
                    int inputumur = Integer.parseInt(Umur.getText());
                    String StatusSimC = (String) comboBox.getSelectedItem();

                    if (inputumur >= 17 && StatusSimC.equals("Iya")) {
                        Hasil.setText(nama + ", Anda sudah bisa membawa motor.");
                    } else if (inputumur < 17 && StatusSimC.equals("Iya")) {
                        Hasil.setText(nama + ", Anda belum cukup umur.");
                    } else if (inputumur >= 17 && StatusSimC.equals("Tidak")) {
                        Hasil.setText(nama + ", Anda sudah dewasa tetapi tidak boleh membawa motor.");
                    } else {
                        Hasil.setText(nama + ", Anda belum cukup umur untuk punya SIM.");
                    }
                } catch (NumberFormatException ex) {
                    Hasil.setText("Umur harus berupa angka!");
                }
            }
        });
        btnNewButton.setBounds(93, 213, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Reset");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Nama.setText("");
                Umur.setText("");
                comboBox.setSelectedIndex(0);
                Hasil.setText("");
            }
        });
        btnNewButton_1.setBounds(260, 213, 89, 23);
        frame.getContentPane().add(btnNewButton_1);

        Hasil = new JLabel("");
        Hasil.setHorizontalAlignment(SwingConstants.CENTER);
        Hasil.setBounds(8, 258, 418, 69);
        frame.getContentPane().add(Hasil);
    }
}
