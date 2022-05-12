
package aluno2;

import javax.swing.JOptionPane;

public class Aluno2 {

    public static void main(String[] args) {
        
        String nome=JOptionPane.showInputDialog(null,"Informe seu nome:","AppAluno",3);
        
        String ra=JOptionPane.showInputDialog(null,"Informe seu ra:","AppAluno",3);
        
        float primeiroBimestre=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe sua nota do primeiro bimestre (decimais depois de ponto):","AppAluno",3));
        
        float segundoBimestre=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe sua nota do segundo bimestre (decimais depois de ponto):","AppAluno",3));
        
        DadosAluno objAluno = new DadosAluno();
        
        objAluno.setRa(ra);
        objAluno.setNome(nome);
        objAluno.setPrimeiroBimestre(primeiroBimestre);
        objAluno.setSegundoBimestre(segundoBimestre);
         
        JOptionPane.showMessageDialog(null, "Nome: "+objAluno.getNome()+"\nRA: "+objAluno.getRa()+"\nMédia Final: "+objAluno.médiaFinal()+"\nSituação: "+objAluno.aprovação(),"AppAluno",1);
    }
        
}
