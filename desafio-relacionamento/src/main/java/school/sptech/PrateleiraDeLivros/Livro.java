package school.sptech.PrateleiraDeLivros;

public class Livro {

    private String codigo;
    private String nome;
    private String autor;
    private Integer quantidadePaginas;

    public Double calcularPeso() {
        Double peso = quantidadePaginas * 2.4;
        return peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(Integer quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }
}
