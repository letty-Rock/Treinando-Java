package ArquivosJava;
public class BalancoTrimestral {

    public static void main(String [] args){
        int gastosJaneiro = 15000,
         gastosFevereiro = 23000, gastosMarco = 17000, gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);

         System.out.println("Os gastos trimestrais totalizaram: " + gastosTrimestre);

         float mediaMensal = (gastosTrimestre/3);

         System.out.println("Valor da Média Mensal = " +mediaMensal);
    }
}
