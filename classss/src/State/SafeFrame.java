package State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// SafeFrame 클래스는 Frame을 상속하고, ActionListener와 Context 인터페이스를 구현합니다.
public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60); // 현재 시간 표시를 위한 텍스트 필드
    private TextArea textScreen = new TextArea(10, 60); // 경비 센터 출력을 위한 텍스트 에어리어
    private Button buttonUse = new Button("Use the Safe"); // 금고 사용 버튼
    private Button buttonAlarm = new Button("Emergency Alarm"); // 비상벨 버튼
    private Button buttonPhone = new Button("Call"); // 일반 통화 버튼
    private Button buttonExit = new Button("Exit"); // 종료 버튼
    private StateEnum currentState = StateEnum.DAY_STATE; // 현재 상태를 나타내는 열거형 변수

    // 생성자: SafeFrame의 GUI 요소들을 초기화하고 배치합니다.
    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    // 버튼이 눌렸을 때 호출되는 메서드
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonUse) {
        	currentState.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
        	currentState.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
        	currentState.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("???");
        }
    }

    // 시간 설정 메서드
    @Override
    public void setClock(int hour) {
    	 String clockString = String.format("Current time is %02d:00", hour);
    	 System.out.println(clockString);
    	 textClock.setText(clockString);
    	 // StateTransitionMap을 사용하여 상태 결정
    	 StateTransitionMap transitionMap = new StateTransitionMap();
    	 StateEnum newState = transitionMap.getStateForHour(hour);
    	 if (newState != currentState && newState != null) {
    	     changeState(newState);
    		 currentState = newState;
    	    }
    }

    // 상태 전환 메서드
    @Override
    public void changeState(StateEnum stateEnum) {
        // 상태 전환 메서드에서 현재 상태를 변경합니다.
        System.out.println("Change state from " + this.currentState + " to " + stateEnum);
        this.currentState = stateEnum;
    }

    // 경비 센터 호출 메서드
    @Override
    public void callSecurityCenter(String msg) {
        // 경비 센터 호출 시 텍스트 출력
        textScreen.append("call! " + msg + "\n");
    }

    // 경비 센터 기록 메서드
    @Override
    public void recordLog(String msg) {
        // 경비 센터 기록 시 텍스트 출력
        textScreen.append("record ... " + msg + "\n");
    }

}
