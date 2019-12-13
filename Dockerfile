FROM java:8  
COPY . /var/www/java  
WORKDIR /var/www/java  
RUN javac app.java  
CMD ["java", "app", "test.yml"] 