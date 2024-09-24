module es.ieslosmontecillos.fourbuttonsexercice {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.fourbuttonsexercice to javafx.fxml;
    exports es.ieslosmontecillos.fourbuttonsexercice;
}