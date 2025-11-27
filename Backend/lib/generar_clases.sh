find target/classes -name "*.class" | \
  grep "org/pin/backend" | \
  grep -v -E "org/pin/backend/(model|dto|security|config|repository)" | \
  grep -v -E "(Lienzo4bpp)" | \
  sed 's/target\/classes\///' | \
  sed 's/\.class$//' | \
  sed 's/\//./g' > classes.txt