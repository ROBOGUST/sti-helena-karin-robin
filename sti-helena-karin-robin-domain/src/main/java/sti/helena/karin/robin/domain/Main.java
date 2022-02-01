package sti.helena.karin.robin.domain;
import java.util.ArrayList;
import sti.helena.karin.robin.service.Logg;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ange personnummer för eleven");
        Scanner input = new Scanner(System.in);


        try{
            Logg mylogg = new Logg("logg.txt");
            mylogg.logger.setLevel(Level.ALL);
        } catch (IOException e) {
        }
    }
}
