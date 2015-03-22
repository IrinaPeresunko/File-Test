package fileTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {

		File fp= new File("FileTest2.java");
		
		if(fp.exists()) {
			System.out.println(fp.getName() + " существует");
			if(fp.isFile()) {
				System.out.println("Путь к файлу:\t"+ fp.getPath());
				System.out.println("Абсолютный путь:\t"+ fp.getAbsolutePath());
				System.out.println("Размер файла:\t"+ fp.length());
				System.out.println("Последняя модификация :\t"+ new Date(fp.lastModified()));
				System.out.println("Файл доступен для чтения:\t"+ fp.canRead());
				System.out.println("Файл доступен для записи:\t"+ fp.canWrite());
				System.out.println("Файл удален:\t"+ fp.delete());
			}
		} 
		else{
			System.out.println("файл " + fp.getName()+ " не существует");
		}
		
		try{
			if(fp.createNewFile())
			System.out.println("Файл " + fp.getName()+ " создан");
		}
		catch(IOException e) {
			System.err.println(e);
		}
		
		
		 File dir = new File("com" + File.separator + "learn");
		 
		 if (dir.exists() && dir.isDirectory()){
			 System.out.println("каталог "+ dir.getName() + " существует");
		 }
		 else{
			 System.out.println("каталог "+ dir.getName() + " не существует");
		 }
		 File[] files = dir.listFiles();
		 for(int i = 0; i < files.length; i++){
			 Date date = new Date(files[i].lastModified());
			 System.out.print("\n" + files[i].getPath() +"\n"+ files[i].length() +"\n"
			 + date.toString());
		}
		
		File root = File.listRoots()[1];
		System.out.println(root.getPath());
		System.out.println(root.getUsableSpace()+" "+root.getTotalSpace());
	}
}
