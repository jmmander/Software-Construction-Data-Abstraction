package model;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
        instrument = 51;
        PLAYING_COLOR = new Color(193, 165, 230);
    }

    // EFFECTS: return true if the given y value is within the bounds of the Shape
    public boolean containsY(int y) {
        return (this.y <= y) && (y <= this.y + height);
    }

    // EFFECTS: return true if the given Point (x,y) is contained within the bounds of this Shape
    public boolean contains(Point point) {
        int point_x = point.x;
        int point_y = point.y;

        return containsX(point_x) && containsY(point_y);
    }

    //EFFECTS: draws the shape
    public void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    //EFFECTS: fills the shape
    public void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }

}