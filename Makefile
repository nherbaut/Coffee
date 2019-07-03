build:
	mvn clean package
docker:
	docker build . -t nherbaut/coffeeweb
run:
	docker run -d -p 8080:8080 nherbaut/coffeeweb

debug:
	docker run -ti  -p 8080:8080 nherbaut/coffeeweb bash

clean:
	docker rm -f $$(docker ps -qa)