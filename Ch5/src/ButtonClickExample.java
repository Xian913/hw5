import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickExample {
    public static void main(String[] args) {
        // 创建一个简单的窗口
        Frame frame = new Frame("Button Click Example");
        Button button = new Button("Click me");

        // 创建一个 ActionListener 处理按钮点击事件
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        };

        // 将 ActionListener 注册到按钮
        button.addActionListener(actionListener);

        // 将按钮添加到窗口
        frame.add(button, BorderLayout.CENTER);

        // 设置窗口属性
        frame.setSize(300, 200);
        frame.setVisible(true);

        // 匿名类的写法可以使用 lambda 表达式简化
        // button.addActionListener(e -> System.out.println("Button clicked!"));
    }
}