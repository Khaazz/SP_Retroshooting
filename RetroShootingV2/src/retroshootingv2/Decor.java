/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retroshootingv2;

import javafx.scene.Scene;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author larossi
 */
public class Decor extends Rectangle {
    public Decor(double width, double height, String color) {
        super();
        this.setHeight(height);
        this.setWidth(width);
        this.setFill(Paint.valueOf(color));
    }
}
