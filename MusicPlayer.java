/*
 * File: MusicPlayer.java
 * Author: Andrew Doss adoss2@uab.edu
 * Assignment: Group Project
 * Vers: 1.0.0 4/18/2019 add - initial coding  
 */
package uab.tedwa98.ee333;
import javafx.scene.media.*;
import java.io.File;

/**
 *
 * @author Andrew Doss
 */
public class MusicPlayer {
    
    private String musicFilename = "loopable_music.wav";
    private String shootFilename = "Laser_Shoot2.wav";
    private String explosionFilename = "Explosion.wav";
    private AudioClip music; 
    private AudioClip shoot;
    private AudioClip explosion;
    private boolean isPlaying;
    
    public MusicPlayer(){
        this.music = new AudioClip(new File(musicFilename).toURI().toString());
        this.explosion = new AudioClip(new File(explosionFilename).toURI().toString());
        this.shoot = new AudioClip(new File(shootFilename).toURI().toString());
        this.isPlaying = true;
        music.setCycleCount(AudioClip.INDEFINITE);
        playMusic();
    }
    
    private void playMusic(){
        music.play(0.5);
        this.isPlaying = true;
    }
    
    private void stopMusic(){
        music.stop();
        this.isPlaying = false;
    }
    
    /**
     * Toggles music on or off
     */
    public void toggle(){
        if(isPlaying == false){
            playMusic();
        } else{
            stopMusic();
        }
    }
    
    /**
     * Plays shoot sound
     */
    public void playShoot(){
        shoot.stop();
        shoot.play();
    }
    
    /**
     * Plays explosion sound
     */
    public void playExplosion(){
        explosion.stop();
        explosion.play();
    }
}
