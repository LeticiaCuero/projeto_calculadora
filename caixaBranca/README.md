# 1. Introdução

O objetivo desta atividade foi realizar uma análise de um código Java, o mesmo faz a autenticação de usuários em um banco de dados. Foram aplicadas técnicas de análise estática, modelagem do fluxo de execução, cálculo da complexidade ciclomática e identificação dos caminhos básicos independentes.

# 2. Análise Estática do Código

Documentação

O código não possui comentários ou documentação adequada.

Nomenclatura

Os nomes das variáveis e métodos são simples e compreensíveis.

Legibilidade

O código possui organização básica, porém pode ser melhorado com comentários e separação de responsabilidades.

Tratamento de Exceções

O tratamento de exceções não é adequado, pois o bloco catch está vazio.

Segurança

O código apresenta risco de SQL Injection por concatenar valores diretamente na consulta SQL.

Conexões

A conexão com o banco de dados não é fechada após o uso.

Vulnerabilidades

Possui vulnerabilidade de SQL Injection e exposição de credenciais no código.

Boas Práticas

A inclusão de comentários ajudaria na compreensão do código.

# 3. Grafo de Fluxo

![Diagrama](assets/diagrama.png)

# 4. Complexidade Ciclomática

Número de nós: 11
Número de arestas: 12
Número de regiões: 3

V(G) = E - N + 2P
V(G) = 12 - 11 + 2(1)
V(G) = 3

# 5. Caminhos Básicos

Caminho 1 – Usuário encontrado

Descrição:
A consulta encontra um usuário com o login e senha informados.

Fluxo:
Início → Monta SQL → Conecta ao banco → Executa consulta → rs.next() = verdadeiro → result = true → Retorna result.

Caso de teste:
Informar login e senha válidos cadastrados no banco.

Caminho 2 – Usuário não encontrado

Descrição:
A consulta não encontra nenhum usuário com o login e senha informados.

Fluxo:
Início → Monta SQL → Conecta ao banco → Executa consulta → rs.next() = falso → Retorna result.

Caso de teste:
Informar login ou senha inválidos.

Caminho 3 – Erro durante a execução

Descrição:
Ocorre uma exceção durante a conexão ou execução da consulta.

Fluxo:
Início → Monta SQL → Conecta ao banco/Executa consulta → Exceção → catch → Retorna result.

Caso de teste:
Simular falha na conexão com o banco de dados.

# 6. Melhorias Implementadas
Inclusão de comentários no código.
Melhoria da organização do código.
Sugestão de uso de PreparedStatement.
Sugestão de fechamento das conexões.
Sugestão de tratamento adequado das exceções.

# 7. Conclusão

A atividade permitiu compreender a importância da análise estrutural e dos testes de caixa branca. A revisão do código possibilitou identificar vulnerabilidades, falhas de segurança e oportunidades de melhoria. O processo demonstra a importância da qualidade de software para garantir sistemas mais seguros, confiáveis e fáceis de manter.