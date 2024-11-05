# Este projeto consinste em uma conexão com banco de dados utilizando o JDBC. 

## O projeto consiste em 3 packages: A referente ao Database e suas configs, a que trabalha com as entidades e os DAOs (Repositorios) e a main onde o programa roda. 

### Package db: 
Consiste de 3 classes: A "db", "dbexceptions" e "dbintegrityexception". 

Sendo "db" a classe principal desse projeto, utilizamos de um combo de dois objetos para realizar a conexão com o banco de dados via props do JDBC. O primeiro objeto do tipo "Connection" para recuperar as infos da conexão, o objeto do tipo "Properties" para setar as props dentro do terceiro objeto do tipo "FileInputStream". 
(Para saber mais sobres os objetos, recomendo ler sobre elas na web) 

As outras duas classes da package lida apenas com as exceções que podem ocorrer ao instanciar uma nova conexão. 

### Package Model: 

Essa package lida com as entidades e seus respectivos DAOs (ou repo). 
As entidades não tem segredo, são as classes padrão java, com atributos e get, setters e etc. O que vale a pena focar nessa seção é sobre os Repos: 

DAOs (ou repos):
É aonde o nosso projeto vai se comunicar com o banco de dados, são as queries do SQL que serão executadas conforme a demanda da nossa aplicação. 
obs: é o "insert", "update" e etc. Leia as classes que você entenderá melhor. 
