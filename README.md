# login
<b>API de validação de senha - Spring boot</b>
<br>
<br>
A API se encontra hospedada no AWS, pronta para execução e testes de funcionalidade. <br>
Segue link: http://login-env.eba-hbgjpfe3.us-east-1.elasticbeanstalk.com/
<br>
<br>
<b>Página inicial tela de login</b>
<br>
Para ter acesso ao site é necessario ter usuario e senha.
Quem está acessando pela primeira vez, clicar no link abaixo do botão para ser direcionado para a pagina de registro de senha.
Na página de registro, é necessario preencher nome, usuario e senha. Sua senha será cadastrada, caso atenda as definições estabelacidas.
Após confirmação do cadastro do usuario e senha, voltar a página de login e efetuar o acesso ao site.

<br>
<b>Decisões técnicas</b>

Para validar cada uma das definições de senha, utilizei expressões regulares (Regex) pertecentes as bibliotecas Javax e Java.util.
Fiz as validações nas camadas Controller e Model da arquitetura MVC, para evitar que senhas de formato inválido fossem salvas no banco de dados.
<br>
<br>
<br>
OBS: Caso queiram hospedar a API no seu proprio ambiente, seguem instruções abaixo:
<br><br>
<b>Para execução do sistema em produção</b>

- Criar uma instancia RDS do Mysql no AWS
- Criar uma database chamada login (OBS: Não precisa criar as tabelas, porque a API cria as tabelas sozinha)
- Fazer download do codigo da API no github, importar projeto Spring na IDE Spring Tool Suite 4
- Alterar o arquivo application.properties com a URL, username e password do novo Banco de dados criado.
- Gerar WAR com o Maven install, o WAR login.war será gerado dentro da pasta target
- Fazer o deploy do WAR no S3 beanstalk do AWS

<br>
<br>
<b><i>Gratidão</i></b>
