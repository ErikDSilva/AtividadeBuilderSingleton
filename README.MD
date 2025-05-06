1. Singleton – Gerenciador de Configurações:
Implemente uma classe ConfigManager que siga o padrão Singleton. Ela deve permitir armazenar e recuperar configurações como idioma, tema, e modoEscuro. Garanta que apenas uma instância da classe possa existir durante a execução do programa.

2. Factory Method – Criador de Usuários:
Implemente o padrão Factory Method com uma interface User e as classes concretas Admin, Editor e Viewer. Crie uma classe UserFactory com um método createUser(String tipo) que retorna a instância correta com base no tipo.

3. Abstract Factory – Sistema de Notificações Multicanal:
Implemente o padrão Abstract Factory para um sistema que envia notificações por Email e SMS. Crie uma interface Notification com o método enviar(String mensagem) e uma interface NotificationFactory com o método criarNotificacao().
Depois, implemente as versões concretas:
EmailNotification e EmailNotificationFactory
SMSNotification e SMSNotificationFactory
Utilize essas fábricas para criar e enviar notificações sem depender da implementação concreta.

4. Builder – Montagem de um Carro:
Implemente o padrão Builder para construir objetos da classe Carro com propriedades como motor, cor, portas, e tipoDeCombustivel. Crie um CarroBuilder com métodos encadeados e um Director que define como montar diferentes versões do carro (ex: esportivo e popular).

5. Builder + Singleton – Sistema de Perfis:
Crie um PerfilBuilder para construir perfis de usuários com dados como nome, email, e idade. Utilize o padrão Singleton para manter uma única instância de um PerfilManager, responsável por registrar e listar todos os perfis criados.