
package aluno2;


public class DadosAluno {
    
    private String nome;
    
    private String ra;
    
    private float primeiroBimestre;
    
    private float segundoBimestre;
    
    private String aprovação;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String identificaçãoNome){
        nome=identificaçãoNome;
    
    }
    
    public String getRa(){
        return ra;
    }
    
    public void setRa(String identificação){
        ra=identificação;
    
    }
    public float primeiroBimestre(){
        return primeiroBimestre;
    }
    
    public void setPrimeiroBimestre(float bimestre1){
        primeiroBimestre=bimestre1;
    
    }
    
    public float segundoBimestre(){
        return segundoBimestre;
    }
    
    public void setSegundoBimestre(float bimestre2){
        segundoBimestre=bimestre2;
    }
    
    public float médiaFinal() {
        float médiaFinal=(primeiroBimestre + segundoBimestre)/2;
        return médiaFinal;
    }
    
    public String aprovação(){
        if (médiaFinal() >= 6){
            aprovação="Aprovado";
        }
        else if (4 > médiaFinal()){
            aprovação="Reprovado";
        }
        else {
            aprovação="Exame";
        } 
        return aprovação;
    }
}
