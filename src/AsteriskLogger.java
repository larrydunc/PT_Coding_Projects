
public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		error = "***" + "Error: " + error + "***";
		String line = "";
		for (int i = 0; i < error.length(); i++) {
			line = line += "*";
		}
		System.out.println(line);
		System.out.println(error);
		System.out.println(line);
		
	}

}
