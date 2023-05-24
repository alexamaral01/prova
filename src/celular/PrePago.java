package celular;

public class PrePago extends Celular{

  private int qtdeCreditos;

  public PrePago(int pDdd, String pNumero){
    super(pDdd, pNumero);
    this.qtdeCreditos = 50;
  }

  public void inserirCreditos(int pQtdeCreditos){ 
    this.qtdeCreditos = this.qtdeCreditos + pQtdeCreditos;
  }

  public void ligacao(int pQtdeMinutos){
    this.qtdeCreditos = this.qtdeCreditos - pQtdeMinutos;
  }

  public void mostrarSituacao(){
    System.out.println("DDD="+ this.getDdd() +", numero=" + this.getNumero() +", creditos=" + this.qtdeCreditos); // o parenteses no final do método representa que eke é de outra classe (Celular)
  }
}
