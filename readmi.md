Prometheus: http://localhost:9090/

Grafana: http://localhost:3000/

Link DashBoard: http://localhost:3000/d/yc1lJvsWz/prometheus-stats?orgId=1

Usuario: admin 

Senha: 123456

Criado um projeto com springboot para ser monitorado.

Utilizei a biblioteca micrometer

web-app: http://localhost:8090

prometheus data source: http://localhost:8090/actuator/prometheus/


Para subir a aplicação só será necessario subir o docker composer

comando: docker-compose up

obs: A pasta grafana é aonde está a persistencia do grafana eu li e tive problemas com permissão da pasta.

Se der erro quando for subir o docker composer será necessario executar o comando: chmod 777 grafana.

Desenvolvi o projeto como sudo.
