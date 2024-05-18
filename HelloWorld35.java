/**
 * HelloWorld35.java
 *
 * Opis:
 * Program za prikaz delovanja GUI na primeru razredov poslovne logike Stikalo34, Čas34 in Zatemnjen34.
 * Ta program omogoča interakcijo z uporabnikom preko grafičnega vmesnika za upravljanje s stikali.
 *
 * Avtor: Gašper Zdešar
 * Naloga 35 (GUI)
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

public class HelloWorld35 extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JTextField lokacijaVnos;
    private JTextField intenzivnostVnos;
    private JTextField zatemnitevVnos;
    private JTextField casovnikVnos;
    private JButton dodajStikaloButton;
    private JTable tabela;
    private Stikalo35TableModel modelTabele;
    private ArrayList<Stikalo34> stikala;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HelloWorld35().setVisible(true));
    }

    public HelloWorld35() {
        setTitle("Miza s stikali");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        stikala = new ArrayList<>();

        mainPanel = new JPanel(new GridLayout(0, 2));

        lokacijaVnos = new JTextField(20);
        intenzivnostVnos = new JTextField(5);
        zatemnitevVnos = new JTextField(5);
        casovnikVnos = new JTextField(5);

        dodajStikaloButton = new JButton("Dodaj stikalo");
        dodajStikaloButton.addActionListener(this);

        modelTabele = new Stikalo35TableModel();
        tabela = new JTable(modelTabele);

        mainPanel.add(new JLabel("Lokacija:"));
        mainPanel.add(lokacijaVnos);
        mainPanel.add(new JLabel("Intenzivnost:"));
        mainPanel.add(intenzivnostVnos);
        mainPanel.add(new JLabel("Zatemnitev:"));
        mainPanel.add(zatemnitevVnos);
        mainPanel.add(new JLabel("Časovnik:"));
        mainPanel.add(casovnikVnos);
        mainPanel.add(dodajStikaloButton);
        mainPanel.add(new JScrollPane(tabela));

        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String lokacija = lokacijaVnos.getText();
        int intenzivnost = Integer.parseInt(intenzivnostVnos.getText());
        int zatemnitev = Integer.parseInt(zatemnitevVnos.getText());
        int casovnik = Integer.parseInt(casovnikVnos.getText());

        Stikalo34 novoStikalo;

        if (!zatemnitevVnos.getText().isEmpty()) {
            novoStikalo = new Zatemnjen34(lokacija);
            ((Zatemnjen34) novoStikalo).nastaviZatemnitev(zatemnitev);
        } else if (!casovnikVnos.getText().isEmpty()) {
            novoStikalo = new Čas34(lokacija);
            ((Čas34) novoStikalo).nastaviTimer(casovnik);
        } else {
            novoStikalo = new Stikalo34(lokacija);
        }

        novoStikalo.vklopi();
        novoStikalo.spremeniIntenzivnost(intenzivnost);
        stikala.add(novoStikalo);
        modelTabele.addStikalo(novoStikalo);
    }
}