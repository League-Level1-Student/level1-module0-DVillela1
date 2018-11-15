int ballx = 0;
import ddf.minim.*;
Minim minim;
AudioSample sound;
void setup(){
  size(800, 800);
  background(0, 255, 253);
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
}

void draw(){
  ballx += 10;
  fill(135, 0, 255);
  noStroke();
  ellipse (ballx, 400, 25, 25);
  
}