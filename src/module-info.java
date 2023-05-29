module workshopJavafxJdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;
	requires java.sql;

	exports gui;
	exports model.services;
	exports model.entities;
	opens gui;
	opens model.entities to javafx.base;

	
	opens application to javafx.graphics, javafx.fxml;
}



