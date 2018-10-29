int y = 40;
int randomNumber = (int) random(width-15);
int score = 0;
int bucketY = 500;
void setup() {
  size(1000, 1000);
}

void draw() {
  y += 5;
  background(69, 70, 71);
  fill(0, 0, 255);
  stroke(0, 0, 255);  
  ellipse(randomNumber, y, 30, 30);
  if (y > 30 + 970) {
   y = 15; 
   randomNumber = (int) random(width-15);
  }
  stroke(206, 206, 206);
  fill(206, 206, 206);
  rect(mouseX, bucketY, 30, 30);
  if (y == bucketY) {
    checkCatch(1);
  }
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }