java -jar ../../target/cgi-shade.jar  \
     -content-type text/html \
     -method get \
     -query-string '?page=2&id=marco' \
     -server-name my-server \
     -server-port 8080 \
     -path /index.html \
     -body hello
