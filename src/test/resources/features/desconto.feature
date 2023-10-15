# language: pt

  Funcionalidade: Receber desconto da qazando
    Eu como usuario da qazando
    Quero receber um cupom de desconto
    para comprar um curos com valor reduzido

    Cenário: Visualizar código de desconto
      Dado que estou no site da qazando
      Quando preencho meu e-mail
      E clico em ganhar cupom
      Então eu vejo o código de desconto

#    Cenário: Visualizar código de desconto para usar cupom
#      Dado que estou no site da qazando
#      Quando preencho meu e-mail
#      E clico em ganhar cupom
#      Então eu vejo o código de desconto
#      E uso ele no checkout