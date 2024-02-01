module com.example.todolist {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.todolist to javafx.fxml;
    exports com.example.todolist;
}