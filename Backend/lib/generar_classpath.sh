# Crear archivo con el classpath completo
mvn dependency:build-classpath -Dmdep.outputFile=classpath.txt

# Verificar classpath
echo "Classpath generado:"
head -n 2 classpath.txt
