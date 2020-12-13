package com.ionut;

public interface Subject {

    void notifyObservers();

    void addObserver(Observer observer);

    void removeObserver(Observer o);

}
