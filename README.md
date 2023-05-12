# Avaliacao1-SistemasDistribuidos
Projeto: Calculadora Distribuída 
Aluno: Lucas Carvalho Silva(22302);
Diciplina: Sistemas distribuidos;

Avaliação1: O objetivo deste projeto é desenvolver um pequeno sistema distribuído de servidores utilizando sockets (Calculadora). O projeto será composto de algumas etapas, que serão avaliadas separadamente e também em conjunto. O sistema/programa a ser implementado pode ser desenvolvido em Java e deve executar no Linux/ Windows. Os fontes, executáveis e o texto devem ser disponibilizados no github. O sistema será composto de: um cliente que pode ser em linha de comando ou interface gráfica que encaminhará as operações via sockets para servidores especialistas - servidor especialista A que será encarregado de realizar as 4 operações básicas - servidor especialista B que realizará as operações de porcentagem, raiz quadrada e potenciação. Um arquivo de texto, tipo README deve descrever as decisões de projeto, entre ela as relacionadas a protocolo criado, endereçamento, registro, portas, obtenção destas informações, etc.

Protocolo: craido baseado em strings para comunicação entre o cliente e os servidores. As mensagens enviadas pelo cliente são codificadas como strings contendo a operação a ser realizada e os operandos, separados por vírgulas. Os servidores processam essas mensagens e enviam de volta o resultado como uma string.

Endereçamento: Os endereços IP e portas dos servidores foram codificados diretamente no código, o que significa que o cliente deve saber antecipadamente quais endereços e portas usar para se comunicar com cada servidor.

Registro: Não há implementação de um serviço de registro

Portas: Cada servidor é executado em uma porta diferente para evitar conflitos de porta. Servidor_A port: 5000 / Servidor_B port: 5001

Dificuldades: Primeira vez utilizando Github, tive dificuldade para enviar os arquivos para plataforma, foi meu primeiro contato com implementação de sockets em um programa, tive bastante dificuldade no começo, mas no final deu para entender o funcionamento e com os matérias fornecidos pelo professor conseguir fazer o programa solicitado.

Referencias: Livro Sistemas distribuidos conceitos e projeto 5ªed;
             https://www.devmedia.com.br/java-socket-entendendo-a-classe-socket-e-a-serversocket-em-detalhes/31894
             Sockets em Java Leonardo R. Nunes
