/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoranetbeansmvc;

import com.mycompany.calculadoranetbeansmvc.Visao.JFrTela;

/**
 *
 * @author User
 */
public class Principal {
    public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrTela().setVisible(true);
            }
        });
    } 
    }
