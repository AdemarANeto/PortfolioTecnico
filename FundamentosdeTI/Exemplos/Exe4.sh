# autor: Ademar Neto
# descrição: Neste exercício deveríamos criar um algoritmo que escrevesse a sequência de 1 a 10 em ordem decrescente.
#!/bin/bash
i=10
 while [ $i -gt 0 ]
 do
  echo "- $i"
  i=$((i-1))
 done
