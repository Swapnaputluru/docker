FROM ubuntu
WORKDIR /swapna
RUN echo "Hi Swapna" >/swapna/file1
ENV myname Swapna
COPY testfile1 /swapna
ADD test.tar.gz /swapna

