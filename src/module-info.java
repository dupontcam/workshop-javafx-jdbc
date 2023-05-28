module workshopJavafxJdbc {
	requires javafx.controls;
	requires javafx.fxml;

	exports gui;
	opens gui;
	opens model.entities to javafx.base;

	
	opens application to javafx.graphics, javafx.fxml;
}

