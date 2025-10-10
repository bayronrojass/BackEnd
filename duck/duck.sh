# Ruta del archivo
TOKEN_FILE="../secrets/duck_token.txt"

# Leer el contenido del archivo
TOKEN=$(cat "$TOKEN_FILE")
echo "https://www.duckdns.org/update?domains=mirumi&token=$TOKEN&ip="
echo url="https://www.duckdns.org/update?domains=mirumi&token=$TOKEN&ip=" | curl -k -o ./duck.log -K -