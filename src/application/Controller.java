package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Controller implements Initializable {

	@FXML
	private AnchorPane pane1;

	@FXML
	private AnchorPane pane2;

	@FXML
	private AnchorPane pane3;

	@FXML
	private AnchorPane pane4;

	@FXML
	private AnchorPane pane5;

	@FXML
	private AnchorPane pane6;

	@FXML
	private AnchorPane pane7;

	boolean opcion;

	public void translateAnimation(double duration, Node node, double byX) {

		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(duration), node);
		translateTransition.setByX(byX);
		translateTransition.play();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		String path = "images/4.m4a";
		Media media = new Media(new File(path).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setAutoPlay(true);
		translateAnimation(0.5, pane2, 600);
		translateAnimation(0.5, pane3, 600);
		translateAnimation(0.5, pane4, 600);
		translateAnimation(0.5, pane5, 600);
		translateAnimation(0.5, pane6, 600);
		translateAnimation(0.5, pane7, 600);
	}

	int showSlide = 0;

	@FXML
	void nextAction(ActionEvent event) {

		if (showSlide == 0) {
			translateAnimation(0.5, pane2, -600);
			showSlide++;
		} else if (showSlide == 1) {

			translateAnimation(0.5, pane3, -600);
			showSlide++;

		} else if (showSlide == 2) {

			translateAnimation(0.5, pane4, -600);
			showSlide++;

		} else if (showSlide == 3) {

			translateAnimation(0.5, pane5, -600);
			showSlide++;

		} else if (showSlide == 4) {

			translateAnimation(0.5, pane6, -600);
			showSlide++;

		} else if (showSlide == 5) {

			translateAnimation(0.5, pane7, -600);
			showSlide++;

		} else {
			System.out.println("No more slides");
		}
	}

	@FXML
	void backAction(ActionEvent event) {

		if (showSlide == 0) {
			System.out.println("No more slide");
		} else if (showSlide == 1) {
			translateAnimation(0.5, pane2, 600);
			showSlide--;
		} else if (showSlide == 2) {
			translateAnimation(0.5, pane3, 600);
			showSlide--;
		} else if (showSlide == 3) {
			translateAnimation(0.5, pane4, 600);
			showSlide--;
		} else if (showSlide == 4) {
			translateAnimation(0.5, pane5, 600);
			showSlide--;
		} else if (showSlide == 5) {
			translateAnimation(0.5, pane6, 600);
			showSlide--;
		} else if (showSlide == 6) {
			translateAnimation(0.5, pane7, 600);
			showSlide--;
		} else {
			System.out.println("No more slides");
		}
	}

	public void cerrarProyecto() {
		System.exit(0);
	}
}
