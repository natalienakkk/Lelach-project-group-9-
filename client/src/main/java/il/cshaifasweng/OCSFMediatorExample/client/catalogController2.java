package il.cshaifasweng.OCSFMediatorExample.client;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import il.cshaifasweng.OCSFMediatorExample.entities.Catalog;
import il.cshaifasweng.OCSFMediatorExample.entities.Item;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class catalogController2 {


    private static List<Catalog> cataloglist;


    public static List<Catalog> getCataloglist1() {
        return cataloglist;
    }

    public static void setCataloglist1(List<Catalog> cataloglist) {
        catalogController2.cataloglist = cataloglist;
        //cataloglist.get(1)
    }
    void changetext(){

    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text Header;

    @FXML
    private Button buttun_1;

    @FXML
    private Button buttun_2;

    @FXML
    private Button buttun_3;

    @FXML
    private Button buttun_4;

    @FXML
    private Button buttun_5;

    @FXML
    private ImageView image_1;

    @FXML
    private ImageView image_2;

    @FXML
    private ImageView image_3;

    @FXML
    private ImageView image_4;

    @FXML
    private ImageView image_5;

    @FXML
    private AnchorPane Pane2;


    @FXML
    void bridal_buttun(ActionEvent event) throws IOException {
        SimpleClient.getClient().sendToServer("#1openbridal3");
        AnchorPane pane = FXMLLoader.load(getClass().getResource("manager.fxml"));
        Pane2.getChildren().setAll(pane);
    }

    @FXML
    void delphunium_buttun(ActionEvent event) throws IOException {
        SimpleClient.getClient().sendToServer("#1opendelphunim3");
        AnchorPane pane = FXMLLoader.load(getClass().getResource("manager.fxml"));
        Pane2.getChildren().setAll(pane);
    }

    @FXML
    void sensivaria_buttun(ActionEvent event) throws IOException {
        SimpleClient.getClient().sendToServer("#1opensensivaria3");
        AnchorPane pane = FXMLLoader.load(getClass().getResource("manager.fxml"));
        Pane2.getChildren().setAll(pane);
    }

    @FXML
    void spray_buttun(ActionEvent event) throws IOException {
        SimpleClient.getClient().sendToServer("#1openspray3");
        System.out.format("sending to server : openspray6666 \n");
        AnchorPane pane = FXMLLoader.load(getClass().getResource("manager.fxml"));
        Pane2.getChildren().setAll(pane);
    }

    @FXML
    void zamia_buttun(ActionEvent event) throws IOException {
        SimpleClient.getClient().sendToServer("#1openzamia3");
        AnchorPane pane = FXMLLoader.load(getClass().getResource("manager.fxml"));
        Pane2.getChildren().setAll(pane);
    }

    @FXML
    void initialize() {

        assert Header != null : "fx:id=\"Header\" was not injected: check your FXML file 'catalog.fxml'.";
        assert Pane2 != null : "fx:id=\"Pane2\" was not injected: check your FXML file 'catalog.fxml'.";
        assert buttun_1 != null : "fx:id=\"buttun_1\" was not injected: check your FXML file 'catalog.fxml'.";
        assert buttun_2 != null : "fx:id=\"buttun_2\" was not injected: check your FXML file 'catalog.fxml'.";
        assert buttun_3 != null : "fx:id=\"buttun_3\" was not injected: check your FXML file 'catalog.fxml'.";
        assert buttun_4 != null : "fx:id=\"buttun_4\" was not injected: check your FXML file 'catalog.fxml'.";
        assert buttun_5 != null : "fx:id=\"buttun_5\" was not injected: check your FXML file 'catalog.fxml'.";
        assert image_1 != null : "fx:id=\"image_1\" was not injected: check your FXML file 'catalog.fxml'.";
        assert image_2 != null : "fx:id=\"image_2\" was not injected: check your FXML file 'catalog.fxml'.";
        assert image_3 != null : "fx:id=\"image_3\" was not injected: check your FXML file 'catalog.fxml'.";
        assert image_4 != null : "fx:id=\"image_4\" was not injected: check your FXML file 'catalog.fxml'.";
        assert image_5 != null : "fx:id=\"image_5\" was not injected: check your FXML file 'catalog.fxml'.";

    }

}


