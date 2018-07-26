# menoh-examples

## Setup
You need to run the following to install `menoh` package before executing examples.

```bash
$ git clone https://github.com/pfnet-research/menoh-java.git
$ cd menoh-java
$ mvn install
```

## Usage

### VGG16
```bash
$ cd menoh-examples
$ mvn compile
$ mkdir data
$ wget -qN -P data/ https://upload.wikimedia.org/wikipedia/commons/5/54/Light_sussex_hen.jpg

$ mvn exec:java -Dexec.mainClass=jp.preferred.menoh.examples.Vgg16 -Dexec.args="data/Light_sussex_hen.jpg"
```

## Licence
`mvn compile` downloads `data/VGG16.onnx`. It is generated by onnx-chainer from pre-trained model which is uploaded
at http://www.robots.ox.ac.uk/%7Evgg/software/very_deep/caffe/VGG_ILSVRC_16_layers.caffemodel and the model has been released under Creative Commons Attribution License.