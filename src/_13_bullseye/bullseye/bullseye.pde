    void setup(){
     size(750,750); 
    }

    void draw(){
      int x = 300;
for (int i = 0; i<8; i++){
 
  if (i % 2 == 0){
    
    fill(255,0,0);
    
  }
  else{
   fill(0,0,0);
    
  }
  ellipse(375,375,x,x);
x-=37;
}

    }
                            
