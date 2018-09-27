PImage pictureOfRecord;

void setup() {
  size(600, 600);
  pictureOfRecord = loadImage("record.jpg");
  pictureOfRecord.resize(height, width);
  import ddf.minim.*;  
  Minim minim;  
  AudioPlayer song;  
  minim = new Minim(this);  
  song = minim.loadFile("awesomeTrack.mp3", 512);
  song.play();
}
void draw() {
  image(pictureOfRecord, 600, 600);
}
void rotateImage(PImage image, int amountToRotate) {
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}