/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author chantalwiegand
 */
public class Pane extends GridPane {
    private Button btnAdd, btnRun, btnStop;
    private Field field;
    public Tile tile;
    public TextField txtInvoer;
    ArrayList<Tile> tileList;
    
    public Pane(GridPane root) {
        
        for(int i = 0; i <= 30; i ++){
            for(int j = 0; j <= 30; j ++){
                Label label2 = new Label("     ");
                label2.setStyle("-fx-border-color: black; -fx-font-size: 10;");
                root.add(label2, i, j);
            }
        }

        btnAdd = new Button("Add");
        btnRun = new Button("Run");
        btnStop = new Button("Stop");
        txtInvoer = new TextField();
        
        btnAdd.setOnAction(event -> {
            String invoer = txtInvoer.getText();
            
            double invoerPosition = Double.parseDouble(invoer);
            
            tile.setPosition(invoerPosition);
            
            tileList.add(tile);
        });
        
//        root.add(txtInvoer, 32, 32);
//        root.add(btnAdd, 31, 31);
//        root.add(btnRun, 2,31);
//        root.add(btnStop, 3, 31);
        
    }  
}
