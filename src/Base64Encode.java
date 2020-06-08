import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Encode {
	public static void main(String[] args) {
		String copyrights = "Copyright (c) 2014 TJ Holowaychuk <tj@vision-media.ca>";
		try {
			String encodeCopyrights = Base64.getEncoder().encodeToString(copyrights.getBytes("utf-8"));
			encodeCopyrights = encodeCopyrights.replaceAll("\"", "\'");
			System.out.println(encodeCopyrights);
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}
}
