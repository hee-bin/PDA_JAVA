package drawer;

import java.awt.Point;

import command.Command;

// DrawCommand 클래스 선언 및 Command 인터페이스 구현
public class DrawCommand implements Command {
    // 그리는 대상을 나타내는 Drawable 인터페이스 객체
    protected Drawable drawable;
    
    // 그리는 위치를 나타내는 Point 객체
    private Point position;

    // 생성자
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    
    // 실행 메서드 구현
    @Override
    public void execute() {
        // Drawable 객체의 draw 메서드 호출하여 그림을 그림
        drawable.draw(position.x, position.y);
    }
}