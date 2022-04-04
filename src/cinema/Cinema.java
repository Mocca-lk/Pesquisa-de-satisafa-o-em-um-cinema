
package cinema;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.objects.NativeString;


public class Cinema {

    public static void main(String[] args) {
       // declaração de todas as variáveis:
       
       int idade=0;
       int espectador=0; 
       char opiniao;
       int otimo=0, bom=0, regular=0, ruim=0;
       double pessimo=0;
       int somaidade=0;
              
       while (espectador<40) { //Tudo a partir dessa chave será repetido enquanto o número de espectadores não for 40:
           
           idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Nos conte sua idade: "));
           // armazenando informações sobre a idade do usuário;
           
           opiniao = JOptionPane.showInputDialog(null, "Nos conte sua opinião sobre o filme: "+ "\n A- Ótimo B- Bom C- Regular D- Ruim E- Péssimo").charAt(0);
                   
                   switch(opiniao) { //o programa vai ler a resposta dada pelo usuário e armazenar na variável certa;
                       
                       case 'A':
                           otimo=otimo+1;
                           break;
                           
                       case 'B':
                           bom=bom+1;
                           break;
                           
                       case 'C':
                           regular=regular+1;
                           break;
                           
                       case 'D':
                           ruim=ruim+1;
                           somaidade=somaidade+idade;// variável para armazenar idade das pessoas que responderam ruim;
                           break;
                           
                       case 'E':
                           pessimo=pessimo+1;
                           break;
                           
                       default:
                           JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
                           // mensagem caso a pessoa escolha uma opção não registrada;
                           break;
                   }
      
       espectador=espectador+1;
       
       
       }
       //Ao fechar o laço de repetição, vou fazer o cálculo que será mostrado ao usuário;
    JOptionPane.showMessageDialog(null, "Quantidade de pessoas que responderam ótimo: "+otimo);// cálculo
    JOptionPane.showMessageDialog(null, "Média da idade de pessoas que responderam ruim: "+(somaidade/ruim));// cálculo
    JOptionPane.showMessageDialog(null, "Porcentagem de pessoas que responderam péssimo: "+ (pessimo*100/40)+ "%");// cálculo 
       
}
}// fim do programa;