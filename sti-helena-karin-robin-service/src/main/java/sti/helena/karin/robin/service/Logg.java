package sti.helena.karin.robin.service;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logg {

    public Logger logger;
    FileHandler fh;

    public Logg(String fileName) throws SecurityException, IOException {

        File file = new File(fileName);

        if(!file.exists()){
            file.createNewFile();
        }
        fh = new FileHandler(fileName, true);

        logger = Logger.getLogger("test");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }

}
