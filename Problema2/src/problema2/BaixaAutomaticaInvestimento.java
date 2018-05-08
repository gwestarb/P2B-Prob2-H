/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno, gustavo w, leonardo rovigo e Felipe
 */
public class BaixaAutomaticaInvestimento implements Observer{
    private Subject subject;
    
    public BaixaAutomaticaInvestimento(Subject subject){
       this.subject = subject;
       this.subject.addObserver(this);
    }
    
     @Override
    public void update(ContaCorrente cc) {
        toString(cc);
        JOptionPane.showMessageDialog(null, toString(cc));
    }
    
    public String toString(ContaCorrente cc){
        
        return "Cliente " +cc.getCliente() + ", Conta" +cc.getChave()+" - Baixa automática de investimento";
    }

   
    
}
