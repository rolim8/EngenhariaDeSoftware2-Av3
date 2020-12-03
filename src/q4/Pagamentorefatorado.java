//Francisco Mateus Santos Pinto
package q4;

public class Pagamentorefatorado {

           public double efetuarPagamento(){

                if(statusPagamento(isEmAberto())){

                    return pagamentoEmAberto();

                }else if(statusPagamento(isPreparado())){

                    return pagamentoPreparado();

                }else if(statusPagamento(isAtrasado())) {

                    return pagamentoAtrasado();

                }else{
                    return pagamentoNormal();

                }
           }
    public boolean statusPagamento(Boolean status) {
        if (isEmAberto()) {
            return true;
        } else if(isPreparado()){
            return true;
        }else {
            return isAtrasado();
        }
    }

    private Boolean isEmAberto() {
        return true;
    }

    private double pagamentoEmAberto() {
        return 0;
    }

    private Boolean isPreparado() {
        return true;
    }

    private double pagamentoPreparado() {
        return 0;
    }

    private Boolean isAtrasado() {
        return true;
    }

    private double pagamentoAtrasado() {
        return 0;
    }

    private double pagamentoNormal() {
        return 0;
    }
        
}     




    
