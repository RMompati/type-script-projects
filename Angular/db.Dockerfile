FROM postgres:15-alpine
ENV POSTGRES_PASSWORD tasktraker
ENV POSTGRES_USER tasktraker
ENV POSTGRES_DB task 
COPY init-db.sh /docker-entrypoint-initdb.d/