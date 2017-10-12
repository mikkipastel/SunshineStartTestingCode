package com.example.android.sunshine;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestHelper {
    private static String convertStreamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        reader.close();
        return sb.toString();
    }

    public static String getStringFromFile(String filePath) throws Exception {
        String fileName = System.getProperty("user.dir") + "/app/src/test/data/";
        final InputStream stream = new FileInputStream(fileName + filePath);
        String ret = convertStreamToString(stream);
        stream.close();
        return ret;
    }
}
