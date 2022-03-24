class Entity{ 
  
  float x; float y; float w; float h; 
  Entity(){
    x=0;
    y=0;
    w=0;
    h=0;
    
  }
   
}

class VectoralEntity extends Entity{
  float vecx; float vecy; float hbRadius;
  VectoralEntity(){
    hbRadius=0;
    vecx=0;
    vecy=0;
  }
}

class NonVectoralEntity extends Entity{

}
