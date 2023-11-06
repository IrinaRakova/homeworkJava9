package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class RadioTest {
    @Test
    public void shouldSetCurrentRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationNumberForNumber() {
        Radio radio = new Radio(100);

        radio.setCurrentRadioStationNumber(56);

        int expected = 56;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStationMaxNumber() {
        Radio radio = new Radio(100);

        int expected = 99;
        int actual = radio.getMaxNumberRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStationMaxNumber() {
        Radio radio = new Radio(100);

        int expected = 0;
        int actual = radio.getMinNumberRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);
        radio.nextRadioStationNumber();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextRadioStationNumberAboveMax() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStationNumber(99);
        radio.nextRadioStationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);
        radio.prevRadioStationNumber();

        int expected = 7;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetPrevRadioStationNumberBelowMin() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStationNumber(0);
        radio.prevRadioStationNumber();

        int expected = 99;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(51);

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(51);
        radio.increaseVolume();

        int expected = 52;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetNextCurrentVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(52);
        radio.reduceVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevCurrentVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
