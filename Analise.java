import java.util.*;

public class Analise {

    public static void preencherDados(Set<Produto> con) {
        //instanciando TipoProduto
        List<TipoProduto> lista = new ArrayList<TipoProduto>();
        lista.add(new TipoProduto(1, "Café Solúvel"));
        lista.add(new TipoProduto(2, "Açucar"));
        lista.add(new TipoProduto(3, "Adoçante"));
        lista.add(new TipoProduto(4, "Pão de queijo"));
        lista.add(new TipoProduto(5, "Chocolate"));


        Produto e1 = new Produto(1, "Zé moleque",2.30,lista.get(0));
        Produto e2 = new Produto(4, "Coisa boa",2.20,lista.get(1));
        Produto e3 = new Produto(4, "Zero Gosto",3.45,lista.get(2));
        Produto e4 = new Produto(7, "Da Vovó",8.10, lista.get(3));
        Produto e5 = new Produto(10, "Kakaw",2.80, lista.get(4));
        /*
        Produto e1 = new Produto(1, "Zé moleque",2.30, lista.get(0));
        Produto e2 = new Produto(2, "Gostinho Bom",3.35, lista.get(0));
        Produto e3 = new Produto(3, "Doce Vida",2.60, lista.get(1));
        Produto e4 = new Produto(4, "Coisa boa",2.20, lista.get(1));
        Produto e5 = new Produto(5, "Engordiet",4.55, lista.get(2));
        Produto e6 = new Produto(6, "ZeroGosto",3.45, lista.get(2));
        Produto e7 = new Produto(7, "Da Vovó",8.10, lista.get(3));
        Produto e8 = new Produto(8, "Queijopão",8.40, lista.get(3));
        Produto e9 = new Produto(9, "ChocoGood",3.50, lista.get(4));
        Produto e10 = new Produto(10, "Kakaw",2.80, lista.get(4));
            */
        con.add(e1);
        con.add(e2);
        con.add(e3);
        con.add(e4);
        con.add(e5);
        /*
        con.add(e6);
        con.add(e7);
        con.add(e8);
        con.add(e9);
        con.add(e10);
       */
    }


    public static void main(String[] args) {

        List<TipoProduto> lista = new ArrayList<TipoProduto>();

        //instanciando TipoProduto
        lista.add(new TipoProduto(1, "Café Solúvel"));
        lista.add(new TipoProduto(2, "Açucar"));
        lista.add(new TipoProduto(3, "Adoçante"));
        lista.add(new TipoProduto(4, "Pão de queijo"));
        lista.add(new TipoProduto(5, "Chocolate"));

        //instanciando Produto
        List<Produto> listaProd = new ArrayList<Produto>();

        listaProd.add(new Produto(1, "Zé moleque",2.30, lista.get(0)));
        listaProd.add(new Produto(2, "Gostinho Bom",3.35, lista.get(0)));
        listaProd.add(new Produto(3, "Doce Vida",2.60, lista.get(1)));
        listaProd.add(new Produto(4, "Coisa boa",2.20, lista.get(1)));
        listaProd.add(new Produto(5, "Engordiet",4.55, lista.get(2)));
        listaProd.add(new Produto(6, "ZeroGosto",3.45, lista.get(2)));
        listaProd.add(new Produto(7, "Da Vovó",8.10, lista.get(3)));
        listaProd.add(new Produto(8, "Queijopão",8.40, lista.get(3)));
        listaProd.add(new Produto(9, "ChocoGood",3.50, lista.get(4)));
        listaProd.add(new Produto(10, "Kakaw",2.80, lista.get(4)));




        //exibir valores em lista e em ordem
        System.out.println("\n------------------------------------------------------------------\n");

        System.out.println("Exibindo valores da lista de forma ordenada");
        System.out.println("\n------------------------------------------------------------------\n");

        for (int i=0; i<listaProd.size(); i++) {
            System.out.println(listaProd.get(i).toString());
        }
        System.out.println("\n------------------------------------------------------------------\n");

        System.out.println("\n------------------------------------------------------------------\n");

        // não consegui fazer o linkedhasSet funcionar, ele permiti repetidos.
        Set<Produto> lhs = new LinkedHashSet<Produto>();
        preencherDados(lhs);

        System.out.println("Imprimindo conjunto:");
        for(Produto p: lhs)
            System.out.println(p);

        /*teste
        for(TipoProduto tp: lista)
            System.out.println(tp.getNome());
        */

        //criando mapa
        Map<Produto, Pesquisador> m = new HashMap<Produto, Pesquisador>();
        Pesquisador p1, p2,p3;
        Produto pro1;

        //Instanciando objetos da classe Pesquisador
        p1 = new Pesquisador(1,"Analista1");
        p2 = new Pesquisador(2,"Analista2");
        p3 = new Pesquisador(3,"Analista3");




    }


}
