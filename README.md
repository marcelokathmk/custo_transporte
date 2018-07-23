#Instruções para execução da aplicação e deploy/execução local

Execução:

Foi realizado o deploy e disponibilizada a aplicação na seguinte URL: http://custotransporte.us-east-1.elasticbeanstalk.com. 
Utilizei o recurso do elastic beanstalk da Amazon Web Services apenas com o intuito de publicar a aplicação e tornar o teste 
mais simples.

1: Abrir o navegador de internet, e digitar o seguinte endereço: http://custotransporte.us-east-1.elasticbeanstalk.com. E teclar "enter".

2: A aplicação será carregada para utilização dos seus recursos.

Deploy/Execução local:

Se for necessário realizar um teste local, também será possível realizar o deploy e execução na máquina do usuário. A aplicação roda
na porta 5000, por este motivo é importante verificar se esta porta está liberada. Para execução local é seguinte realizar os seguintes passos:

1: Acessar o repositório onde está versionado o projeto, através da URL: https://github.com/marcelokathmk/custo_transporte.

2: Clonar o repositório, com o intuito de baixar os arquivos do projeto localmente no diretório que desejar. Para clonar o repositório, execute o seguinte procedimento:

2.1: É necessário possuir o git instalado na máquina onde será realizado o clone.

2.2: Abra o prompt de comando, e selecione uma pasta que você deseja colocar os arquivos que vão vir do repositório remoto.

2.3: Execute o comando 'git clone https://github.com/marcelokathmk/custo_transporte.git', e aguardo até o final do processo.

3: Através do prompt de comando do sistema operacional, chegar até o diretório onde estiver o arquivo 'custo_transp-0.0.1.jar', no sistema operacional windows é através do comando 'cd' seguido do caminho até o arquivo .jar. O arquivo .jar('custo_transp-0.0.1.jar'), está disponibilizado no mesmo diretório que este arquivo (README.md).

4: Após estar no diretório, executar o comando 'java -jar custo_transp-0.0.1.jar', e teclar "enter".

5: Aguardar o processo de inicio da aplicação.

6: Abrir o navegador de internet, e digitar o seguinte endereço: http://localhost:5000. E teclar "enter".

7: A aplicação será carregada para utilização dos seus recursos.

8: Para encerrar a aplicação, no prompt de comando utilize o comando ctrl + c. Após isso, o prompt de comando pode ser fechado também.