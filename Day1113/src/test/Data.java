package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Data {
	
	// 1) data 필드 만들기 (변수 선언)
	private String name;
	private int kor;
	private	int eng;
	private	int mat;
	private	int tot;
	private	double avg;
	
	//추가내용// 입력받은 값을 저장할 장소 지정
	File file = new File("data_new.txt");
	
	
	
	// 2) constructor 만들기 (값 초기화 해주기)
	public Data(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot=kor+eng+mat;
		avg=tot/3.0;
	}

	public Data() {	} 	//default constructor


	// method
	@Override
	public String toString() {
		return "Data [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", avg=" + avg
				+ "]";
	}
	
	// method (getter/setter)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void display() {
		Scanner in = null;
		try {
			in = new Scanner(file);
			while (in.hasNext()) {
				name = in.next();
				kor = in.nextInt();
				eng = in.nextInt();
				mat = in.nextInt();
				tot = in.nextInt();
				avg = in.nextDouble();

				System.out.println("이름: "+name);
				System.out.println("국어: "+kor);
				System.out.println("영어: "+eng);
				System.out.println("수학: "+mat);
				System.out.println("총점: "+tot);
				System.out.println("평균: "+avg);
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null)
				in.close();
		}

	}

	public void displayaaa(){  // scanner를 통한 file reading 오류에 대해 다른 예제로 보여줌.
		FileReader fr=null;
		try {
			fr=new FileReader(file);
			int data;
			try {
				while((data=fr.read()) != -1) {
					System.out.print((char)data);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
				
		
		
	}
	public void inputData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("이름: ");
		name=sc.nextLine();
		System.out.println("국어: ");
		kor=sc.nextInt();
		System.out.println("영어: ");
		eng=sc.nextInt();
		System.out.println("수학: ");
		mat=sc.nextInt();
		
		//sc.close();                      // scanner도 close해줘야 한다.
		// ☆☆☆ 정말 중요!!. system.in은 static class인데, 동일한 system.in을 쓰는 method중에 하나라도 close()명령어로 종료해버리면 동일한 system.in을 쓰는 다른 method에서도 close되어버려 오류가 일어난다.
		
		tot=kor+eng+mat;
		avg=tot/3.0;
		
		///////////////////////////추가내용////////////////////////////////
		

		// FileWriter 연결
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);

			fw.write(name);
			fw.write(" " + kor);
			fw.write(" " + eng);
			fw.write(" " + mat);
			fw.write(" " + tot);
			fw.write(" " + avg + "\n"); // " "와 dt가 먼저 합쳐져서 문자열 연산이 일어나서 문자열이됨.
			// fw.write(dt.getAvg()); <- 이건 왜 안돼지?

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (fw != null) {
				System.out.println("스트림 종료");
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
	
	
	
}
