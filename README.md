# Sistema Desafio de Consulta de Placas

O sistema consiste na criação de uma API com 4 webservices:
- Login (Utilizando a tecnologia JWT)
- Consulta de placa
- Listagem de consultas realizadas
- Cadastro de usuário

# Requests (cURL)
- Login
```
curl --location --request POST '<host>:<port>/user/login' \
--header 'Content-Type: application/json' \
--data-raw '{
    "email": "usuario@teste.com.br",
    "password": "1234"
}'
```

- Cadastro de usuário
```
curl --location --request POST '<host>:<port>/user/signup' \
--header 'Content-Type: application/json' \
--data-raw '{
    "email": "usuario@teste.com.br",
    "password": "1234"
}'
```

- Consulta de placa
```
curl --location --request GET '<host>:<port>/vehicle/plate/ISU5991' \
--header 'Authorization: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJsb2djeUB5YWhvby5jb20uYnIiLCJleHAiOjE2MTU1MjAwNDYsImlhdCI6MTYxNTUwMjA0Nn0.320HZp_uk0TLCfU41cHSIin_B_vAySQ5kII_x83TYRkX6s2tEFXrHJSa-PCfR8o6CDmewT4spV5VHu0_JgiX0g' \
--data-raw ''
```

- Listagem de consultas
```
curl --location --request GET '<host>:<port>/vehicle/listConsult' \
--header 'Authorization: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJsb2djeUB5YWhvby5jb20uYnIiLCJleHAiOjE2MTU1MjAwNDYsImlhdCI6MTYxNTUwMjA0Nn0.320HZp_uk0TLCfU41cHSIin_B_vAySQ5kII_x83TYRkX6s2tEFXrHJSa-PCfR8o6CDmewT4spV5VHu0_JgiX0g'
```


