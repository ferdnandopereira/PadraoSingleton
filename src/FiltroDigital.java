public class FiltroDigital {

    private FiltroDigital() {} //define o construtor como privado

    private static FiltroDigital instance = new FiltroDigital(); //define unica instancia

    // acessa a instancia unica
    public static FiltroDigital getInstance() {
        return instance;
    }
    private String dispositivoAnalogico;
    private String grandezaFisica;

    public String getDispositivoAnalogico(){
        return dispositivoAnalogico;
    }
    public void setNomeDispositivoAnalogico(String dispositivoAnalogico){
        this.dispositivoAnalogico = dispositivoAnalogico;
    }
    public String getGrandezaFisica(){
        return grandezaFisica;
    }
    public void setNomeGrandezaFisica(String grandezaFisica){
        this.grandezaFisica = grandezaFisica;
    }
}
