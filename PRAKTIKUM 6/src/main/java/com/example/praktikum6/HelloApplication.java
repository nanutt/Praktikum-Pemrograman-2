package com.example.praktikum6;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class HelloApplication extends Application {
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tableView = new TableView<>();
        TableColumn<Mahasiswa, String> column1 = new TableColumn<>("NIM");
        column1.setCellValueFactory(new PropertyValueFactory<>("Nim"));
        TableColumn<Mahasiswa, String> column2 = new TableColumn<>("Nama");
        column2.setCellValueFactory(new PropertyValueFactory<>("Nama"));
        tableView.getColumns().addAll(column1, column2);
        tableView.getItems().addAll(
            new Mahasiswa(1, "123", "John"),
            new Mahasiswa(2, "456", "Jane"),
            new Mahasiswa(3, "124123", "Jono"),
            new Mahasiswa(4, "1241234", "Agus"),
            new Mahasiswa(5, "23001", "Alya"),
            new Mahasiswa(6, "23002", "Amal"),
            new Mahasiswa(7, "23004", "April"),
            new Mahasiswa(8, "23006", "Aqil"),
            new Mahasiswa(9, "23007", "Dahlia"),
            new Mahasiswa(10, "23008", "Dhea"));
        VBox vbox = new VBox(tableView);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static class Mahasiswa {
        private int id;
        private String Nim;
        private String Nama;
    public Mahasiswa() {
    }
    public Mahasiswa(int id, String Nim, String Nama) {
        this.id = id;
        this.Nim = Nim;
        this.Nama = Nama;
    }
    public String getNim() {
        return Nim;
    }
    public void setNim(String Nim) {
        this.Nim = Nim;
    }
    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
}
    public static void main(String[] args) {
        launch();
    }
}