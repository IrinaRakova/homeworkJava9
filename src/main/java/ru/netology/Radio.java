package ru.netology;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    public int getCurrentRadioStationNumber() {

        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber=currentRadioStationNumber-1;
        } else {
            currentRadioStationNumber = 9;
        }
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        setCurrentVolume(currentVolume);
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        setCurrentVolume(currentVolume);
    }
}
