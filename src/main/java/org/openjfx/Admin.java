package org.openjfx;

import javafx.event.ActionEvent;

import java.io.IOException;

public class Admin {
    public void DisplayInfo(ActionEvent event) {
    }

    public void GoBack(ActionEvent event) throws IOException {
        App.setRoot("LogInScreen");
    }
}
