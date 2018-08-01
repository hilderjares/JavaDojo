package Quest1;

/**
 *
 * @author Francisco Hilderjares
 */
public class Interface {
    public static void main(String[] args) {
        
        Gato gato1 = new Gato(); 
        gato1.setNome("Berry");
        gato1.setRaca("Persa");
        gato1.Caminha = false;
        gato1.mia = true;
        String nomegato1 = gato1.getNome();
        String racagato1 = gato1.getRaca();
        System.out.println("Nome Gato:"+nomegato1);
        System.out.println("Raça Gato:"+racagato1);
        System.out.println("Caminha: "+gato1.Caminha);
        System.out.println("Mia: "+gato1.mia);
        
        System.out.println("*************");
        
        Cachorro cachorro1 = new Cachorro(); 
        cachorro1.setNome("MaMa");
        cachorro1.setRaca("York Shire");
        cachorro1.Caminha = true;
        cachorro1.late = false;
        String nomecachorro1 = cachorro1.getNome();
        String racacachorro1 = cachorro1.getRaca();
        System.out.println("Nome Cachorro: "+nomecachorro1);
        System.out.println("Raça Cachorro: "+racacachorro1);
        System.out.println("Caminha: "+cachorro1.Caminha);
        System.out.println("Late: "+cachorro1.late);
        
        
    }
    
}
