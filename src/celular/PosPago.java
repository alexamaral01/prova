package celular;

public class PosPago extends Celular{
  
  private static final double MENSALIDADE = 150.00; 
  
  private double valorConta;

  public PosPago(int ddd, String numero){ //construtor sempre tem o nome da classe
    super(ddd, numero );
    this.valorConta = 0;
  }

  public void atualizaConta(int pQtdeMinutosMes){
    this.valorConta = MENSALIDADE + (pQtdeMinutosMes * 0.95);
  }

  public void mostraConta(){
    System.out.println("DDD=" + this.getDdd() + "numero=" + this.getNumero() +"valor da conta" + this.valorConta);
  }
}