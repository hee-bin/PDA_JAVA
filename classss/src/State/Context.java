package State;

public interface Context {
	// 시간 설정
	public abstract void setClock(int hour);
	
	// 상태 전환
	public abstract void changeState(State state);
	
	// 경비 센터 경비원 호출
	public abstract void callSecurity(String msg);
	
	// 경비 센터 기록
	public abstract void recordLog(String msg);
}
