Feature: Compra de productos

  @succesful

  Scenario Outline:Proceso de compra
    Given "David" esta en la pagina demoblaze
     #Agregar dos productos al carrito
    When selecciono un producto de la pagina
    Then agrego el producto al carrito
    And veo el carrito
     #Formulario
  When ingreso los datos "<name>" "<country>" "<city>" "<credit_card>" "<month>" "<year>"
    Then pulso comprar

    Examples:
  | name  | country   | city  | credit_card | month   | year |
  | David | Ecuador   | Quito | 12345678    | January | 2024 |


