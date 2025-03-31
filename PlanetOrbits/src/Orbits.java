
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Orbits extends Application {
    @Override
    public void start(Stage stage) {

        Pane pane = new Pane();
        pane.setStyle("-fx-background-color: black;");

        //create the sun
        Circle sun3 = new Circle(400, 300, 35, Color.YELLOW);
        sun3.setStroke(Color.RED);
        pane.getChildren().add(sun3);
        
        Circle sun2 = new Circle(400, 300, 35, Color.DARKRED);
        pane.getChildren().add(sun2);

        Circle sun1 = new Circle(400, 300, 35, Color.ORANGE);
        pane.getChildren().add(sun1);
        

        FadeTransition sunft = new FadeTransition(Duration.millis(3000), sun1);
        sunft.setFromValue(1.0);
        sunft.setToValue(0.1);
        sunft.setCycleCount(50);
        sunft.setAutoReverse(true);
        sunft.play();

        FadeTransition sunft2 = new FadeTransition(Duration.millis(2000), sun2);
        sunft.setFromValue(1.0);
        sunft.setToValue(0.1);
        sunft.setCycleCount(50);
        sunft.setAutoReverse(true);
        sunft.play();

        //create neptune 4
        Circle neptune = new Circle(500, 500, 9);
        neptune.setFill(Color.LIGHTCORAL);
        neptune.setStroke(Color.LIGHTCORAL);
        pane.getChildren().add(neptune);
        //create ellipse for neptune
        Ellipse ellipse1 = new Ellipse(400, 300, 255, 215);
        ellipse1.setFill(Color.TRANSPARENT);
        ellipse1.setStroke(Color.LIGHTCORAL);
        pane.getChildren().add(ellipse1);

        PathTransition neptunept = new PathTransition();
        neptunept.setDuration(Duration.millis(8000));
        neptunept.setPath(ellipse1);
        neptunept.setNode(neptune);
        neptunept.setCycleCount(PathTransition.INDEFINITE);
        neptunept.setAutoReverse(false);
        neptunept.play();

        Circle uranus = new Circle(600,500,11);
        uranus.setFill(Color.PURPLE);
        uranus.setStroke(Color.PURPLE);
        pane.getChildren().add(uranus);

        //create ellipse for uranus 3
        Ellipse ellipse2 = new Ellipse(400, 300, 230, 190);
        ellipse2.setFill(Color.TRANSPARENT);
        ellipse2.setStroke(Color.PURPLE);
        pane.getChildren().add(ellipse2);

        PathTransition uranuspt = new PathTransition();
        uranuspt.setDuration(Duration.millis(7000));
        uranuspt.setPath(ellipse2);
        uranuspt.setNode(uranus);
        uranuspt.setCycleCount(PathTransition.INDEFINITE);
        uranuspt.setAutoReverse(false);
        uranuspt.play();

        //Saturn 2

        Circle saturn = new Circle(600,200,13);
        saturn.setFill(Color.BLUE);
        saturn.setStroke(Color.BLUE);
        pane.getChildren().add(saturn);

        Ellipse ellipse3 = new Ellipse(400, 300, 205, 165);
        ellipse3.setFill(Color.TRANSPARENT);
        ellipse3.setStroke(Color.BLUE);
        pane.getChildren().add(ellipse3);

        PathTransition saturnpt = new PathTransition();
        saturnpt.setDuration(Duration.millis(6000));
        saturnpt.setPath(ellipse3);
        saturnpt.setNode(saturn);
        saturnpt.setCycleCount(PathTransition.INDEFINITE);
        saturnpt.setAutoReverse(false);
        saturnpt.play();

        //jupiter 1
        Circle jupiter = new Circle(600, 500, 15);
        jupiter.setFill(Color.AQUA);
        jupiter.setStroke(Color.AQUA);
        pane.getChildren().add(jupiter);

        Ellipse ellipse4 = new Ellipse(400, 300, 175, 145);
        ellipse4.setFill(Color.TRANSPARENT);
        ellipse4.setStroke(Color.AQUA);
        pane.getChildren().add(ellipse4);

        PathTransition jupiterpt = new PathTransition();
        jupiterpt.setDuration(Duration.millis(5000));
        jupiterpt.setPath(ellipse4);
        jupiterpt.setNode(jupiter);
        jupiterpt.setCycleCount(PathTransition.INDEFINITE);
        jupiterpt.setAutoReverse(false);
        jupiterpt.play();

        //mars 7
        Circle mars = new Circle(600,500,5);
        mars.setFill(Color.GREEN);
        mars.setStroke(Color.GREEN);
        pane.getChildren().add(mars);

        Ellipse ellipse5 = new Ellipse(400, 300, 145, 115);
        ellipse5.setFill(Color.TRANSPARENT);
        ellipse5.setStroke(Color.GREEN);
        pane.getChildren().add(ellipse5);

        PathTransition marspt = new PathTransition();
        marspt.setDuration(Duration.millis(4000));
        marspt.setPath(ellipse5);
        marspt.setNode(mars);
        marspt.setCycleCount(PathTransition.INDEFINITE);
        marspt.setAutoReverse(false);
        marspt.play();

        //Earth 5
        Circle earth = new Circle(600,500,7);
        earth.setFill(Color.YELLOW);
        earth.setStroke(Color.YELLOW);
        pane.getChildren().add(earth);

        Ellipse ellipse6 = new Ellipse(400, 300, 115, 85);
        ellipse6.setFill(Color.TRANSPARENT);
        ellipse6.setStroke(Color.YELLOW);
        pane.getChildren().add(ellipse6);

        PathTransition earthpt = new PathTransition();
        earthpt.setDuration(Duration.millis(3000));
        earthpt.setPath(ellipse6);
        earthpt.setNode(earth);
        earthpt.setCycleCount(PathTransition.INDEFINITE);
        earthpt.setAutoReverse(false);
        earthpt.play();

        //venus 6
        Circle venus = new Circle(600,500,6);
        venus.setFill(Color.ORANGE);
        venus.setStroke(Color.ORANGE);
        pane.getChildren().add(venus);
        
        Ellipse ellipse7 = new Ellipse(400, 300, 95, 65);
        ellipse7.setFill(Color.TRANSPARENT);
        ellipse7.setStroke(Color.ORANGE);
        pane.getChildren().add(ellipse7);

        PathTransition venuspt = new PathTransition();
        venuspt.setDuration(Duration.millis(2000));
        venuspt.setPath(ellipse7);
        venuspt.setNode(venus);
        venuspt.setCycleCount(PathTransition.INDEFINITE);
        venuspt.setAutoReverse(false);
        venuspt.play();

       // mercury 8
        Circle mercury = new Circle(600, 500, 3);
        mercury.setFill(Color.RED);
        mercury.setStroke(Color.RED);
        pane.getChildren().add(mercury);

       Ellipse ellipse8 = new Ellipse(400, 300, 75, 45);
        ellipse8.setFill(Color.TRANSPARENT);
        ellipse8.setStroke(Color.RED);
        pane.getChildren().add(ellipse8);

        PathTransition mercurypt = new PathTransition();
        mercurypt.setDuration(Duration.millis(1500));
        mercurypt.setPath(ellipse8);
        mercurypt.setNode(mercury);
        mercurypt.setCycleCount(PathTransition.INDEFINITE);
        mercurypt.setAutoReverse(false);
        mercurypt.play();

        stage.setTitle("Planet Orbits");

        Scene scene = new Scene(pane, 800, 700);
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}

