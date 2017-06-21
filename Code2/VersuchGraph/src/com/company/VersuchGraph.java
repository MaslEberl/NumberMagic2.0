package com.company;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.stage.Stage;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class VersuchGraph extends Application {
    @Override public void start(Stage stage) {
        //line chart
        stage.setTitle("Persönliche Bestleistung");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Tag");
        final LineChart<String,Number> lineChart =
                new LineChart<String,Number>(xAxis,yAxis);

        lineChart.setTitle("Persönliche Bestleistung");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Bestleistung ");

        series1.getData().add(new XYChart.Data("1. Jan", 50));
        series1.getData().add(new XYChart.Data("2. Jan", 10));
        series1.getData().add(new XYChart.Data("3. Jan", 25));
        series1.getData().add(new XYChart.Data("4. Jan", 3));
        series1.getData().add(new XYChart.Data("5. Jan", 40));
        series1.getData().add(new XYChart.Data("6. Jan", 15));
        series1.getData().add(new XYChart.Data("7. Jan", 24));
        series1.getData().add(new XYChart.Data("8. Jan", 16));
        series1.getData().add(new XYChart.Data("9. Jan", 24));
        series1.getData().add(new XYChart.Data("10. Jan", 9));
        series1.getData().add(new XYChart.Data("11. Jan", 50));
        series1.getData().add(new XYChart.Data("12. Jan", 20));
        series1.getData().add(new XYChart.Data("13. Jan", 12));
        series1.getData().add(new XYChart.Data("14. Jan", 35));
        series1.getData().add(new XYChart.Data("15. Jan", 60));
        series1.getData().add(new XYChart.Data("16. Jan", 18));
        series1.getData().add(new XYChart.Data("17. Jan", 10));
        series1.getData().add(new XYChart.Data("18. Jan", 54));
        series1.getData().add(new XYChart.Data("19. Jan", 45));
        series1.getData().add(new XYChart.Data("20. Jan", 20));
        series1.getData().add(new XYChart.Data("21. Jan", 20));
        series1.getData().add(new XYChart.Data("22. Jan", 2));
        series1.getData().add(new XYChart.Data("23. Jan", 24));
        series1.getData().add(new XYChart.Data("24. Jan", 34));
        series1.getData().add(new XYChart.Data("25. Jan", 36));
        series1.getData().add(new XYChart.Data("26. Jan", 22));
        series1.getData().add(new XYChart.Data("27. Jan", 45));
        series1.getData().add(new XYChart.Data("28. Jan", 43));
        series1.getData().add(new XYChart.Data("29. Jan", 17));
        series1.getData().add(new XYChart.Data("30. Jan", 29));
        series1.getData().add(new XYChart.Data("31. Jan", 25));

        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().addAll(series1);

        stage.setScene(scene);
        stage.show();

        //http://docs.oracle.com/javafx/2/charts/bar-chart.htm --> Quelle
    }

    public static void main(String[] args) {
           launch(args);
    }
}