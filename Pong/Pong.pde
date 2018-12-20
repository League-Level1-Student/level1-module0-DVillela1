int ballx = 0;
int bally = 400;
int i = 20;
int f = 20;
import ddf.minim.*;
Minim minim;
AudioSample sound;
void setup(){
  size(800, 800);
  background(50, 100, 200);
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
}

void draw(){
      background(50, 100, 200);
  ballx += i;
  bally += f;
  fill(135, 0, 255);
  ellipse (ballx, bally, 25, 25);
  if (ballx > width) {
   background(50, 100, 200);
   i = -20;
  }
  if (ballx < 0) {
    background(50, 100, 200);
    i = 20;
  }
  if (bally > height) {
   background(50, 100, 200);
   f = -20;
  }
  if (bally < 0) {
    background(50, 100, 200);
    f = 20;
  }
}