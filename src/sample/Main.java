package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;


class EmployeeTask
{
    EmployeeTask(){

    }
}


class Worksheet
{
    ArrayList<ArrayList<EmployeeTask>> tasks;


    void Initialize()
    {
        tasks.add(new ArrayList<EmployeeTask>()); // 9-10
        tasks.add(new ArrayList<EmployeeTask>()); // 10-11
        tasks.add(new ArrayList<EmployeeTask>());
        tasks.add(new ArrayList<EmployeeTask>());
        tasks.add(new ArrayList<EmployeeTask>());
        tasks.add(new ArrayList<EmployeeTask>());
        tasks.add(new ArrayList<EmployeeTask>());
        tasks.add(new ArrayList<EmployeeTask>());
        tasks.add(new ArrayList<EmployeeTask>());
        tasks.add(new ArrayList<EmployeeTask>()); // 18:00 - 19:00

    }

}

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();




    }


    public static void main(String[] args) {
        launch(args);
    }
}
