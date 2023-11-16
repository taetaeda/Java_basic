package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("c:/MyWork/hello.txt");
			br = new BufferedReader(fr);
			
			//BufferedReader에는 readLine() 메서드가 있고
            //한 줄을 통째로 읽어서 String으로 리턴합니다.
            //더 이상 읽어들일 데이터가 없다면 null을 리턴.
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);  //ex1
			}
			
//			System.out.println(br.readLine()); //ex2
//			System.out.println(br.readLine());
			// readLine (String) 한 줄씩 읽어와라
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
