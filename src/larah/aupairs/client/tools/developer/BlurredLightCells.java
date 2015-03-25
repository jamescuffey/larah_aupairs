package larah.aupairs.client.tools.developer;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Acts as an overlapping jPanel for bubbles.
 * 
 */
public final class BlurredLightCells extends JPanel {

    private static final long serialVersionUID = 4610174943257637060L;

    private final Random random;
    private final ArrayList<LightCell> lightcells;
    private final float[] blurData = new float[500];
    
    public BlurredLightCells(int ballAmount, final int xCoordinate, final int yCoordinate) {
        this.random = new Random();
 
        setSize(xCoordinate, yCoordinate);
        
        /**
         * Below we initiate all the cells that are going to be drawn on screen
         */
        Arrays.fill(blurData, 1f / 20f);
        lightcells = new ArrayList<>(ballAmount);
        for (int i = 0; i < ballAmount; i++) {;

            /**
             * Below we generate all the values for each cell(SHOULD be random for each one)
             */
            int baseSpeed = random(0, 3);
            int xSpeed = (int) Math.floor((Math.random() * (baseSpeed - -baseSpeed + baseSpeed)) + -baseSpeed);
            int ySpeed = (int) Math.round((Math.random() * baseSpeed) + 0.5);
            int radius = random(25, 100);
            int x = (int) Math.floor(Math.random() * getWidth());
            int y = (int) Math.floor(Math.random() * getHeight());
            int blurrAmount = (int) (Math.floor(Math.random() * 10) + 5);
            int alpha = (int) ((Math.random() * 15) + 3);

            /**
             * Now we draw a image, and apply transparency and a slight blur to it
             */
            Kernel kernel = new Kernel(blurrAmount, blurrAmount, blurData);
            BufferedImageOp op = new ConvolveOp(kernel);
            BufferedImage circle = new BufferedImage(150, 150, BufferedImage.TYPE_INT_ARGB);
            Graphics2D circlegfx = circle.createGraphics();
            circlegfx.setColor(new Color(255, 255, 255, alpha));
            circlegfx.fillOval(20, 20, radius, radius);
      
            //circlegfx.drawLine(20, 20, radius, radius);
            circle = op.filter(circle, null);
            LightCell bubble = new LightCell(x, y, xSpeed, ySpeed, radius, getDirection(random.nextInt(3)), circle);
            lightcells.add(bubble);
            
            setOpaque(false);
            
            Timer timer = new Timer(40, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    repaint();
                }
            });
            timer.start();
        }
    }

    public int random(int min, int max) {
        final int n = Math.abs(max - min);
        return Math.min(min, max) + (n == 0 ? 0 : random.nextInt(n));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        final Graphics2D g2 = (Graphics2D) g;
        GradientPaint gp = new GradientPaint(-w, -h, Color.WHITE, w, h, Color.PINK);
        g2.setPaint(gp);
        g2.fillRect(0, 0, w, h);
        for (LightCell cell : lightcells) {
            cell.process(g2);
        }
    }

    public String getDirection(int i) {
        switch (i) {
            case 0:
                return "right";
            case 1:
                return "left";
            case 2:
                return "up";
            case 3:
                return "down";
        }
        return "";
    }

    private class LightCell {

        private int x, y, xSpeed, ySpeed, radius;
        private String direction;
        private BufferedImage image;

        public LightCell(int x, int y, int xSpeed, int ySpeed, int radius, String direction, BufferedImage image) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
            this.radius = radius;
            this.direction = direction;
            this.image = image;
        }

        public void process(Graphics g) {
            switch (direction) {
                case "right":
                    moveRight();
                    break;
                case "left":
                    moveLeft();
                    break;
                case "up":
                    moveUp();
                    break;
                case "down":
                    moveDown();
                    break;
            }
            g.drawImage(image, x, y, null);
        }

        private void moveUp() {
            x += xSpeed;
            y -= ySpeed;
            if (y + (radius / 2) < 0) {
                y = getHeight() + (radius / 2);
                x = (int) Math.floor(Math.random() * getWidth());
            }

            if ((x + radius / 2) < 0 || (x - radius / 2) > getWidth()) {
                y = radius + (radius / 2);
                x = (int) Math.floor(Math.random() * getWidth());
            }
        }

        private void moveDown() {
            x += xSpeed;
            y += ySpeed;
            if (y - (radius / 2) > getHeight()) {
                y = 0 - (radius / 2);
                x = (int) Math.floor(Math.random() * getWidth());
            }

            if ((x + radius / 2) < 0 || (x - radius / 2) > getWidth()) {
                y = getHeight() + (radius / 2);
                x = (int) Math.floor(Math.random() * getWidth());
            }
        }

        private void moveRight() {
            x += ySpeed;
            y += xSpeed;
            if (y - (radius / 2) > getHeight() || y + (radius / 2) < 0) {
                x = 0 - (radius / 2);
                y = (int) Math.floor(Math.random() * getHeight());
            }

            if ((x - radius / 2) > getWidth()) {
                x = 0 - (radius / 2);
                y = (int) Math.floor(Math.random() * getWidth());
            }
        }

        private void moveLeft() {
            x -= ySpeed;
            y -= xSpeed;
            if (y - (radius / 2) > getHeight() || y + (radius / 2) < 0) {
                x = getWidth() + (radius / 2);
                y = (int) Math.floor(Math.random() * getHeight());
            }

            if ((x + radius / 2) < 0) {
                x = getWidth() + (radius / 2);
                y = (int) Math.floor(Math.random() * getWidth());
            }
        }
    }
}