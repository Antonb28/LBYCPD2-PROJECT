package org.openjfx;

import javafx.event.ActionEvent;

import java.io.IOException;

public class MainMenu {
    public void LogOut(ActionEvent actionEvent) throws IOException {
        App.setRoot("LogInScreen");
    }

    public void Schedule(ActionEvent actionEvent) throws IOException {
        App.setRoot("ScheduleAppointment");
    }
}
