 class User {
     public void register() {
         //criar um novo usuário no banco de dados
     }
    
     public void sendWelcomeEmail() {
         //enviar um e-mail de boas-vindas
     }
    
     public void generateReport() {
         //gerar um relatório do usuário
     }
 }

--------------------------


  class UserManager {
     public void registerUser() {
     }
 }
    
 class EmailSender {
     public void sendWelcomeEmail() {
     }
 }
    
 class ReportGenerator {
     public void generateUserReport() 
     }



// O princípio de responsabilidade única estabelece que uma classe deve ter apenas uma razão para mudar, ou seja, deve ter uma única responsabilidade.
// No primeiro código, a classe User possui três métodos que desempenham diferentes responsabilidades: registrar um usuário, enviar e-mail e gerar um relatório, violando o princípio da responsabilidade única.
// No segundo código, as responsabilidades foram divididas em classes distintas. Cada classe tem apenas uma razão para mudar e uma única responsabilidade, aderindo ao SRP.