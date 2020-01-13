# Solução: Teste Sonda

<b>Autor:</b> Gustavo F Penedo

### Links Úteis

* [Cliente (Editor)](https://stackblitz.com/edit/sondatest)

### 1. Introdução

Esse repositório busca demonstrar os meus conhecimentos em desenvolver uma API para fazer a gestão de aeroaves. As seções abaixo esclarecem melhor as minhas escolhas para cada requisito solicitado.

### 2. Modelagem

#### 2.1 Banco de Dados

Foi escolhido o banco **PostgreSQL** para armazenar as informações salvas pela API. O banco está presente na plataforma **Heroku** que possui um serviço otimizado para tal.


#### 2.2 API

Para o desenvolvimento da API foi escolhido a framework **Spring MVC** junto com o gerente de pacotes Maven para entregar uma ferramenta com formato REST.

Por questão de segurança, foi pensado em autentificação por token em uma aplicação real. Entretanto não foi desenvolvido para descomplicar a reprodução do código.

Também e preciso implementar melhor a validação dos campos da classe Aeronave.

A API está hospedada no serviço **Heroku** para que, de forma simplifica, fosse possível monitorar a atividade da aplicação bem como monitorar e reagir a falhas.

#### 2.3 Cliente

Foi desenvolvido uma versão simplificada da aplicação no site [StackBlitz](https://stackblitz.com/edit/sondatest). O projeto foi uma iniciativa de aprendendizado em Angular.js.

Infelizmente, não foi possível concluir a interação Cliente + Servidor.

### 3. Rotas da API

Conforme solicitado para a solução, os endpoints da aplicação ficaram como demonstrado abaixo.

* **Aeronaves:**
  * GET /aeronaves
  * GET /aeronaves/:id
  * GET /aeronaves/find
    * Parâmetros:
      * **id**: Id da Aeronave
      * **nome**: Modelo da Aeronave
  * POST /aeronaves/
    * Parâmetros:
      * **id**: Id da Aeronave
      * **nome**: Modelo da Aeronave
      * **marca**: Marca da Aeronave
      * **ano**: Ano de Fabricação
      * **descricao**: Descrição
  * PUT /aeronaves/:id/
    * Parâmetros são os mesmos do método POST
  * DELETE /aeronaves/:id/


### 4. Testes

Para ganho de tempo foi optado por não incrementar testes unitários. Entretanto, seria utilizado para uma aplicação real.


### Notas Finais

Qualquer dúvida com o projeto, favor entrar em contato.

<br />

Atenciosamente, <br />
**Gustavo F Penedo** <br />

---
###### Contato: gustavo-penedo@hotmail.com