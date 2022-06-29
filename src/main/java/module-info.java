module fr.cs.projet1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.cs.projet1 to javafx.fxml;
    exports fr.cs.projet1;
}