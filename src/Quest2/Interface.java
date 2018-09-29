package Quest2;

public class Interface {
    public static void main(String[] args) {
        Miseravel m1 = new Miseravel();
        Pobre p1 = new Pobre();
        Rica r1 = new Rica();
        
        m1.setNome("Valdete");
        m1.setIdade(20);
        m1.mendiga = true;
        String nomeM = m1.getNome();
        int idadeM = m1.getIdade();
        System.out.println("Nome pessoa miseravel: " + nomeM);
        System.out.println("Idade pessoa miseravel: " + idadeM);
        System.out.println("Mendiga: " + m1.mendiga);
        
        System.out.println("***********");

        p1.setNome("Tainara");
        p1.setIdade(16);
        p1.trabalha = false;
        String nomeP = p1.getNome();
        int idadeP = p1.getIdade();
        System.out.println("Nome pessoa pobre:" + nomeP);
        System.out.println("Idade pessoa pobre:" + idadeP);
        System.out.println("Trabalha:" + p1.trabalha);
        
        System.out.println("***********");
        
        r1.setNome("Leticia");
        r1.setIdade(16);
        r1.comprar = true;
        r1.setDinheiro(1000);
        String nomeR = r1.getNome();
        int idadeR = r1.getIdade();
        double dinheiro = r1.getDinheiro();
        System.out.println("Nome Rica: "+nomeR);
        System.out.println("Idade Rica: "+idadeR);
        System.out.println("Comprar: "+r1.comprar);
        System.out.println("Dinheiro: "+dinheiro);
        
    }
}
