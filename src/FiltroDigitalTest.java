import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FiltroDigitalTest {

    @Test
    public void deveRetornarNomeDispositivo(){
        FiltroDigital.getInstance().setNomeDispositivoAnalogico("Dispositivo 1");
        assertEquals("Dispositivo 1", FiltroDigital.getInstance().getDispositivoAnalogico());
    }
    @Test
    public void deveRetornarGrandezaFisica(){
        FiltroDigital.getInstance().setNomeGrandezaFisica("Grandeza Fisica 1");
        assertEquals("Grandeza Fisica 1", FiltroDigital.getInstance().getGrandezaFisica());
    }
}
