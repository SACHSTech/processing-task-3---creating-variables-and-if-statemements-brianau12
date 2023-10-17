import java.util.Random;
import processing.core.PApplet;

public class Sketch extends PApplet {

  Random myRandom = new Random();
  int intRandomx = myRandom.nextInt((400 - 50 + 1) + 50);
  int intRandomy = myRandom.nextInt(100 + 1);


  public void settings() {

    size(400, 400);
  }

  public void setup() {
    
    if (intRandomx >= 300 && intRandomy >= 80) {
    background(168, 50, 88);
  }

    else if (intRandomx >= 240 && intRandomy >= 60) {
    background(42, 20, 115);
  }

    else if (intRandomx >= 200 && intRandomy >= 40) {
    background(200, 74, 28);
  }

    else if (intRandomx >= 100 && intRandomy >= 20) {
    background(200, 147, 28);
  }

    else {
    background(28, 196, 230);
  }

    if (intRandomx >= 300 && intRandomy >= 80) {
    stroke(0);
    fill(240, 252, 61);
    ellipse(50, 120, 50, 50);
    }

    else if (intRandomx >= 240 && intRandomy >= 60) {
    stroke(0);
    fill(240, 252, 61);
    ellipse(160, 60, 50, 50);
    }

    else if (intRandomx >= 160 && intRandomy >= 40) {
    stroke(0);
    fill(240, 252, 61);
    ellipse(220, 60, 50, 50);
    }

    else if (intRandomx >= 80 && intRandomy >= 20) {
    stroke(0);
    fill(240, 252, 61);
    ellipse(280, 90, 50, 50);
    }

    else {
    stroke(0);
    fill(240, 252, 61);
    ellipse(350, 120, 50, 50);

    }

    int m = minute();
    int h = hour();
    int se = second();

    String s = String.valueOf(h);
    text (s, 10, 28);
    s = String.valueOf(m);
    text (s, 30, 28);
    s = String.valueOf(se);
    text (s, 50, 28);
  }
  public void draw() {
 
  stroke(0);  
  fill(268, 168, 52);
  rect(100, 200, 200, 150);
  triangle( 200, 100, 300, 200, 100, 200);
  
  stroke(0);
  fill(255, 255, 255);
  rect(163, 260, 75, 90);
  line(200, 260, 200, 350);

  stroke(0);
  fill(200, 200, 200);
  ellipse(207, 310, 7, 7);

  stroke(0);
  fill(40, 176, 59);
  rect(0, 350, 400, 100);
  
  stroke(0);
  fill(255, 255, 255);
  rect(177, 139, 45, 50);
  line(177, 165, 222, 165);
  line(200, 140, 200, 188);
   
  
   }
  
  }

  


