package com.example.android.sunshine.data.database;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.example.android.sunshine.TestHelper;
import com.google.gson.Gson;

public class WeatherEntryTest {

    private String json;
    private WeatherEntry entry;

    @Before
    public void setUp() throws Exception {
        json = TestHelper.getStringFromFile("data_weather.json");
        entry = new Gson().fromJson(json, WeatherEntry.class);
    }

    @Test
    public void parseJsonDataResult_getId() throws Exception {
        Assert.assertEquals(0.0158, entry.getId(), 0.0158);
    }

    @Test
    public void parseJsonDataResult_getweatherIconId() throws Exception {
        Assert.assertEquals(5375480, entry.getWeatherIconId(), 5375480);
    }

    @Test
    public void parseJsonDataResult_getMin() throws Exception {
        Assert.assertEquals(12.33903714326874, entry.getMin(), 12.33903714326874);
    }

    @Test
    public void parseJsonDataResult_getMax() throws Exception {
        Assert.assertEquals(16.104138698142254, entry.getMax(), 16.104138698142254);
    }

    @Test
    public void parseJsonDataResult_getHumidity() throws Exception {
        Assert.assertEquals(92.34345292020447, entry.getHumidity(), 92.34345292020447);
    }

    @Test
    public void parseJsonDataResult_getPressure() throws Exception {
        Assert.assertEquals(959.4504023248944, entry.getPressure(), 959.4504023248944);
    }

    @Test
    public void parseJsonDataResult_getWind() throws Exception {
        Assert.assertEquals(45.80081989493485, entry.getWind(), 45.80081989493485);
    }

    @Test
    public void parseJsonDataResult_getDegrees() throws Exception {
        Assert.assertEquals(41, entry.getDegrees(), 41);
    }

    @After
    public void tearDown() {
        json = null;
        entry = null;
    }
}
