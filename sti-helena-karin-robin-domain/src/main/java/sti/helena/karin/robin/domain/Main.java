package sti.helena.karin.robin.domain;

import sti.helena.karin.robin.service.Logg;

import java.io.IOException;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try{
            Logg mylogg = new Logg("logg.txt");
            mylogg.logger.setLevel(Level.ALL);
        } catch (IOException e) {
        }


    }


}
