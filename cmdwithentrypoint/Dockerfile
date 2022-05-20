FROM ubuntu:20.04
ENV JAVA_HOME=/u01/mwuser/jdk-11
ENV PATH=${PATH}:${JAVA_HOME}/bin

RUN mkdir -p /u01/mwuser
RUN mkdir -p /u01/application

WORKDIR /u01/mwuser/
ADD https://download.java.net/openjdk/jdk11/ri/openjdk-11+28_linux-x64_bin.tar.gz .
RUN tar -xzvf openjdk-11+28_linux-x64_bin.tar.gz
RUN rm -rf openjdk-11+28_linux-x64_bin.tar.gz

WORKDIR /u01/application/

COPY target/cmdwithentrypoint-1.0.jar .
COPY run.sh .
RUN chmod u+x ./run.sh
ENTRYPOINT [ "./run.sh" ]

