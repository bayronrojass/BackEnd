mvn clean ktlint:format compile

bash ./lib/generar_clases.sh
bash ./lib/generar_classpath.sh

java -Xmx4G -classpath $(cat classpath.txt):target/classes:./lib/randoop-all-4.3.4.jar randoop.main.Main gentests --classlist=classes.txt --flaky-test-behavior=DISCARD --output-limit=500 --junit-output-dir="./src/test/java" --junit-package-name="org.pin.backend"  --check-compilable=false