import javax.swing.*;
import java.awt.event.*;

public class BiodataMahasiswa extends JFrame {

    JLabel lblNim, lblNama, lblProdi;
    JTextField txtNim, txtNama, txtProdi;
    JButton btnTampil, btnReset;
    JTextArea output;

    public BiodataMahasiswa() {

        setTitle("Aplikasi Biodata Mahasiswa");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblNim = new JLabel("NIM");
        lblNim.setBounds(40,40,120,25);
        add(lblNim);

        lblNama = new JLabel("Nama");
        lblNama.setBounds(40,80,120,25);
        add(lblNama);

        lblProdi = new JLabel("Program Studi");
        lblProdi.setBounds(40,120,120,25);
        add(lblProdi);

        txtNim = new JTextField();
        txtNim.setBounds(180,40,350,25);
        add(txtNim);

        txtNama = new JTextField();
        txtNama.setBounds(180,80,350,25);
        add(txtNama);

        txtProdi = new JTextField();
        txtProdi.setBounds(180,120,350,25);
        add(txtProdi);

        btnTampil = new JButton("Tampilkan");
        btnTampil.setBounds(180,170,130,35);
        add(btnTampil);

        btnReset = new JButton("Reset");
        btnReset.setBounds(330,170,100,35);
        add(btnReset);

        output = new JTextArea();
        output.setEditable(false);

        JScrollPane scroll = new JScrollPane(output);
        scroll.setBounds(40,230,490,180);
        add(scroll);

        btnTampil.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String hasil =
                "========== BIODATA MAHASISWA ==========\n\n"+
                "NIM            : "+txtNim.getText()+"\n"+
                "Nama           : "+txtNama.getText()+"\n"+
                "Program Studi  : "+txtProdi.getText();

                output.setText(hasil);

            }

        });

        btnReset.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                txtNim.setText("");
                txtNama.setText("");
                txtProdi.setText("");
                output.setText("");

            }

        });

    }

    public static void main(String[] args) {

        new BiodataMahasiswa().setVisible(true);

    }

}