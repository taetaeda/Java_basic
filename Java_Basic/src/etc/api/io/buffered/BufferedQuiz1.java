package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		String today = ldt.format(dtf);

		File file = new File("C:/MyWork/" + today + "file");

		if(!file.exists()) {
			file.mkdir();
			System.out.println("폴더가 생성되었습니다.");
		}else {
			System.out.println("폴더가 이미 존재함!");
		}

		BufferedWriter bw = null;
		String str = null;
		String text = "";

		System.out.println("파일명을 입력하세요: ");
		str = sc.nextLine();

		try {
			bw = new BufferedWriter(new FileWriter("C:/MyWork/" + today + "file/" + str + ".txt"));

			System.out.println("'그만'을 입력하시면 종료됩니다.");
			while(true) {
				System.out.println("하실 말씀: ");
				String str2 = sc.nextLine();

				if(str2.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}

				text += (str2 + "/r/n"); 
			}

			bw.write(text);
			System.out.println("파일 작성 완료!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//////////////// 파일 읽기 /////////////////

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("C:/MyWork/" + today + "file/" + str + ".txt");
			br = new BufferedReader(fr);

			String read;

			while((read = br.readLine())!= null){
				System.out.println(read);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close(); fr.close(); sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}





	}

}
