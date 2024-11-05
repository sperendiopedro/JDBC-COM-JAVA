# Este projeto consinste em uma conexão com banco de dados utilizando o JDBC. 

### O projeto consiste em 3 pckages: A referente ao Database e suas configs, a que trabalha com as entidades e os DAOs (Repositorios) e a main onde o programa roda. 

#### Antes de falar das packages e suas funcionalidades, vc precisa inserir a dependencia do jdbc no seu projeto. 
Você vai preciasr criar uma pasta dentro do 'src" com o nome de ".project" e lá vc vai inserir a dependencia, é um codigo tipo esse 
<br></br>
![Screenshot_20241105_175211](https://github.com/user-attachments/assets/7b0e699e-0a6a-44e5-83e1-b8888347c3f3)
<br></br>

Aproveitando que você tá criando pastas no src, é melhor já seguir esse passo aqui: 

#### DENTRO DA PASTA "src" CRIAR UM ARQUIVO COM O NOME DE db.properties É ALI QUE VOCÊ VAI PASSAR AS CREDENCIAIS DO BANCO
AS credenciais vão ser algo tipo: 
<br></br>
![Screenshot_20241105_165504](https://github.com/user-attachments/assets/3b03363c-0ec8-47dd-9a8a-b528773c96fa)
<br></br>

##### Lembrando que aqui eu to usando uma conexão via MySQL, eu recomendo vc usar o H2 pra vc n ter q configurar um banco do zero.

o objeto do tipo "fileInputstream" vai ler essas credenciais lá na classe db, como é um projeto academico não tem problema deixar exposto no projeto. 

#### OBS.1: EU NÂO LEMBRO SE O classpath É CRIADO AUTOMATICAMENTE, MAS CASO NÃO FOR SÓ COPIAR O MEU (ISSO SE VOCÊ TIVER USANDO O JAVA SE 17 E ECLIPSE Kkkkkk) 

### Agora vamos às classes e o que elas fazem!

#### Package db: 
Consiste de 3 classes: A "db", "dbexceptions" e "dbintegrityexception". 

Sendo "db" a classe principal desse projeto, utilizamos de um combo de tipos de objetos para realizar a conexão com o banco de dados via props do JDBC. O primeiro objeto do tipo "Connection" para recuperar as infos da conexão, o objeto do tipo "Properties" para setar as credenciais da conexão com o banco, que será lido do db.properties pelo terceiro objeto do tipo "FileInputStream". 
(Para saber mais sobres os objetos, recomendo ler sobre elas na web) 

As outras duas classes da package lida apenas com as exceções que podem ocorrer ao instanciar uma nova conexão. 

#### Package Model: 

Essa package lida com as entidades e seus respectivos DAOs (ou repo). 
As entidades não tem segredo, são as classes padrão java, com atributos e get, setters e etc. O que vale a pena focar nessa seção é sobre os Repos: 

##### DAOs (ou repos):

São interfaces e é aonde o nosso projeto vai se comunicar com o banco de dados, são as queries do SQL que serão executadas conforme a demanda da nossa aplicação. 
em outras palavras, é o "insert", "update" e etc. Dá uma lida nas interfaces e na implementação. 
#### OBS.2: Todos as queries são implementadas dentro da package "impl", lá vc vai entender como fazer.

#### Package application
Aqui se encontra a "main" é onde o programa vai rodar, ali é onde eu manipulo a inserção, alteração, exclusão e etc. dos dados, talvez os botões vão ficar do mesmo jeito que tá aqui na main, eu acho.... kkkkk


flw espero ajudar, se você quiser fazer uma autenticação simples, pensei em criar um atributo chamado "autenticated" em algum lugar, que eu não sei aonde, e vai buscar no banco de dado se o usuario e a senha conferem, se sim seta o atributo como true e deixa o conteudo q vc quer exibir visível, se não manda exibe uma mensagem, sei lá...
