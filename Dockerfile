from ubuntu
run apt update 
run apt install git build-essential cmake bison flex openjdk-8-jre-headless --yes
WORKDIR /
run git clone --branch release-6.2.0  https://github.com/Gecode/gecode.git
WORKDIR /gecode/
run mkdir build
WORKDIR /gecode/build
RUN cmake ..
RUN make install
WORKDIR /
run git clone --branch 2.3.0 https://github.com/MiniZinc/libminizinc.git
WORKDIR /libminizinc/
run mkdir build
WORKDIR /libminizinc/build
RUN cmake ..
RUN make install
RUN mkdir -p /usr/local/share/minizinc/solvers
RUN mkdir -p /usr/local/share/minizinc/gecode/
COPY solvers/gecode.msc /usr/local/share/minizinc/solvers/gecode.msc
COPY web/target/web-1.0-SNAPSHOT-jar-with-dependencies.jar /opt/CoffeeWeb.jar
CMD java -jar /opt/CoffeeWeb.jar
