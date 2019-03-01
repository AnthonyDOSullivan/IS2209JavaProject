/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSourceCode;

import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
        






/**
 *
 * @author 117410434
 */
public class ProjectSourceCode extends Application {
    
    
    //While creating in this class, press alt+enter over errors to auto-import
     @Override
             public void start(Stage primaryStage){
                 
            
    String username, password;
    
    username = "Anthony";
    password = "Pints";
    
            
    
        
        //GridPane is another layout pane. Last Friday we covered the 'Stackpane'
        GridPane grid = new GridPane(); //Creates GridPane
        grid.setAlignment(Pos.CENTER); //Centres everything in gridpane
        grid.setHgap(10); //Horizontal Gap
        grid.setVgap(10); //Vertical gap
        
        Text txtTitle = new Text("PriceyPints"); //Text that can't be edited 
        txtTitle.setFont(Font.font("Serif", FontWeight.NORMAL,20)); //Customise font
        
        
        //add text to gridpane 
        grid.add(txtTitle, 0, 0, 2, 1); //First 2 digits column + row, Second 2 Col span + row Span
        
        Label lblUsername = new Label("User name:");
        grid.add(lblUsername, 0, 1); //Add label to gridpane
        
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1); // Adds Text field to gridpane
        
            Label lblPassword = new Label("Password:");
        grid.add(lblPassword, 0, 2); //Add label to gridpane
        
             TextField passwordField = new TextField();
        grid.add(passwordField, 1, 2); // Adds Text field to gridpane
        
        final Text actionText = new Text(); // Adds new text object
                grid.add(actionText, 1, 6); //Adds text to gridpane
                
                Button btn = new Button("Sign In"); //creates Button
                grid.add(btn, 1, 4); //Adds button to gridpane
                
                
                //Set up event handler 
                
                btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e){
                    
                   
                    if(userTextField.getText().equals(username) && passwordField.getText().equals(password)) {
                        actionText.setText("Successful");
                        
                    }
                    else {
                        actionText.setText("Incorrect");
                    }
                }
                            
                            
                          
                            
                        
                        });
                Scene scene = new Scene(grid, 500, 475); // Creates scene and add parse + dimensions
                
                primaryStage.setTitle("PriceyPints");
                 primaryStage.setScene(scene); //Addds scene to stage 
                 primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

