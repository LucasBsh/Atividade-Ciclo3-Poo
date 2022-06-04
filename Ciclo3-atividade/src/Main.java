import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int peso;
        float altura;
        float imc;

        String sPeso;
        String sAltura;

        sPeso = JOptionPane.showInputDialog("Digite o seu Peso em Kg");
        sAltura = JOptionPane.showInputDialog("Digite sua altura em Cm");

        peso=Integer.parseInt(sPeso);
        altura=Integer.parseInt(sAltura);

        altura = altura/100;

        imc = peso/(altura*altura);

        if(imc < 17)
            JOptionPane.showMessageDialog(null, "Muito abaixo do peso");
        else if(imc >= 17 && imc < 18.5)
            JOptionPane.showMessageDialog(null, "Abaixo do peso");
        else if(imc >= 18.5 && imc < 25)
            JOptionPane.showMessageDialog(null, "Peso normal");
        else if(imc >= 25 && imc < 30)
            JOptionPane.showMessageDialog(null, "Acima do peso");
        else if(imc >= 30 && imc < 35)
            JOptionPane.showMessageDialog(null, "Obesidade I");
        else if(imc >= 35 && imc < 40)
            JOptionPane.showMessageDialog(null, "Obesidade II (severa)");
        else if(imc >= 40)
            JOptionPane.showMessageDialog(null, "Obesidade III (mórbida)");
    }
}