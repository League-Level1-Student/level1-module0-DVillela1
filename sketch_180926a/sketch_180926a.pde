import ddf.minim.*; 
PImage pictureOfRecord;
int u;
Minim minim;
AudioPlayer song; 
void setup() {
  size(1920, 1080);
  pictureOfRecord = loadImage("record.png");
  pictureOfRecord.resize(1024, 768);     
  minim = new Minim(this);  
  song = minim.loadFile("zds.mp3", 512);
}
void draw() {
  u += 1000;
  if (mousePressed) {
    rotateImage(pictureOfRecord, u);
    image(pictureOfRecord, 0, 0);
    song.play();
  }
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}