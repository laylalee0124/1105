package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		try {
			// Scene builder 에서 작성한 파일을 로딩/출력해주는 구간
			// BorderPane root = new BorderPane();
			FXMLLoader loader=new FXMLLoader(getClass().getResource("root.fxml")); //Fxml파일을 읽어들임
			Parent root=loader.load();		// parent class로 load()실행.
			Scene scene = new Scene(root); //여기서 지정해주는 400,400 사이즈는 삭제.
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
