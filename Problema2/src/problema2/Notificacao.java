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
public class Notificacao implements Observer{
private Subject subject;
String str = "";
    
    public Notificacao(Subject subject){
       this.subject = subject;
       this.subject.addObserver(this);
       
    }
 
    @Override
    public void update(ContaCorrente cc) {
        defineNotificacao(cc);
        toString(cc);
        JOptionPane.showMessageDialog(null, toString(cc));

    }
    
    public void defineNotificacao(ContaCorrente cc) {
        if (cc.isWhatsapp() || cc.isSms() || cc.isJms()) {
            str = ", Notificação enviada por";
        }
        if (cc.isWhatsapp()) {
            str = str + " - Whatsapp";
        }
        if (cc.isSms()) {
            str = str + " - SMS";
        }
        if (cc.isJms()) {
            str = str + " - JMS";
        }
}

    public String toString(ContaCorrente cc){
        return "Cliente " +cc.getCliente() + ", Conta" +cc.getChave()+str;
    }

    
    

}
