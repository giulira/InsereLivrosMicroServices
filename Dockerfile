FROM java:openjdk-8-alpine


WORKDIR /app


COPY ./target/micro-servico-insereLivros.jar /app/micro-servico-insereLivros.jar

EXPOSE 8383

CMD java -jar /app/micro-servico-insereLivros.jar
