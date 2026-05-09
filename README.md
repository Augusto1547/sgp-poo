Sistema de Gestão de Projetos (SGP)
Um sistema em Java focado na aplicação de conceitos de Programação Orientada a Objetos (POO). Este projeto tem como objetivo demonstrar a modelagem básica de um sistema de gestão, estruturando as relações entre Usuários, Projetos e Tarefas.

🚀 Funcionalidades
O sistema atualmente modela e estrutura as seguintes entidades e suas regras de negócios básicas:

Gestão de Usuários:
Cadastro de informações pessoais (Nome, CPF, E-mail, Dados de Nascimento).
Controle de acesso por Status ( ATIVO, INATIVO, BLOQUEADO).
Gestão de Projetos:
Definição de escopo (Nome, Descrição, Dados de Início e Conclusão).
Atribuição de um Usuário responsável pelo projeto.
Acompanhamento via Status do Projeto ( ATIVO, CONCLUIDO, CANCELADO).
Gestão de 0s:
Criação de tarefas definidas e vinculadas a um Projeto Específico e a um Usuário.
Classificação de importância através de Prioridade ( BAIXA, MEDIA, ALTA).
Controle o andamento via Status da Tarefa ( PENDENTE, FAZENDO, CONCLUIDA).
🛠️ Tecnologias Utilizadas
Linguagem: Java (JDK 8 ou superior)
Paradigma: Programação Orientada a Objetos (POO)
Ambiente de Desenvolvimento: Visual Studio Code (ou qualquer IDE de sua preferência como Eclipse, IntelliJ IDEA)
📁 Estrutura do Projeto
A arquitetura do projeto está organizada em pacotes para separar responsabilidades:

src/
├── App.java # Classe principal com o método main para testes de instâncias
├── entidades/
│ ├── Projeto.java # Modelo de domínio para Projetos
│ ├── Tarefa.java # Modelo de domínio para Tarefas
│ └── Usuario.java # Modelo de domínio para Usuários
└── enums/
├── PrioridadeTarefa.java # Enum para nível de prioridade das tarefas
├── StatusProjeto.java # Enum para ciclo de vida dos projetos
├── StatusTarefa.java # Enum para ciclo de vida das tarefas
└── StatusUsuario.java # Enum para situação cadastral dos usuários

⚙️ Como Executar
Clone este repositório em sua máquina local.
git clone [https://github.com/seu-usuario/sgp-poo.git](https://github.com/seu-usuario/sgp-poo.git)
Abra a pasta do projeto em seu IDE de preferência.
Compile os arquivos .java. Se você estiver usando o VS Code com o Extension Pack for Java , os arquivos na pasta srcserão compilados automaticamente para a pasta bin/.
Execute o arquivo App.java. Ele contém um script básico no método mainque instancia e relaciona as classes do sistema para fins de demonstração.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
