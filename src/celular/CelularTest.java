package celular;

public class CelularTest {
    
    public static void main(String[] args) throws Exception {

        PrePago prePago = new PrePago(11, "9999999");
              
        prePago.ligacao(20);
        prePago.mostrarSituacao();

        prePago.inserirCreditos(100);
        





    }
}
