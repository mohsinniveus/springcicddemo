#!/bin/bash
set -B                  # enable brace expansion
for i in {1..25}; do
  curl -s -k 'GET' -H "canary: canary-tester" 'http://local.niveussolutions.com/api/test/version3'
done