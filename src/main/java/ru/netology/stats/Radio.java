package ru.netology.stats;

public class Radio {
    private int amountStation = 10;
    private int currentStation = getCurrentStation();
    private int currentVolume;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio() {
        amountStation = getAmountStation();

    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation == amountStation) {
            newCurrentStation = 0;
        } else if (newCurrentStation == 0) {
            newCurrentStation = amountStation;
        }
        currentStation = newCurrentStation;
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

    public void prevStation() {
        if (currentStation <= amountStation) {
            currentStation = currentStation - 1;
        }else {
            amountStation = amountStation -1;
        }
        if (currentStation < 0) {
            currentStation = amountStation - 1;
        }
    }
        public void nextStation () {
            if (currentStation == amountStation - 1) {
                currentStation = 0;
            } else {
                currentStation = currentStation + 1;
            }
        }
    }
