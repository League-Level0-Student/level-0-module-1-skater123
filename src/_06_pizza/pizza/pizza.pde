
void setup() {
   size(500,500);
   
    fill(219,166,60);
  ellipse(250,250,456,456); //Crust


 fill(178,39,18);
ellipse(250,250, 437, 430);//Sauce

 fill(237,188,10);
ellipse(250,250, 400, 400);//Queso
   
}

void draw() {
 fill(219,166,60);
 
PImage scoobysnack = loadImage("scooby-snack.png");
image(scoobysnack, 200, 200);
image(scoobysnack, 100, 100);
image(scoobysnack, 100, 300);
image(scoobysnack, 100, 200);
image(scoobysnack, mouseX, mouseY);


}
