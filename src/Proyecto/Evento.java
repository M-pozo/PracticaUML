package Proyecto;

import java.time.LocalDate;

public class Evento {
    private LocalDate date;
    private String description;

    public Evento(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    public void assig(Localizacion l){}
}
