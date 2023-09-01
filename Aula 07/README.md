  Banco de dados e Persistência de Objetivos

•	Bancos de dados organizam informações de forma estruturada.
•	Bancos de Dados Relacionais baseiam-se em relações entre dados para evitar redundância.
•	Objetos têm estado (valor) e comportamento (operações).
•	Persistência de Dados envolve garantir que informações sejam salvas e recuperáveis no futuro.
•	Persistência de Objetos é o armazenamento consistente de objetos em aplicações orientadas a objetos.
•	Muitos sistemas precisam salvar dados durante a operação.
•	Dados podem ser armazenados de várias formas diferentes.


                       Tipos de Dados
                       Dados Estruturados
•	Dados estruturados possuem um formato pré-definido, organizado em tabelas com linhas e colunas.
•	Cada coluna representa um atributo, enquanto cada linha é uma entrada única.
  Características:
•	Formato tabular.
•	Utilização de linguagem específica para consulta, como SQL.
•	Facilidade de armazenamento, busca e análise.

Exemplo de Dados Estruturados(Reserva de Hotel), utiliza uma planilha com as seguintes colunas:

•	Nome do Hóspede
•	Data de Check-in
•	Data de Check-out
•	Número de Quartos Reservados
•	Tipo de Quarto
•	Valor Total da Reserva

                     


                 Dados Semiestruturados

•	Dados semiestruturados possuem alguma estrutura, mas não seguem um formato tabular rígido.
•	São organizados hierarquicamente ou em formato de chave-valor.
•	Exemplos incluem XML, JSON e HTML.

Características:
•	Hierarquia de dados com elementos aninhados.
•	Uso de chaves e valores para representação.
•	Flexibilidade para adicionar novos campos sem alterar a estrutura global.

Exemplo de Dados Semiestruturados (Preferências):

•	Coleta informações sobre as preferências dos hóspedes.
•	Utiliza um documento de texto estruturado, como um arquivo JSON.
Campos incluídos:
•	Nome do Hóspede
•	Preferência de Alimentação (Vegetariana, Vegana, Carnívora, etc.)
•	Solicitações Especiais (Berço, Travesseiros Extras, etc.)
•	Atividades de Lazer (Piscina, Spa, Academia, etc.)

                                         Dados Não Estruturado 
•	Dados não estruturados carecem de formato ou estrutura definidos.
•	Podem ser textuais, multimídia ou outras formas que não se encaixam facilmente em tabelas ou hierarquias.
•	Exemplos incluem texto livre, imagens, áudio e vídeo.

Características:
•	Ausência de formato pré-definido.
•	Necessitam de técnicas avançadas de processamento de linguagem natural e aprendizado de máquina para análise.
•	Contêm informações valiosas, mas podem ser desafiadores de lidar.

Exemplo de Dados Não Estruturados (Comentários dos Hóspedes):

•	Coleta comentários de hóspedes sobre suas estadias.
•	Os comentários estão em formato de texto livre.
•	Um arquivo de texto contendo pelo menos 5 comentários fictícios é criado.
      XML – Extensible Markub Language
•	Automatização crescente do comércio eletrônico e de outras   aplicações online exige a troca e interpretação automatizada de documentos da web entre diferentes sites.
•	Isso levou ao desenvolvimento da XML (Extensible Markup Language).
•	XML é um padrão para estruturar e trocar dados via web.
•	Possibilita fornecer informações sobre a estrutura e significado dos dados em páginas web, indo além da formatação para exibição.
•	XML separa dados do HTML, armazenando dados em arquivos XML enquanto o HTML é usado para apresentação.
•	XML permite a troca de dados entre aplicativos, como comércio eletrônico e transferência de dados de bancos de dados.
•	Possibilidades do XML incluem compartilhar dados entre sistemas, publicar dados de bancos de dados e analisar seu conteúdo.
•	No modelo hierárquico da XML, o documento XML é a unidade básica.
•	Elementos são identificados por tags de início e fim, enquanto atributos fornecem informações adicionais.
•	Elementos podem ser simples (contendo valores de dados) ou complexos (construídos hierarquicamente).
•	XML é uma linguagem de marcação para armazenar e transportar dados estruturados e legíveis.
•	Em contraste, HTML é usado para estruturar e exibir conteúdo em navegadores da web.



                     


                  JSON (JavaScript Object Notation)

•	JSON (JavaScript Object Notation) é um acrônimo.
•	É um formato aberto e popular para representação e troca de dados, semelhante ao XML.
•	Fácil de ser lido e editado por humanos, e simples para processamento por computadores.
•	Independente de linguagem de programação.
•	Criado por Douglas Crockford, formalizado na RFC 4627 em 2006.
•	Baseado em um subconjunto do JavaScript, com gramática documentada em seu site oficial.
•	Um documento JSON é um conjunto de dados não ordenados.
•	Os dados são armazenados em pares "nome":valor (campo) dentro de chaves {}.
•	Os nomes-chave são sempre colocados entre aspas duplas.
•	Os nomes-chave são separados de seus valores por dois-pontos (:).
•	Os pares (campos) são separados uns dos outros por vírgulas (,).

