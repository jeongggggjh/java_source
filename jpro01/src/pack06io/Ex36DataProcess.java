package pack06io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex36DataProcess {

	public static void main(String[] args) throws Exception {
		// 이진 데이터 처리
		
		Ex36BinaryData binaryData = new Ex36BinaryData();
		
		// 저장
		// File f = new File("c:\\work\\iotest3.dat");
		File dir = new File("c:\\work\\");
		File file = new File(dir, "iotest3.dat");
		
		FileOutputStream fo = new FileOutputStream(file);
		BufferedOutputStream bo = new BufferedOutputStream(fo, 1024);
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(binaryData);
		oo.close(); bo.close(); fo.close();
		System.out.println("저장성공");
		
		// 읽기
		File file2 = new File("c:\\work\\iotest3.dat");
		FileInputStream fis = new FileInputStream(file2);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = ois.readObject();
		Ex36BinaryData data = (Ex36BinaryData)obj;
		System.out.println(data.a);
		System.out.println(data.b);
		System.out.println(data.ss1);
		System.out.println(data.ss2);
		fis.close(); bis.close(); ois.close();
		
		
	}

}
