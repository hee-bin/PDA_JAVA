import command.*;
import drawer.*;
import java.awt.event.*;
import javax.swing.*;

// Main 클래스 선언
public class main extends JFrame {

    // 그리기 이력을 저장할 MacroCommand 객체
    private MacroCommand history = new MacroCommand();
    // 그리는 영역을 나타내는 DrawCanvas 객체
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // "clear" 버튼
    private JButton clearButton = new JButton("clear");
    // 추가: undo 버튼 생성
    private JButton undoButton = new JButton("Undo"); 


    
    // Main 클래스의 생성자
    public main(String title) {
        super(title);

        // 윈도우 종료 이벤트 리스너 등록
        this.addWindowListener(new WindowEventAdapter());
        // 마우스 이벤트 리스너 등록
        canvas.addMouseMotionListener(new MouseEventAdapter());

        // "clear" 버튼 클릭 이벤트 리스너 등록 및 동작 설정
        clearButton.addActionListener(e -> {
            // 그리기 이력을 지우고 화면을 다시 그립니다.
            history.clear();
            canvas.repaint();
            
        });
        
        // undo 버튼 클릭 이벤트 처리
        undoButton.addActionListener(e -> {
            history.undo();
            canvas.repaint();
        });

        // "clear" 버튼을 수평으로 정렬하는 Box 생성
        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(undoButton);

        // 컴포넌트들을 수직으로 정렬하는 Box 생성
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        // 창 크기 조절 및 표시
        pack();
        setVisible(true);
    }

    
    
    // Main 클래스의 진입점
    public static void main(String[] args) {
        // Main 객체 생성 및 창의 제목 설정
        new main("Drawing Application");
    }

    
    
    // 윈도우 이벤트를 처리하는 내부 클래스
    private class WindowEventAdapter extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            // 윈도우가 닫힐 때 애플리케이션 종료
            System.exit(0);
        }
    }

    // 마우스 이벤트를 처리하는 내부 클래스
    private class MouseEventAdapter extends MouseAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            // 마우스 드래그 이벤트 발생 시 실행됨
            // DrawCommand 생성 후 실행하고 이력에 추가
            Command cmd = new DrawCommand(canvas, e.getPoint());
            history.append(cmd);
            cmd.execute();
        }
    }
}