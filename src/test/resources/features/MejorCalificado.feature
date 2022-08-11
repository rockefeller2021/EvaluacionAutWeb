@mejorCalificado
Feature: pagina de linio mejor calificados

  Scenario: Ingreso a pagina mejor calificados y agrego producto a carrito de compras
    Given que estoy logeado en la pagina de linio
    And doy clic en el enlace mejor calificados
    When ingreso a la pagina mejor calificado
    And doy clic en producto
    Then ingreso a pagina de compras
    And doy click en boton carrito de compras
    And valido mensaje de confirmacion


