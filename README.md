# 💥 Projeto: Sistema de Pagamento de Profissionais de Saúde 💥

## Introdução
Este projeto implementa um sistema básico para calcular o pagamento de profissionais de saúde (Clínica, Médico e Anestesista) com base em um plano de saúde. Utilizando conceitos de **herança**, o projeto define as classes `Plano`, `Medico`, `Anestesista` e `Clinica`, onde cada classe herda ou sobrescreve comportamentos de cálculo de pagamento de acordo com as especificações fornecidas. 

O sistema aplica regras específicas para o cálculo de pagamento, levando em consideração o valor de ISS, acréscimos para médicos e anestesistas e as características da clínica.

## Estrutura do Projeto ✨
O projeto é composto pelas seguintes classes:

- **Plano**: Classe base que contém o cálculo básico do pagamento de uma consulta, aplicando um desconto de 5% referente ao ISS.
- **Medico**: Herda de `Plano` e aplica um acréscimo de 10% no valor pago pelo plano.
- **Anestesista**: Herda de `Medico`, aplicando os mesmos 10% de acréscimo, além de um valor fixo de R$1000,00 a mais por consulta.
- **Clinica**: Também herda de `Plano`, aplicando apenas o cálculo básico sem acréscimos.
- **TestePlano**: Classe principal que realiza o teste do sistema, criando objetos de cada profissional e exibindo os resultados do pagamento calculado.

## Índice
- [Funcionalidades](#funcionalidades)
- [Instalação](#instalação)
- [Como Usar](#como-usar)
- [Licença](#licença)

## Funcionalidades
- **Cálculo de pagamento para diferentes profissionais de saúde**:
  - Clínica: Recebe o valor padrão menos 5% de ISS.
  - Médico: Recebe o valor padrão com 10% de acréscimo menos 5% de ISS.
  - Anestesista: Recebe o valor padrão com 10% de acréscimo mais um adicional de R$1000,00, menos 5% de ISS.

- **Herança**: Utiliza herança para compartilhar o comportamento comum entre as classes e sobrescrever o cálculo de pagamento onde necessário.

## Instalação 💻 
1. Certifique-se de ter o **JDK (Java Development Kit)** instalado no seu sistema.
2. Faça o download e instale o **Eclipse IDE** ou qualquer outro ambiente de desenvolvimento Java de sua preferência.
3. Clone este repositório ou baixe os arquivos para o seu ambiente local.

```bash
git clone https://github.com/seu-usuario/sistema-pagamento-profissionais.git
```

4. Importe o projeto para o Eclipse:
 - Abra o Eclipse.
 - Selecione File > Import.
 - Escolha Existing Projects into Workspace.
 - Selecione a pasta do projeto e importe.

## Como Usar
- No Eclipse, abra a classe TestePlano.
- Execute a classe clicando com o botão direito no arquivo e selecionando Run As > Java Application.
- O programa irá instanciar objetos para a Clinica, Medico e Anestesista, calcular o pagamento de cada um e exibir os resultados.

## Licença ✔️
- Este projeto é de uso livre para fins acadêmicos e pessoais.
