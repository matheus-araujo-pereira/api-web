# API WEB

## Dependências

- Java 17

## Executando

### Unix
```shell
./gradlew build
./gradlew bootRun
```

### Windows
```shell
.\gradlew.bat build
.\gradlew.bat bootRun
```

## Rotas

### Endereços

#### Rotas possíveis
```
POST -> http://localhost:8080/enderecos
GET -> http://localhost:8080/enderecos
PUT -> http://localhost:8080/enderecos/{id}
DELETE -> http://localhost:8080/enderecos/{id}
```

#### Request Body
```
{
    "rua": string,
    "numero": integer,
    "complemento": string,
    "bairro": string,
    "cidade": string,
    "estado": string,
    "cep": string
}
```

### Usuários

#### Rotas possíveis
```
POST -> http://localhost:8080/usuarios
GET -> http://localhost:8080/usuarios
PUT -> http://localhost:8080/usuarios/{id}
DELETE -> http://localhost:8080/usuarios/{id}
```

#### Request Body
```
{
   "tipo": string,
   "primeiroNome": string,
   "sobrenome": string,
   "enderecoId": integer,
   "telefone": string
}
```

### Funcionário

#### Rotas possíveis
```
POST -> http://localhost:8080/funcionarios
GET -> http://localhost:8080/funcionarios
PUT -> http://localhost:8080/funcionarios/{id}
DELETE -> http://localhost:8080/funcionarios/{id}
```

#### Request Body
```
{
    "usuarioId": integer,
    "cargo": string,
    "turno": string
}
```
