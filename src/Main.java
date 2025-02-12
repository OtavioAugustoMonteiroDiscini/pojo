package src;
public class Main {
    public static void main(String[] args) {
        Peoples pessoas = new Peoples();

        pessoas.setIdade("18");
        pessoas.setNome("Otávio");

        System.out.println(pessoas.getNome() + " tem " + pessoas.getIdade() + " anos");
    
}
}