package boletin4;

public class Libro {
    
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    public Libro() {
        // Constructor vacío
    }
    
    public Libro(short numPaginas, int ano, String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor; 
        this.ano = ano;
        this.numPaginas = numPaginas;       
    }

    // Métodos de acceso
    public void setAutor(String autor) {
        this.autor = autor; 
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;  
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion; 
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public int getAno() {
        return ano;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void mostrar() {
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\nNumPaginas: " + numPaginas + "\nValoracion: " + valoracion);
    }
    
}
