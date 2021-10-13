package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EjemploTiempo {

    public static void main(String[] args) {

        /** https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html **/
        LocalDate hoy = LocalDate.now(); //2021-10-13
        LocalDate ayer = hoy.minusDays(1);
        LocalDate mañana = ayer.plusDays(2);
        hoy.plusDays(3);
        hoy.plusMonths(4);
        hoy.plusWeeks(5);
        hoy.plusYears(6);
        hoy.minusMonths(3);
        hoy.minusWeeks(5);
        hoy.minusYears(3);
        mañana.isAfter(hoy);
        hoy.isBefore(mañana);
        hoy.isEqual(hoy);

        /** https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html**/

        LocalTime ahora = LocalTime.now(); //00:08:16.922686252
        LocalTime tiempo1 = LocalTime.of(10, 43, 12);
        LocalTime tiempo2 = tiempo1.minusHours(2);
        LocalTime tiempo3 = tiempo2.minusMinutes(34);
        LocalTime tiempo4 = tiempo1.plusHours(4);
        LocalTime tiempo5 = tiempo2.plusMinutes(18);
        tiempo1.isAfter(ahora);
        ahora.isBefore(tiempo1);
        tiempo1.equals(tiempo1);

        /** https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html**/
        LocalDateTime fechaYHora = LocalDateTime.now();
    }
}
