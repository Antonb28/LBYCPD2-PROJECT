package org.openjfx;

import javafx.event.ActionEvent;

import java.io.IOException;

public class DoctorsMenu {

    public void Appointment(ActionEvent actionEvent) throws IOException {
        App.setRoot("Appointment");
    }

    public void Back(ActionEvent actionEvent) throws IOException {
        App.setRoot("UserMenu");
    }
}
