import java.io.IOException;
import java.io.InputStream;

public class RuntimeExec {
	public static void main(String args[]) {
		Process process;
		try {
			process = Runtime.getRuntime().exec("cmd /c echo Hello");
			final InputStream in = process.getInputStream();
			int ch;
			while ((ch = in.read()) != -1) {
				System.out.print((char) ch);
			}
			process.waitFor();
			process.destroy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Command run completed.");
	}
}
