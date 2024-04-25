 class Shape {
     private String type;
    
     public void draw() {
         if (type.equals("circle")) {
             drawCircle();
         } else if (type.equals("rectangle")) {
             drawRectangle();
         } else if (type.equals("triangle")) {
             drawTriangle();
         }
     }
    
     private void drawCircle() {
         // Desenhar um círculo
     }
    
     private void drawRectangle() {
         // Desenhar um retângulo
     }
    
     private void drawTriangle() {
         // Desenhar um triângulo
     }
 }


--------------------------

  interface Shape {
     void draw();
 }
    
 class Circle implements Shape {
     public void draw() {
     }
 }
    
 class Rectangle implements Shape {
     public void draw() {
     }
 }
    
 class Triangle implements Shape {
     public void draw() {
     }
 }


