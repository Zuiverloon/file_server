## PORT:8085
## IP:192.168.0.173

## how to run in the container
1. run in a container equipped with maven/jdk8/git
```shell
docker run -it -v /Users/zjy/Desktop/IVE:/file/IVE -p 8085:8085 b70d1adce28d /bin/bash
```
2. git pull
3. mvn spring-boot:run & (running in background)
