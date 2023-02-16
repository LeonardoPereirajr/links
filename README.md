# API de salvamento de links

API que realiza através de um formulário WEB o salvamento de um titulo e o Link para uso futuro

## Explicações e motivações do projeto

A API é feita em JAVA com Framework em Spring. O Banco de dados é em nuvem hospedado na SUPABASE.

Possui os métodos POST/PUT/GET/DELETE
A classe ArticleController é responsável por mapear as requisições HTTP para as funções CRUD correspondentes para um recurso de "artigos".

O construtor desta classe é injetado com uma instância da interface ArticleRepository, que é usada para manipular o banco de dados em segundo plano.
O método addLink mapeia a requisição HTTP POST para /api/articles/api/links e adiciona um novo artigo no banco de dados. O objeto Article é recuperado 
do corpo da requisição HTTP e inserido no banco de dados usando o método jdbcTemplate.update(). 
 O ID gerado para o novo artigo é recuperado do banco de dados e adicionado de volta ao objeto Article.
O método getLinks mapeia a requisição HTTP GET para /api/articles/api/links e retorna todos os artigos armazenados no banco de dados usando o método 
jdbcTemplate.query().
O método updateLink mapeia a requisição HTTP PUT para /api/articles/api/links/{id} e atualiza o artigo com o ID correspondente no banco de dados. 
O objeto Article é recuperado  do corpo da requisição HTTP e atualizado no banco de dados usando o método jdbcTemplate.update().
O método deleteLink mapeia a requisição HTTP DELETE para /api/articles/api/links/{id} e remove o artigo com o ID correspondente do banco de dados 
usando o método jdbcTemplate.update().
As respostas HTTP são enviadas como ResponseEntity, que é uma classe Spring que permite configurar o corpo da resposta, cabeçalhos e status HTTP

Embora o banco de dados esteja hospedado na Supabase. A page HTML e o backend não foi hospedado. Criei outros dois projetos separados /links-page 
e /linksBackend onde ambos foram hospedados no VERCEL e Netlfy porém não foi possivel neste momento a junção dos dois.

## Como utilizar.

Baixar o mesmo e utiliza-lo localmente através da execução da classe LinksApplication

O formulário é preenchido com o Titulo e o Link. Clicar no Botão Adicionar Link.

É possivel Editar um link e apagar.

![image](https://user-images.githubusercontent.com/30580018/219226661-2008ee93-109d-4de8-9548-7c0ea6d26ec3.png)



Autor
| Leonardo Pereira | 





