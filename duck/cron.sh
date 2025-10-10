#!/bin/bash

# Definir la línea del cron
CRON_JOB="*/5 * * * * ./duck.sh >> ./duck.log 2>&1"

# Verifica si ya existe en crontab
(crontab -l 2>/dev/null | grep -F "$CRON_JOB") && echo "Ya existe en crontab" && exit 0

# Agrega la línea al crontab del usuario
(crontab -l 2>/dev/null; echo "$CRON_JOB") | crontab -

echo "Cron agregado correctamente"
