package org.openjfx;

import javafx.event.ActionEvent;

import java.io.IOException;


public class Appointment {
    public void Back(ActionEvent actionEvent) throws IOException {
        App.setRoot("UserMenu");
    }

    public void GoToAppointments(ActionEvent actionEvent) throws IOException {
        App.setRoot("Appointments");
    }

    public void AnswerPreCheckup(ActionEvent actionEvent) throws IOException {
        App.setRoot("PreCheckup");
    }

    public void AnswerPostCheckUp(ActionEvent actionEvent) throws IOException {
        App.setRoot("PostCheckup");
    }
}
