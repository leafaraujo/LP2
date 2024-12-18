# Exercícios sobre POO

## Herança
Crie uma hierarquia de classes para representar veículos
- Crie uma classe abstrata *veiculo* com atributos como *marca*, *modelo* e um método *exibirInformacoes()*.
- Crie duas subclasses *Carro* e *Moto*, que herdam de *Veiculo*.
- Cada subclasse deve ter um método que implemente um comportamento específico, como *acelerar()*.
- No método *exibirInformacoes()*, mostre todas as informações do veículo, incluindo o tipo.

## Polimorfismo
Crie um sistema para gerenciar diferentes tipos de contas bancárias
- Crie uma classe abstrata *Conta* com um método abstrato *calcularJuros()*.
- Crie duas subclasses: *ContaCorrente* e *ContaPoupanca*, que implementar *calcularJuros()*.
- Crie uma lista de contas e adicione diferentes tipos de contas a ela.
- Percorra a lista e chame *calcularJuros()* para cada conta, demonstrando polimorfismo.

## Classes Abstratas
Crie um sistema para representar formas geométricas.
- Crie uma classe abstrata *Forma* e um método abstrato *calcularArea()*;
- Crie duas subclasses: *Circulo* e *Retangulo*, que implementam *calcularArea()*
- Em *Circulo*, a área deve ser cálculada com [pi * r^2] e, em *Retangulo*, [largura * altura]
- No método *main*, crie instâncias de cada forma e exiba suas áreas.

1) Crie uma agenda de contatos. Nessa agenda, contatos podem ser adicionados,
removidos, ou pesquisados por nome ou por CPF/CNPJ. Deve ser possível,
também, visualizar todos os contatos da agenda. Dois tipos de contatos podem
fazer parte da agenda: pessoa física e pessoa jurídica. A pessoa física tem os
seguintes atributos: CPF, nome, endereço, data de nascimento, e-mail, estado civil,
outros que você achar necessários. A pessoa jurídica possui: CNPJ, nome,
endereço, e-mail, inscrição estadual, razão social, outros que vc achar necessários

2) Na classe agenda acima, implemente um método ordena que coloca os
objetos em ordem crescente de CPF/CNPJ. Além disso, todas as pessoas
físicas devem aparecer antes das pessoas jurídicas. Note que o seu
programa deve fazer a ordenação, implementando algum dos algoritmos
conhecidos.

3) Implemente classes para representar as figuras geométricas: círculo,
retângulo e quadrado. Para todas elas devem ser implementados métodos
para retornar a área e o perímetro. O círculo possui um raio e as outras
classes os tamanhos dos lados. Além disso as figuras possuem uma cor,
definida por um atributo string e um atributo “filled” que diz se a figura é
preenchida pela cor ou se é vazia.
