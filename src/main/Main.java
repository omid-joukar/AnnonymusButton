package main;

import model.Button;
import model.Plattform;

/**
 * Created by KPS on 7/18/2020.
 */
public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        Plattform plattform = new Plattform(button);
        plattform.getButton().click();
    }
}
