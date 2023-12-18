package software.ulpgc.kata.swing;

import software.ulpgc.kata.Histogram;

public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram(5,7,6,1,8,3,4,2,1,6,7,9,8,6,9,1,5,5,5,5);
        MainFrame frame = new MainFrame();
        frame.histogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}
