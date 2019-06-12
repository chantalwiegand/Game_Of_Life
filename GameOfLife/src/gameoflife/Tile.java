/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import javafx.scene.paint.Color;

/**
 *
 * @author chantalwiegand
 */
public class Tile {
    public int width = 1;
    public int height = 1;
    public Color color;
    public double position;

    public Tile(double position) {
        this.position = position;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public Color getColor() {
        return color;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    } 
}
