module workshopJavafxJdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;

	exports gui;
	opens gui;
	opens model.entities to javafx.base;

	
	opens application to javafx.graphics, javafx.fxml;
}

