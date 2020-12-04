package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// control을 위한 자바소스

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//fxml 로드 해주세요 (연결)
			FXMLLoader loader=new FXMLLoader(getClass().getResource("root.fxml"));
			Parent root=loader.load();
			
			
			// css 적용 구문
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("SERVER WINDOW");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
