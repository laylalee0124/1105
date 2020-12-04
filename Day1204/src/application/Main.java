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
			FXMLLoader loader=new FXMLLoader(getClass().getResource("root.fxml"));

			//parent는 모든 layout의 부모클래스
			Parent root=(Parent)loader.load();
			Scene scene=new Scene(root);
			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);	// scene을 stage에 적용하기. 
			primaryStage.setTitle("로그인");  // 윈도우 창이름
			primaryStage.setResizable(false);	// 창크기 변경 불가
			primaryStage.show();			// show를 통해 출력.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

