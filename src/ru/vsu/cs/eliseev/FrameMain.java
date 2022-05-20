package ru.vsu.cs.eliseev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMain extends JFrame {
    private JTable tableInput;
    private JButton solutionButton;
    private JPanel mainPanel;
    private JButton randomInput;

    public FrameMain(String title) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        JTableUtils.initJTableForArray(tableInput, 40, false, true, false, true);

        tableInput.setRowHeight(25);

        solutionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SimpleList test = new SimpleList();
                    for (int count = 0; count < tableInput.getColumnCount(); count++) {
                        test.push(Integer.parseInt((tableInput.getValueAt(0, count).toString())));
                    }
                    SwingUtils.showInfoMessageBox(test.findNumberOfMax() + "", "Количество максимумов");
                } catch (Exception exception) {
                    SwingUtils.showInfoMessageBox("Error", "Error");
                }
            }
        });
        randomInput.addActionListener(e -> {
            try {
                int[] array = ArrayUtils.createRandomIntArray(
                        tableInput.getColumnCount(), 10);
                JTableUtils.writeArrayToJTable(tableInput, array);
            } catch (Exception exception) {
                SwingUtils.showInfoMessageBox("Error", "Error");
            }
        });
    }
}
