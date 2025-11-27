mvn clean compile

bash generar_clases.sh
bash generar_classpath.sh

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
RANDOOP_JAR="${SCRIPT_DIR}/randoop-all-4.3.4.jar"

if [ ! -f "$RANDOOP_JAR" ]; then
    echo "Error: No se encuentra $RANDOOP_JAR"
    exit 1
fi

export RANDOOP_JAR

java -Xmx4G -classpath $(cat classpath.txt):target/classes:$RANDOOP_JAR randoop.main.Main gentests --classlist=classes.txt --flaky-test-behavior=DISCARD --output-limit=500 --junit-output-dir="./src/test/kotlin" --junit-package-name="org.pin.backend"  --check-compilable=false

mvn test verify