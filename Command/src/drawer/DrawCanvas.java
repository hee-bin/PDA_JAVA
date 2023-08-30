package drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import command.MacroCommand;

// DrawCanvas 클래스 선언 및 Drawable 인터페이스 구현
public class DrawCanvas extends Canvas implements Drawable {

    // 그리는 색
    private Color color = Color.blue;

    // 그리는 점의 반지름
    private int radius = 6;

    // 이력을 저장하는 MacroCommand 객체
    private MacroCommand history;

    // 생성자
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.lightGray);
        this.history = history;
    }

    // 이력 전체를 다시 그리는 메서드
    public void paint(Graphics g) {
        // 이력을 실행하여 그림을 그림
        history.execute();
    }

    // 그리기 메서드 구현
    @Override
    public void draw(int x, int y) {
        // 그래픽 컨텍스트를 얻어와서 원을 그림
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}