package org.demo.personal;
import javax.swing.*;
public class OtherTabContent {

    private final JPanel contentPanel;

    public OtherTabContent(String content) {
        contentPanel = new JPanel();
        contentPanel.add(new JLabel(content));
    }

    public JComponent getContent() {
        return contentPanel;
    }
}
