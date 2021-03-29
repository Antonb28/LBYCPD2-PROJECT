package org.openjfx;

import javafx.event.ActionEvent;

import java.io.IOException;

public class LogIn {

    public void Register() throws IOException {
        App.setRoot("RegisterScreen");
    }

    public void Login(ActionEvent actionEvent) throws IOException {
        App.setRoot("DoctorsMenu");
    }
}
