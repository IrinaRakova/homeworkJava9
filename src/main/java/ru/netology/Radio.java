package ru.netology;

public class Radio {
    private int numberRadioStations = 10;
    private int minNumberRadioStations = 0;
    private int maxNumberRadioStations = 9;
    private int currentRadioStationNumber = minNumberRadioStations;
    private int currentVolume;

    public Radio(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
        this.minNumberRadioStations = minNumberRadioStations;
        this.maxNumberRadioStations = minNumberRadioStations + numberRadioStations - 1;
        this.currentRadioStationNumber = minNumberRadioStations;
    }

    public Radio() {
    }

    public int getMinNumberRadioStations() {
        return minNumberRadioStations;
    }

    public int getMaxNumberRadioStations() {
        return maxNumberRadioStations;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minNumberRadioStations) {
            return;
        }
        if (newCurrentRadioStationNumber > maxNumberRadioStations) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber < maxNumberRadioStations) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = minNumberRadioStations;
        }
        setCurrentRadioStationNumber(currentRadioStationNumber);
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber > minNumberRadioStations) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = maxNumberRadioStations;
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
