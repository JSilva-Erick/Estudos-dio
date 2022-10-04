import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("---\tOrdem Aleatoria\t---");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
        for (Entry<String,Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() +" - "+ livro.getValue().getNome());             
        }
        System.out.println("---\tOrdem Inserção\t---");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
        for (Entry<String,Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() +" - "+ livro.getValue().getNome());             
        }
        System.out.println("---\tOrdem Alfabetica dos autores\t---");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Entry<String,Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() +" - "+ livro.getValue().getNome());             
        }
        
        System.out.println("---\tOrdem Alfabética nomes dos livros\t---");
        Set<Entry<String, Livro>> meusLivros3  = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Entry<String,Livro> livro : meusLivros3) {
            System.out.println(livro.getKey() +" - "+ livro.getValue().getNome());             
        }
        
        
        System.out.println("---\tOrdem Número de Paginas\t---");
        Set<Entry<String, Livro>> meusLivros4  = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Entry<String,Livro> livro : meusLivros4) {
            System.out.println(livro.getKey() +" - "+ livro.getValue().getNome() + " - " + livro.getValue().getPaginas());             
        }

    }   



    
}

class Livro{
    private String nome;
    private int paginas;

    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + paginas;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas != other.paginas)
            return false;
        return true;
    }
    
    
}

class ComparatorNome implements Comparator<Entry<String,Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}

class ComparatorPaginas implements Comparator<Entry<String,Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }

}