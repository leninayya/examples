mvn clean install

docker-compose up --build

post http://localhost:8080/examples
get http://localhost:8080/examples

docker-compose down -v -rmi all