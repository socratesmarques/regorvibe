module com.regorapp.regorvibe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.regorapp.regorvibe to javafx.fxml;
    exports com.regorapp.regorvibe;
}