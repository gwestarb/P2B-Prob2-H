/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author bruno
 */
public class Notificacao {

    public boolean isWhatsApp() {
        return WhatsApp;
    }

    public void setWhatsApp(boolean WhatsApp) {
        this.WhatsApp = WhatsApp;
    }

    public boolean isSMS() {
        return SMS;
    }

    public void setSMS(boolean SMS) {
        this.SMS = SMS;
    }

    public boolean isJMS() {
        return JMS;
    }

    public void setJMS(boolean JMS) {
        this.JMS = JMS;
    }
    
    private boolean WhatsApp;
    private boolean SMS;
    private boolean JMS;
    String str = "";
    
    public void defineNotificacao() {
        if (WhatsApp || SMS || JMS) {
            str = ", Notificação enviada por";
        }
        if (WhatsApp) {
            str = str + " - Whatsapp";
        }
        if (SMS) {
            str = str + " - SMS";
        }
        if (JMS) {
            str = str + " - JMS";
        }
}

    public String toString(ContaCorrente cc){
        
        return "Cliente " +cc.getCliente() + ", Conta" +cc.getChave()+str;
    }
    

}
