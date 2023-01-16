#!/bin/bash
set -B                  # enable brace expansion
for i in {1..25}; do
  curl -s -k 'GET' 'http://local.niveussolutions.com/api/test/version3'
  echo $'\n'
done