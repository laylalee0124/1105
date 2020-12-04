package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Servercontroller implements Initializable {
	// 버튼 등록시 발생되는 event를 제어하기위한 class

	// 어노테이션으로 @FXML에 있는 button이라는 것을 명시
	@FXML private Button bttnstart;

	
	// Scene builder에 등록한 On action 이름으로 method 작성.
	public void serverstart(ActionEvent event){
		System.out.println("버튼이 눌러졌습니다.");
		
		
		
		
	}
	
	
	// Initializable interface의 method
	@Override 	
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		/*
		bttnstart.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent evnt) {
		serverStart(event);
		}*/
		
		// 상기 구문대신 아래 rambda식으로 표현하면 간단. (setOnAction내의 method가 한개이기때문에)
		// 하기 구문이 버튼과 event를 연결해줌.
		// buttonstart에 대한 이벤트를 대기하고있다가 on action되면 event에 알려주고 serverstart 를 실행해준다.
		bttnstart.setOnAction(event -> serverstart(event));
		}; 
	}
	
	

