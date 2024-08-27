/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoranetbeansmvc.Controle;
import com.mycompany.calculadoranetbeansmvc.enums.EnumOperacao;
/**
 *
 * @author User
 */
public class CalculadoraController {
    private Double total;
    public CalculadoraController(){
    total= 0.0;
    }
    public Double realizaOperacao(EnumOperacao operacao, Double valor){
        switch (operacao) {
            case SOMA -> total += valor;
            case SUBTRACAO -> total -= valor;
            case DIVISAO -> total /= valor;
            case MULTIPLICACAO -> total *= valor;
            default -> {
            }
        }
        return total;
    
    }
    public Double getTotal(){
    return this.total;
    }
    public void zerar(){
    total = 0.0;
    }
    
}
