#!/bin/bash

git config --global user.name kihoonkwon
git config --global user.email jhgfjhgfjhgf96@gmail.com
echo "git push run in 3sec"
sleep 3

date=$(date +%Y_%m_%d)

git add .
sleep 1
git add .
git status
sleep 1
git commit -m "$date"
git push origin main
git status
read