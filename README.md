# Este projeto consinste em uma conexão com banco de dados utilizando o JDBC. 

### O projeto consiste em 3 packages: A referente ao Database e suas configs, a que trabalha com as entidades e os DAOs (Repositorios) e a main onde o programa roda. 

### Package db: 
Consiste de 3 classes: A "db", "dbexceptions" e "dbintegrityexception". 

Sendo "db" a classe principal desse projeto, utilizamos de um combo de tipos de objetos para realizar a conexão com o banco de dados via props do JDBC. O primeiro objeto do tipo "Connection" para recuperar as infos da conexão, o objeto do tipo "Properties" para setar as credenciais da conexão com o banco, que será lido do db.properties pelo terceiro objeto do tipo "FileInputStream". 
(Para saber mais sobres os objetos, recomendo ler sobre elas na web) 

As outras duas classes da package lida apenas com as exceções que podem ocorrer ao instanciar uma nova conexão. 

### Package Model: 

Essa package lida com as entidades e seus respectivos DAOs (ou repo). 
As entidades não tem segredo, são as classes padrão java, com atributos e get, setters e etc. O que vale a pena focar nessa seção é sobre os Repos: 

DAOs (ou repos):
É aonde o nosso projeto vai se comunicar com o banco de dados, são as queries do SQL que serão executadas conforme a demanda da nossa aplicação. 
obs: é o "insert", "update" e etc. Leia as classes que você entenderá melhor. 

### NÃO ESQUEÇA DE DENTRO DA PASTA "src" CRIAR UM ARQUIVO COM O NOME DE db.properties É ALI QUE VOCÊ VAI PASSAR AS CREDENCIAIS DO BANCO
AS credenciais vão ser algo tipo: 
<br></br>
![Screenshot_20241105_165504](https://github.com/user-attachments/assets/3b03363c-0ec8-47dd-9a8a-b528773c96fa)
<br></br>

#### Lembrando que aqui eu to usando uma conexão via MySQL, eu recomendo vc usar o H2 pra vc n ter q configurar um banco do zero.

o objeto do tipo "fileInputstream" vai ler essas credenciais lá na classe db, como é um projeto academico não tem problema deixar exposto no projeto. 

flw espero ajudar abraços.
