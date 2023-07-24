package ru.netology.stats;

public class Radio {
    private int amountStation = 20;
    private int currentStation = amountStation;
    private int currentVolume;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
        this.currentStation = amountStation;
    }

    public Radio() {
        currentStation = amountStation;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= amountStation) {
            newCurrentStation = amountStation;

        }
        if (newCurrentStation < amountStation) {
            newCurrentStation = newCurrentStation;
        }
        currentStation = newCurrentStation;
    }

    public void prevStation() {
        if (currentStation < amountStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = amountStation - 1;
        }
        if (currentStation <= 0) {
            currentStation = amountStation - 1;
        }
    }

    public void nextStation() {
        if (currentStation < amountStation) {
            currentStation++;
        }
        if (currentStation == amountStation) {
            currentStation = 0;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        } else if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}