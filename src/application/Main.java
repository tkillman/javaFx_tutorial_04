package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


///// 이벤트 처리를 배우자!!!!!!!!!!!
public class Main extends Application {
	
	int i=0;
	
	@Override
	public void start(Stage stage) {
		try {
			//node
			Label label = new Label();
			label.setText("Test");
			label.setStyle("-fx-font-size:70;");
			
			
			Label countNum = new Label();
			countNum.setText(Integer.toString(i));
			countNum.setStyle("-fx-font-size:70;");
			
			Button btn = new Button();
			btn.setText("Number");
			btn.setStyle("-fx-text-fill:red;-fx-font-size:70;");
			
			
			//람다식을 사용한 이벤트  처리
			btn.setOnAction( e->{
				i++;
				countNum.setText(Integer.toString(i));
			});
			
			
			
			//container
			StackPane pane = new StackPane();
			pane.getChildren().add(label);
			pane.getChildren().add(btn);
			pane.getChildren().add(countNum);
			/*pane.getChildren().addAll(label,btn);*/
			StackPane.setAlignment(label, Pos.TOP_CENTER);
			StackPane.setAlignment(countNum, Pos.CENTER);
			StackPane.setAlignment(btn, Pos.BOTTOM_CENTER);
			
			//scene
			Scene scene = new Scene(pane,800,500);
			
			
			//stage
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
