import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RobotoTest{

    @Test

    void SaludoRespuesta (){

       Roboto saludo = new Roboto();
       String respuesta = saludo.respuesta("Hola");

       assertThat( respuesta, equalTo("Hola"));

    }
    @Test

    void QueTiempoHace (){

        Roboto tiempo = new Roboto();
        String ciudad = tiempo.respuesta ("Que tiempo hace en Madrid?");
        assertThat(ciudad, equalTo("Te vas a Madrid y lo miras." ));
    }


        @Test

    void Presentacion (){

    Roboto nombre = new Roboto();
    String niceToMeetYou = nombre.respuesta ("Me llamo Luisa");
    assertThat(niceToMeetYou, equalTo("Encantada de conocerte Luisa" ));
    }

    @Test

    void ElejirEntreMacYLinux () {

            Roboto opcion = new Roboto();
            String queEsMejor = opcion.respuesta ("Qué es mejor, Mac o Linux?");
            assertThat(queEsMejor, equalTo("Sin duda Mac es mejor que Linux"));
    }

}


