import javax.swing.JOptionPane;

public class Amor {
    private boolean validacao = true;

    private String Amor = "Albedo"; // Digite o nome do seu amor aqui

    public String getAmor() {
        return Amor;
    }
    public void setValidacao() {
        this.validacao = !this.validacao;
    }
    public void setAmor(String amor){
        this.Amor = amor;
    }
    public boolean isValidacao() {
        return validacao;
    }

    public void amores(){
        this.setValidacao();
        JOptionPane.showMessageDialog(null, "Só tem um único amor nesse mundo \ndigite config para configurar uma palavra ou tente acertar a padrão.");
        do{
           String AmorVdd = JOptionPane.showInputDialog(null, "Digite o nome do amor de sua vida:");
           if(AmorVdd.compareToIgnoreCase(this.getAmor()) == 0){
            this.setValidacao();
            JOptionPane.showMessageDialog(null, "Eu te amo, "+ this.getAmor());
           }
           else if(AmorVdd.compareTo("config") ==0){
            String novaConfig = JOptionPane.showInputDialog(null, "Digite o nome do novo amor da sua vida:");
            this.setAmor(novaConfig);
            JOptionPane.showMessageDialog(null, "Nova configuração realizada.");
        }
        }while(!this.isValidacao());
    
    }
    
}
