package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class clientsScreen extends JFrame {
    private Container pTela;
    final private JLabel lNome;
    final private JLabel lCPF;
    final private JLabel lTelefone;
    final private JButton bOk;
    final private JButton bCancel;
    private JTextField tNome;
    private JTextField tCPF;
    private JTextField tTelefone;
    Box boNome;
    Box boCPF;
    Box boTelefone;

    public clientsScreen()
    {
        pTela = this.getContentPane();

        boNome = Box.createHorizontalBox();
            tNome = new JTextField(40);
            lNome = new JLabel("Nome:");
            boNome.add(lNome);
            boNome.add(tNome);

        boCPF = Box.createHorizontalBox();
            tCPF = new JTextField(11);
            lCPF = new JLabel("CPF - apenas números:");
            boCPF.add(lCPF);
            boCPF.add(tCPF);

        boTelefone = Box.createHorizontalBox();
            tTelefone = new JTextField(12);
            lTelefone = new JLabel("Telefone + DDD:");
            boTelefone.add(lTelefone);
            boTelefone.add(tTelefone);

        bOk = new JButton("OK");
        bCancel = new JButton("Cancelar");

        pTela.add(boNome);
        pTela.add(boCPF);
        pTela.add(boTelefone);
        pTela.add(bOk);
        pTela.add(bCancel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,70);
        setResizable(false);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == bOk) {
            // ABRIR TELA TECNICOS
        }

        else if(event.getSource() == bCancel) {
            // ABRIR TELA CLIENTES
        }
    }
}