Características:

•	Documentos JSON podem conter diversos tipos de valores, como strings, números de ponto flutuante, números inteiros, valores booleanos, nulo, arrays e objetos.
•	JSON é flexível e suporta qualquer nível de hierarquia necessário para o modelo de dados da aplicação.
•	Comentários não são suportados pelo JSON..

                               Serialização
•	Serialização é o processo de capturar uma estrutura de dados (objeto) para que ela possa ser armazenada, transmitida e reconstituída posteriormente.
•	Na prática, envolve a criação de um texto JSON válido que representa os dados contidos na estrutura.
•	Métodos especiais, como o JSON.stringify, são usados para realizar a serialização de uma estrutura que contém dados.





       Desserialização
•	Desserialização é o processo inverso da serialização, que envolve a conversão de JSON válido em valores e objetos utilizáveis em um programa, reconstituindo assim a estrutura de dados.
•	Esse processo também é chamado de parsing.
•	Métodos especiais, como o JSON.parse, são utilizados para realizar a desserialização de dados JSON.

JDBC (Java Database Connectivity)

SGBD
•	Um Banco de Dados é usado para    armazenar e recuperar informações.
•	Sistemas de Gerenciamento de Banco de Dados (SGBD) trazem benefícios:
•	Redução de redundância de dados.
•	Prevenção de inconsistências.
•	Possibilidade de compartilhar dados.
•	Imposição de padrões.
•	Aplicação de restrições de segurança.
•	Manutenção da integridade dos dados.

             SQL
•	Linguagem declarativa é a SQL.
•	A SQL é composta por três partes:
•	DML (Data Manipulation Language) - utilizada para recuperar e alterar dados do banco de dados. Pode ser incorporada em outras linguagens de programação.
•	DDL (Data Definition Language) - usada para definir a estrutura do banco de dados.
•	DCL (Data Control Language) - empregada para controlar o acesso a dados, gerenciar usuários, entre outras funções.
                                        Portanto, SQL = DML + DDL + DCL.

					



JDBC

•	JDBC (Java Database Connectivity) é uma interface em Java para acessar bancos de dados por meio de SQL.
•	Implementa em Java a funcionalidade definida pelo padrão SQLCLI (SQL Call Level Interface).
•	Pacote Java padrão: java.sql.
•	Baseada em ODBC (Open Database Connectivity).
•	A maioria dos fornecedores de bancos de dados oferece uma implementação específica do SQLCLI.
•	O uso do JDBC permite acesso direto a bancos de dados por meio de aplicações Java.

Connection,Statement e ResultSet
•	Connection, Statement e ResultSet são interfaces do JDBC com métodos implementados em todos os drivers JDBC.
•	Connection representa uma conexão com o banco de dados e é obtida através do método getConnection do DriverManager.
•	Statement oferece meios para enviar instruções SQL ao sistema de banco de dados.
•	ResultSet é um cursor para os dados resultantes de uma consulta SQL.













JPA (Java Persistence API):
•	API de persistência em Java para mapear objetos Java para o banco de dados relacional.
•	Parte do Java EE (Jakarta EE) e também pode ser usado em Java SE.
•	Simplifica a interação entre objetos Java e o banco de dados.
Mapeamento de Objetos para Banco de Dados:
•	Permite representar classes Java como tabelas em um banco de dados.
•	Cada objeto se torna uma linha na tabela e os atributos se tornam colunas.
Entidades:
•	Classes Java que são mapeadas para tabelas de banco de dados.
•	Utiliza anotações como @Entity, @Id, e outras para definir o mapeamento.
Relacionamentos:
•	JPA suporta diversos tipos de relacionamentos, como um-para-um, um-para-muitos, muitos-para-um e muitos-para-muitos.
•	São mapeados usando anotações como @OneToOne, @OneToMany, etc.
EntityManager:
•	Interface central para interagir com a camada de persistência.
•	Realiza operações como salvar, atualizar, buscar e excluir objetos.
Consulta com JPQL:
•	JPQL (Java Persistence Query Language) é uma linguagem de consulta similar ao SQL, mas usa objetos e entidades em vez de tabelas.
•	Permite consultas orientadas a objetos.
•	Transações garantem que operações de persistência sejam atomicamente consistentes e isoladas.
•	Transações podem ser gerenciadas manualmente ou automaticamente.
Benefícios:
•	Reduz a complexidade de persistência de dados.
•	Abstrai detalhes do banco de dados e oferece portabilidade.
•	Fomenta o desenvolvimento ágil e manutenção mais fácil.
•	JPA Implementações:
•	Diversos fornecedores oferecem implementações JPA, como Hibernate, EclipseLink e OpenJPA.
JPA é uma tecnologia poderosa para gerenciar a persistência de dados em aplicações Java, facilitando a interação entre objetos Java e bancos de dados relacionais.
