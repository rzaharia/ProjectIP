/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exportdialog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author andrew
 */
public class ExportDialog extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("View.fxml"));
        Parent root = fxmlLoader.load(); 
        Controller controller=fxmlLoader.getController();
        Scene scene = new Scene(root);
        String title="Export";
        stage.setTitle(title);
        stage.setResizable(false);
        stage.setScene(scene);
        controller.setLabel("");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
