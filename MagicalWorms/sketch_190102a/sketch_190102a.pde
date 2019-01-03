
void setup() {
  size(300, 300);
  background(255, 28, 229);
}

void draw() {
  for (int i = 0; i < 301; i++) {
    ellipse(i, i, 25, 25);
    fill(139, 136, 245);
  }
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}