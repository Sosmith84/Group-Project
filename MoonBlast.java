/*
 * File: MoonBlast.java
 * Author: Shawn Smith ssmith84@uab.edu
 * Assignment:  MoonBlast - EE333 Spring 2019
 * Vers: 1.0.0 03/25/2019 SOS - initial coding
 *
 * Credits:  (if any for sections of code)
 */

package MoonBlast;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author Shawn Smith ssmith84@uab.edu
 */
public class MoonBlast extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Shoot!");
        
        String musicFile = "Laser_Shoot2.wav";
        
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        
        
        Button button2 = new Button("Shoot");
                                
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mediaPlayer.play();
            }
        });

        
        StackPane winder = new StackPane();
        winder.getChildren().add(button2);
        primaryStage.setScene(new Scene(winder, 100, 100));
        primaryStage.show();
    }
}
