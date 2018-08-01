package Quest2;

public class Interface {

    public static void main(String[] args) {
        Miseravel ms1 = new Miseravel();
        ms1.setNome("Valdete");
        ms1.setIdade(20);
        ms1.mendiga = true;
        String nomem = ms1.getNome();
        int idadem = ms1.getIdade();
        System.out.println("Nome pessoa miseravel: " + nomem);
        System.out.println("Idade pessoa miseravel: " + idadem);
        System.out.println("Mendiga: " + ms1.mendiga);
        
        System.out.println("***********");

        Pobre pobre1 = new Pobre();
        pobre1.setNome("Tainara");
        pobre1.setIdade(16);
        pobre1.trabalha = false;
        String nomep = pobre1.getNome();
        int idadep = pobre1.getIdade();
        System.out.println("Nome pessoa pobre:" + nomep);
        System.out.println("Idade pessoa pobre:" + idadep);
        System.out.println("Trabalha:" + pobre1.trabalha);
        
        System.out.println("***********");
        
        Rica rica1 = new Rica();
        rica1.setNome("Leticia");
        rica1.setIdade(16);
        rica1.comprar = true;
        rica1.setDinheiro(1000);
        String nomeR = rica1.getNome();
        int idadeR = rica1.getIdade();
        double Dinheiro = rica1.getDinheiro();
        System.out.println("Nome Rica: "+nomeR);
        System.out.println("Idade Rica: "+idadeR);
        System.out.println("Comprar: "+rica1.comprar);
        System.out.println("Dinheiro: "+Dinheiro);
        
    }

}
