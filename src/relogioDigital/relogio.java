package relogioDigital;

import java.util.Set;

public class relogio {
    
    //Atributos
    String marca;
    int hora;
    String saudacao;
    

    //Métodos
    //A estrutura do método ( tipo void + ação + {opcional} parâmetro)
                void alterarNome(String nome){
                    if(nome=="Nicholas");
                        System.out.println("Bem vindo " + nome);
        
                }

    //Estrutura do método utilizando condicionais
                void alterarHora(int hora){
                    if(hora<=12){
                         System.out.println("Bom dia ");

                    }else if(hora>12 && hora<18){
                        System.out.println("Boa tarde ");
    
                    }else if(hora>=18){
                        System.out.println("Boa noite ");
                    
                    }

    
                }   
    
    
}
