package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void randomStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(5);

        int expected = 5;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(10);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(0);

        int expected = 10;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(101);

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(5);
        stat.prevStation();

        int expected = 4;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void currentStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(11);
        stat.prevStation();

        int expected = 11;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(3);
        stat.nextStation();

        int expected = 4;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMaxStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(9);
        stat.nextStation();

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(0);
        stat.prevStation();

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(50);
        vol.increaseVolume();

        int expected = 51;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(50);
        vol.downVolume();

        int expected = 49;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusMaxVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(100);
        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusMinVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(0);
        vol.downVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        Radio stat = new Radio(30);
        stat.setCurrentStation(0);
        Assertions.assertEquals(30, stat.getAmountStation());
        Assertions.assertEquals(30, stat.getCurrentStation());
    }


    @Test
    public void prevStationDoubleClick() {
        Radio stat = new Radio();

        stat.setCurrentStation(-1);
        stat.prevStation();

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}