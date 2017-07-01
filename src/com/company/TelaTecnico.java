package com.company;
import javax.swing.*;
import java.awt.event.*;

public class TelaTecnico extends JFrame implements ActionListener {
    private JPanel pTecnicos;
    final private JButton bNovoTecnico;
    final private JButton bLogaTecnico;


    public TelaTecnico() {
        super("Selecione sua opção:");

        bNovoTecnico = new JButton("Criar técnico");
        bLogaTecnico = new JButton("Entrar no sistema");

        bNovoTecnico.addActionListener(this);
        bLogaTecnico.addActionListener(this);

        pTecnicos = new JPanel();
        pTecnicos.add(bNovoTecnico);
        pTecnicos.add(bLogaTecnico);

        getContentPane().add(pTecnicos);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(500,70);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == bNovoTecnico) {

        }

        else if(event.getSource() == bLogaTecnico) {

        }
    }

}
