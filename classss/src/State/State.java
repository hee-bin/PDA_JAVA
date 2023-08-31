 package State;

public interface State {
	// 시간 설정
	
	// 금고 사용
	public abstract void doUse(Context context);
	
	// 비상벨
	public abstract void doAlarm(Context context);
	
	// 일반 통화
	public abstract void doPhone(Context context);

}
