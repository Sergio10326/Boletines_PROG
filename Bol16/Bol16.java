package boletin16;

class Publicacion {
    private int codigo;
    private String titulo;
    private int anioPublicacion;

    public Publicacion(int codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnio() {
        return anioPublicacion;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Año de Publicación: " + anioPublicacion;
    }
}

class Libro extends Publicacion {
    private boolean prestado;

    public Libro(int codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.prestado = false; // Por defecto, un libro no está prestado al crearse.
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prestado: " + prestado;
    }
}

class Revista extends Publicacion {
    private int numero;

    public Revista(int codigo, String titulo, int anioPublicacion, int numero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número: " + numero;
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro = new Libro(1, "El señor de los anillos", 1954);
        Revista revista = new Revista(2, "National Geographic", 2022, 123);

        System.out.println(libro.toString());
        System.out.println(revista.toString());
    }
}


