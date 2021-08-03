import java.io.IOException;

import org.testng.annotations.Test;

public class KillProcess {
	
	@Test
	public void killChromeDriverProcess() throws IOException {
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		System.out.println("chromedriver exec process is killed");
	}

}
