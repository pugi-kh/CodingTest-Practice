#!/bin/bash

git config --global user.name kihoonkwon
git config --global user.email jhgfjhgfjhgf96@gmail.com
echo "git push run in 3sec"
sleep 3

date=$(date +%Y_%m_%d)

git add .
git add .
git status
sleep 3
git commit -m "$date"
git push origin main
