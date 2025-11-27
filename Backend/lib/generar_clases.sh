# Encuentra y formatea las clases de tu paquete
find target/classes -name "*.class" | grep "org/pin/backend" | sed 's/target\/classes\///' | sed 's/\.class$//' | sed 's/\//./g' > classes.txt

# Verifica el contenido
cat classes.txt
