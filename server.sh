#!/bin/bash

show() {
  cat $1 | sed "s/error/ERROR/ig" |  sed "s/warn/WARN/ig"
}


errors() {
  cat $1 | grep -i "ERROR" |  sed "s/error/ERROR/ig"
  cat $1 | grep -c -i "ERROR"
}

warns() {
  cat $1 | grep -i "WARN" | sed "s/warn/WARN/ig"
  cat $1 | grep -c -i "WARN"
}

help() {
  echo "show pro vypsani celeho souboru"
  echo "errors pro vypsani vsech erroru"
  echo "warns pro vypsani vsech warns"
}

if [[ $1 == "show" ]]; then
  show $2
elif [[ $1 == "errors" ]]; then
  errors $2
elif [[ $1 == "warns" ]]; then
  warns $2
else
  help
fi

