/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno, gustavo w, leonardo rovigo e Felipe
 */
public class AnaliseFluxoCaixa implements Observer{
    private Subject subject;
    
   public AnaliseFluxoCaixa (Subject subject){
       this.subject = subject;
       this.subject.addObserver(this);
   }
   
    
    @Override
    public void update(ContaCorrente cc) {
       toString(cc);
       JOptionPane.showMessageDialog(null, toString(cc));
    }
    
    public String toString(ContaCorrente cc){
        List<Operacao> operacoes = cc.getOperacoes();
        Operacao operacao = operacoes.get(operacoes.size() - 1);
        return "Cliente " +cc.getCliente() + ", Conta" +cc.getChave()+", " +operacao.getTipo()+ " de R$ " +operacao.getValor()+ " - Serviço de Análise de Fluxo de Caixa";
    }
    
 
    
}
