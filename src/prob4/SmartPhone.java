package prob4;

public class SmartPhone extends MusicPhone {
		
	@Override
	public void execute(String function) {
		if (function.equals("음악")) {
			downMusic();
		} else if (function.equals("앱")) {
			AppStart();
		} else {
			super.execute(function);
		}
	}

	private void downMusic() {
		System.out.print("다운로드해서 음악 재생");
	}

	private void AppStart() {
		System.out.println("앱실행");
	}
}
