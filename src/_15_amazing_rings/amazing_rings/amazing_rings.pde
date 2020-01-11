void setup() {
  size(750, 750);
}
int m = 600;
int r = 150;
int s = -1;
int z = 1;
void draw() {
  background(127,127, 127);
  int x = 300;
  for (int i = 0; i<20; i++) {

    noFill();
    ellipse(r, 375, x, x);
    ellipse(m, 375, x, x);
    x-=15;
  }
  if (m<150) {
    s = 1;
  }
  if(m>600){
   s=-1; 
  }
  if (r>600){
  z = -1;
  }
  if(r<150){
   z = 1; 
  }
  m+=s;
  r+=z;
}
