package classesAbstratas;

/**
 * Classe abstrata que possui os métodos básicos para
 * as telas do computador de bordo de um veiculo.
 */
public abstract class Tela {
  private String titulo;

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public abstract String obterInformacao();

  public void imprimir() {
    System.out.println(this.titulo);
    System.out.println("\t" + obterInformacao());
  }
}
