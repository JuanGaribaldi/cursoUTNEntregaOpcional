package edu.daeva.pelisdaeva.ejercicio_01.converters;

import edu.daeva.pelisdaeva.ejercicio_01.elementos.Arco;
import edu.daeva.pelisdaeva.ejercicio_01.elementos.ElementoDefensor;
import edu.daeva.pelisdaeva.ejercicio_01.elementos.Escudo;
import edu.daeva.pelisdaeva.ejercicio_01.elementos.Espada;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ElementoDefensorConverter implements AttributeConverter<ElementoDefensor, String> {


    @Override
    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor) {
        return elementoDefensor.getClass().toString();
    }

    @Override
    public ElementoDefensor convertToEntityAttribute(String stringInDb) {
        switch (stringInDb) {
            case "Arco":
                return new Arco();
            case "Escudo":
                return new Escudo();
            case "Espada":
                return new Espada();
            default:
                throw new IllegalArgumentException("El atributo no es válido");
        }
    }
}
