# dynamodb-sample

Sample Spring Boot Project with DynamoDB

In order to create your table locally with aws-cli, perform the following:

```
aws dynamodb create-table \
   --table-name ProductInfo \
   --attribute-definitions AttributeName=id,AttributeType=S \
   --key-schema AttributeName=id,KeyType=HASH \
   --provisioned-throughput ReadCapacityUnits=5,WriteCapacityUnits=5 \
   --endpoint-url http://localhost:8000
```

---
Code based off this tutorial: https://www.baeldung.com/spring-data-dynamodb
