package org.openjfx;

import javafx.event.ActionEvent;

import java.io.IOException;

public class LogIn {

    public void Register() throws IOException {
        App.setRoot("RegisterScreen");
    }

    public void DoctorLogin(ActionEvent actionEvent) throws IOException {
        App.setRoot("DoctorsMenu");
    }

    public void AdminLogin(ActionEvent actionEvent) throws IOException {
        App.setRoot("Admin");
    }

    public void UserLogin(ActionEvent actionEvent) throws IOException {
        App.setRoot("UserMenu");
    }

    public void Back(ActionEvent actionEvent) throws IOException {
        App.setRoot("UserMenu");
    }
}
