package edu.daeva.pelisdaeva.ejercicio_02.converters;

import edu.daeva.pelisdaeva.ejercicio_01.elementos.Arco;
import edu.daeva.pelisdaeva.ejercicio_01.elementos.ElementoDefensor;
import edu.daeva.pelisdaeva.ejercicio_01.elementos.Escudo;
import edu.daeva.pelisdaeva.ejercicio_01.elementos.Espada;
import edu.daeva.pelisdaeva.ejercicio_02.motivaciones.BajarDePeso;
import edu.daeva.pelisdaeva.ejercicio_02.motivaciones.Mantener;
import edu.daeva.pelisdaeva.ejercicio_02.motivaciones.Motivacion;
import edu.daeva.pelisdaeva.ejercicio_02.motivaciones.Tonificar;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class MotivacionConverter implements AttributeConverter<Motivacion, String> {


    @Override
    public String convertToDatabaseColumn(Motivacion motivacion) {
        return motivacion.getClass().toString();
    }

    @Override
    public Motivacion convertToEntityAttribute(String stringInDb) {
        switch (stringInDb) {
            case "BajarDePeso":
                return new BajarDePeso();
            case "Mantener":
                return new Mantener();
            case "Tonificar":
                return new Tonificar();
            default:
                throw new IllegalArgumentException("El atributo no es válido");
        }
    }
}
