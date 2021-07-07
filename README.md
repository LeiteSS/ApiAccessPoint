# Sistema de Controle de Ponto e Acesso

**Descrição:** Neste projeto você terá o desafio de desenvolver uma API Rest para  controle de ponto e acesso dos usuários de uma empresa. Utilizaremos  Java, Spring Boot, Hibernate Envers e lombok além de documentar toda a  API com Swagger.

> The `@Builder` annotation produces complex builder APIs for your classes. 	
>
> `@Builder` lets you automatically produce the code required to have your class be instantiable with code such as:`Person.builder().name("Adam Savage").city("San Francisco").job("Mythbusters").job("Unchained Reaction").build();` 	
>
> [@Builder Overview](https://projectlombok.org/features/Builder)

- Quando houver chave composta no diagrama de banco de dados é possivel embutir uma classe dentro de outra (embedded class), do qual possui a chave primaria e secundaria. 

  ```java
  public class Movimentacao {
      
      @AllArgsConstructor
      @NoArgsConstructor
      @EqualsAndHashCode
      @Embeddable
      public class MovimentacaoId implements Serializable {
          private long idMovimento;
          private long idUsuario;
      }
      
      @EmbeddedId
      private MovimentacaId id;
      
  }
  ```

- [Database Auditing JPA](https://www.baeldung.com/database-auditing-jpa)

- O Swagger não estava funcionando porque faltava uma dependência a ser colocada no `build.gradle`:

  ```groovy
  implementation group: 'io.springfox', name: 'springfox-boot-starter', version: '3.0.0'
  ```

   Depois de colocado, é só ir em http://localhost:8081/swagger-ui/.