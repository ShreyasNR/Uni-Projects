package playingcards;

import java.util.Random;
import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Cards extends Application {

    @Override
    public void start(Stage primeStage) {
        Random randObj = new Random();
        int numb1, numb2, numb3, numb4, numb5;
        //generating five random numbers to select images randomly
        numb1 = randObj.nextInt(52) + 1;
        numb2 = randObj.nextInt(52) + 1;
        numb3 = randObj.nextInt(52) + 1;
        numb4 = randObj.nextInt(54) + 1;
        numb5 = randObj.nextInt(54) + 1;
        Image img1, img2, img3, img4, img5;
        //getting the path gor images selected randomly
        String path1 = "/cards/" + numb1 + ".png";
        String path2 = "/cards/" + numb2 + ".png";
        String path3 = "/cards/" + numb3 + ".png";
        String path4 = "/cards/" + numb4 + ".png";
        String path5 = "/cards/" + numb5 + ".png";
        //using hbox and vnox laypouts
        HBox horizontal = new HBox();
        VBox vertical = new VBox();
        /* creating imageview  cards for first row*/
        //first image view
        img1 = new Image(getClass().getResourceAsStream(path1), 150, 200, false, false);
        ImageView imv1 = new ImageView(img1);
        //secods image view
        img2 = new Image(getClass().getResourceAsStream(path2), 150, 200, false, false);
        ImageView imv2 = new ImageView(img2);
        //third imageview
        img3 = new Image(getClass().getResourceAsStream(path3), 150, 200, false, false);
        ImageView imv3 = new ImageView(img3);
        //imageview for secord row and third to palce verticaly
        img4 = new Image(getClass().getResourceAsStream(path4), 150, 200, false, false);
        ImageView imv4 = new ImageView(img4);
        //set teh rotation for imageview
        imv4.setRotate(45);
        img5 = new Image(getClass().getResourceAsStream(path4), 150, 200, false, false);
        ImageView imv5 = new ImageView(img5);
        //set teh rotation for imageview
        imv5.setRotate(90);
        //adding image view to horizontal 
        horizontal.getChildren().add(imv1);
        horizontal.getChildren().add(imv2);
        horizontal.getChildren().add(imv3);
        //adding image view to vertival  
        vertical.getChildren().add(imv4);
        vertical.getChildren().add(imv5);

        BorderPane root = new BorderPane();
        vertical.setPadding(new javafx.geometry.Insets(22));
        //adding row in teh top of border pane
        root.setTop(horizontal);
        //adding next row in the  bottom of border pane
        root.setCenter(vertical);
        Scene scene = new Scene(root, 700, 680);
        //setting teh background color for scene
        scene.setFill(Color.GREEN);
        primeStage.setTitle("Play Cards");

        primeStage.setScene(scene);
        primeStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
