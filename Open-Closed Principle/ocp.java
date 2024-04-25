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

//O princípio aberto-fechado estabelece que as entidades do software (classes, módulos, funções, etc.) devem estar abertas para extensão, mas fechadas para modificação direta.
// No primeiro código, a classe Shape viola o OCP, pois precisa ser modificada toda vez que um novo tipo de forma for adicionado, dificultando a extensibilidade do código.
// No segundo exemplo onde o OCP é aplicado corretamente, as formas são representadas por classes separadas que implementam a interface Shape. Ao adicionar um novo tipo de forma, basta criar uma nova classe que implementa a interface Shape e define seu próprio comportamento de desenho. Dessa forma, o código existente não precisa ser modificado, e a extensibilidade é mantida.


