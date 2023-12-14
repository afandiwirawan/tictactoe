/**
 * ES234317-Algorithm and Data Structures
 * Semester Ganjil, 2023/2024
 * Group Capstone Project
 * Group #10
 * 1 - 5026221009 - Indriyani Alif Safitri
 * 2 - 5026221116 - Athaalla Rayya Genaro Iswandoko
 * 3 - 5026221127 - Mochammad Afandi Wirawan
 * 4 - 5026221197 - Hajid Alauddin Ramadhan
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
    
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

public class Cell {
    public static final int SIZE = 120;
    public static final int PADDING = 24;
    public static final int SEED_SIZE = 72;
    public static final int SEED_STROKE_WIDTH = 8;
    private static final ImageIcon CROSS_ICON = new ImageIcon("src/cow.png");
    private static final ImageIcon NOUGHT_ICON = new ImageIcon("src/owl.png");
    Seed content;
    int row;
    int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.content = Seed.NO_SEED;
    }

    public void newGame() {
        this.content = Seed.NO_SEED;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(8.0F, 1, 1));
        int x1 = this.col * 120 + 24;
        int y1 = this.row * 120 + 24;
        if (this.content == Seed.CROSS) {
            g.drawImage(CROSS_ICON.getImage(), x1, y1, 72, 72, (ImageObserver)null);
        } else if (this.content == Seed.NOUGHT) {
            g.drawImage(NOUGHT_ICON.getImage(), x1, y1, 72, 72, (ImageObserver)null);
        }

    }
}
