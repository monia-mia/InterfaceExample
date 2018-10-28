package com.company;

public interface Speakable {
    String FIELD = "field"; //nie trzeba tworzyć poprzez użycie "static final", i nazwa jak w ENUM z dużych liter

    void speak(String str); //nie trzeba słówka public
    String speakMessage(String str);


}
