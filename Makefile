.DEFAULT_GOAL := all


all:  build build-docker run-docker




build:
	mvn clean package
build-docker:
	docker build . -t nherbaut/coffeeweb

run-docker:
	docker run -d -p 8080:8080 nherbaut/coffeeweb

debug:
	docker run -ti  -p 8080:8080 nherbaut/coffeeweb bash

clean-docker:
	  docker rm -f $$(docker ps -qa)
