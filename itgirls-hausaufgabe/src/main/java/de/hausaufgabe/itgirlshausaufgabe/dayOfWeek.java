package de.hausaufgabe.itgirlshausaufgabe;

public enum dayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String russTranslate;

    dayOfWeek(String russTranslate) {
        this.russTranslate = russTranslate;
    }
public String getRussTranslate(){
        return russTranslate;
}
}
