#!/bin/bash

git config --global user.name kihoonkwon
git config --global user.email jhgfjhgfjhgf96@gmail.com
echo "git push run? [y/n]"

read answer

if [[ "$answer" == "y" ]]; then
  git add .
  sleep 1
  git add .
  git status

  date=$(date +%Y_%m_%d)
  git commit -m "$date"
  git push origin main
  
  git log -n 10 --oneline

  echo ""
  echo "============="
  echo "git push complete"
  echo "============="
else
  echo ""
  echo "============="
  echo "git push canceled"
  echo "============="
fi

read