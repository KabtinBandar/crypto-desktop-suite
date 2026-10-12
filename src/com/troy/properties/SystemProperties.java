package com.troy.properties;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SystemProperties {

  
    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }



    public SystemProperties(Color color, boolean darkMode, String backgroundImage) {
        this.darkMode = darkMode;
    }

    public SystemProperties() {
    }

    private boolean darkMode;

    public void loadFromFile() {
        try {
//            File path = new File("Path.txt");
//            if (!path.exists()) {
//                path.createNewFile();
//            }
//            FileReader fr = new FileReader(path);
//            BufferedReader br = new BufferedReader(fr);
            Properties pro = new Properties();
            FileInputStream in = new FileInputStream(new File("Privet/config.properties"));
            pro.load(in);
            String themColor = pro.getProperty("theme_color");
            darkMode = Boolean.valueOf(pro.getProperty("dark_mode"));
            in.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void save(String name, String values) {
        try {
//            File path = new File("Path.txt");
//            if (!path.exists()) {
//                path.createNewFile();
//            }
//            FileReader fr = new FileReader(path);
//            BufferedReader br = new BufferedReader(fr);
            Properties pro = new Properties();
            File file = new File("Privet/config.properties");
            InputStream in = new FileInputStream(file);
            pro.load(in);
            pro.setProperty(name, values);
            pro.store(new FileOutputStream(file), null);
            in.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
