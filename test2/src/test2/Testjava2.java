package test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Testjava2 {
	public Testjava2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s=System.getProperty("user.dir");
		String ssb=s+"/numjisuan.txt";
		System.out.println(ssb);
		File file=new File(ssb);
		FileOutputStream out=new FileOutputStream(file);
		Integer i0=1023;
		//求数据长度
//		int in1=i0.toString().length();
//		for(;in1>0;in1--){
//			int in2=i0/in1;
//		}
		
		
		
		System.out.println(++i0);
		int i1=99,i2=8;
		byte b1=(byte)i1;byte b2=(byte)i2;
		byte[] b =new byte[]{b1,b2};
		out.write(998);
		FileInputStream is = new FileInputStream(file);
		byte[] data=new byte[10];
		int len;
		while((len=is.read(data))>0){
			System.out.println(data[1]+data[0]*10);
			String ss=new String(data,0,len);		
			System.out.println(ss);
		}
		out.close();
		is.close();
	}

}
