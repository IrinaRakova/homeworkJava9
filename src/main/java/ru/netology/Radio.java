package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int numberRadioStations = 10;
    private int minNumberRadioStations = 0;
    private int maxNumberRadioStations = 9;
    private int currentRadioStationNumber = minNumberRadioStations;
    private int currentVolume;

    public Radio(int numberRadioStations) {
        this.currentRadioStationNumber = this.minNumberRadioStations;
        this.currentRadioStationNumber = this.minNumberRadioStations;
        this.numberRadioStations = numberRadioStations;
        this.minNumberRadioStations = this.minNumberRadioStations;
        this.maxNumberRadioStations = this.minNumberRadioStations + numberRadioStations - 1;
        this.currentRadioStationNumber = this.currentRadioStationNumber;
        this.currentVolume = this.currentVolume;
    }

    public int getNumberRadioStations() {
        return this.numberRadioStations;
    }

    public int getMinNumberRadioStations() {
        return this.minNumberRadioStations;
    }

    public int getMaxNumberRadioStations() {
        return this.maxNumberRadioStations;
    }

    public int getCurrentRadioStationNumber() {
        return this.currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber >= this.minNumberRadioStations) {
            if (newCurrentRadioStationNumber <= this.maxNumberRadioStations) {
                this.currentRadioStationNumber = newCurrentRadioStationNumber;
            }
        }
    }

    public void nextRadioStationNumber() {
        if (this.currentRadioStationNumber < this.maxNumberRadioStations) {
            ++this.currentRadioStationNumber;
        } else {
            this.currentRadioStationNumber = this.minNumberRadioStations;
        }

        this.setCurrentRadioStationNumber(this.currentRadioStationNumber);
    }

    public void prevRadioStationNumber() {
        if (this.currentRadioStationNumber > this.minNumberRadioStations) {
            --this.currentRadioStationNumber;
        } else {
            this.currentRadioStationNumber = this.maxNumberRadioStations;
        }

        this.setCurrentRadioStationNumber(this.currentRadioStationNumber);
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0) {
            if (newCurrentVolume <= 100) {
                this.currentVolume = newCurrentVolume;
            }
        }
    }

    public void increaseVolume() {
        if (this.currentVolume < 100) {
            ++this.currentVolume;
        }

        this.setCurrentVolume(this.currentVolume);
    }

    public void reduceVolume() {
        if (this.currentVolume > 0) {
            --this.currentVolume;
        }

        this.setCurrentVolume(this.currentVolume);
    }
}

