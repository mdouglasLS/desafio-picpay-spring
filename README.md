Execute o comando docker para criar um banco de dados postgresql, ou crie um `database` com as mesmas confgurações, 
caso já tenha o postgresql instalado local.

```bash
docker run --name desafio-picpay \
-e POSTGRES_PASSWORD=postgres \
-e POSTGRES_DB=desafio_picpay \
-p 5433:5432 \
-d postgres
```
