Questão 03 – Sistema de Controle de Usina Nuclear

cada estado reage de forma distinta a variações de temperatura, pressão e nível de radiação, e certas transições exigem validações específicas.
Além disso, há um modo de manutenção que pode sobrepor temporariamente o comportamento normal da usina.

Padrão aplicado – State

O padrão State eu escolhi porque permite modelar mudanças de comportamento de um objeto conforme seu estado interno muda.
Cada estado da usina é representado por uma classe que implementa a interface EstadoUsina.
Assim, as regras de transição e validações ficam encapsuladas, evitando grandes estruturas condicionais e facilitando a manutenção.

Além disso, o padrão preserva os princípios SRP (cada estado tem uma única responsabilidade) e OCP (novos estados podem ser adicionados sem modificar o código existente).
