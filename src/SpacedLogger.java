
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append(log);
		for(int i = 0; i < sb.length(); i++) {
			if (i % 2 == 0) {
				sb.insert(i, " ");
			}
		}
		System.out.println(sb.toString());		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append(error);
		for(int i = 0; i < sb.length(); i++) {
			if (i % 2 == 0) {
				sb.insert(i, " ");
			}
		}
		System.out.println("ERROR: " + sb.toString());		
	}
		
	}


