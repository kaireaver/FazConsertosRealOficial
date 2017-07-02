package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainCliente extends JFrame implements ActionListener 
{
    private JPanel pOpcoes;
    final private JLabel lDescription;
    private static JButton bNovaSolicitacao;
    private static JButton bConsultarSolicitacao;

    public MainCliente(Cliente cliente)
    {
        super("Bem-vindo ao sistema FazConsertos v1.0 - "+ cliente.Nome);

        lDescription = new JLabel("SOLICITAÇÕES: ");

        bNovaSolicitacao = new JButton("      NOVA       ");
        bNovaSolicitacao.addActionListener(this);
        
        bConsultarSolicitacao = new JButton("CONSULTAR");
        bConsultarSolicitacao.addActionListener(this);


        pOpcoes = new JPanel();
        pOpcoes.add(lDescription);
        pOpcoes.add(bNovaSolicitacao);
        pOpcoes.add(bConsultarSolicitacao);

        getContentPane().add(pOpcoes);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,70);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == bNovaSolicitacao) {
            //JFrame fNovaSolicitacao = new ;
            setBotao(bNovaSolicitacao, false);
            setBotao(bConsultarSolicitacao, false);
        }

        else if(event.getSource() == bConsultarSolicitacao)
        {
            //JFrame fConsultaSolicitacao = new ;
            setBotao(bNovaSolicitacao, false);
            setBotao(bConsultarSolicitacao, false);
        }
    }

    public static void setBotao(JButton b, boolean state)
    {
        b.setEnabled(state);
        b.setBorderPainted(state);
    }
    

}