public class saudacao {

    public static void main(String[] args) {
    
        String nome = "Nicholas";
        int hora = 23;
        

        
        if(hora<=12){
            System.out.println("Bom dia " + nome);

        }else if(hora>12 && hora<18){
            System.out.println("Boa tarde " + nome);
        
        }else if(hora>=18){
            System.out.println("Boa noite " + nome);
        }

    }
    
}
