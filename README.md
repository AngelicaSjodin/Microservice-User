Hej det här är min exmaminationsuppgift i java och sringboot.
Min del var att skapa microservicen user som gör det möjligt att skapa nya användare.

1. Först så laddar man ner min microservice User.
2. Sedan så laddar man ner microservice Payment som en i min grupp har skapat, Ali: https://github.com/Ali-Asheer/PaymentsMicro
3. Nästa steg är att skapa två nya databaser, en för varje project, de kan ha namnen t.ex User_db & Payment_db
4. Därefter för att koppla projekten till varsin databas ändrar man i "application properites" på båda projekten.
   
    spring.datasource.url=jdbc:mysql://localhost:3306/databas_namn
    spring.datasource.username=username
    spring.datasource.password=password

När man kör projekten skapas alla tabeller i dem automatiskt.

POSTMAN
Att testa API görs i postman. Båda projekten måste vara igång samtidigt.
Efter mycket trail and error föröskte jag göra min user microserive väldigt simpel.

1.
POST     http://localhost:8081/users

body:
---------------------------------------------------------------
{
    "name": "Angelica Sjödin",
    "email": "test@email.com",
    "paymentId": 1
}
---------------------------------------------------------------
Denna skapar en ny user i databasen med en payment id

2.
GET     http://localhost:8081/users/{id}

Denna ska hämta alla skapade users med deras payment id 
(dock fungerar den inte och jag vet tyvärr inte varför)
