#!/bin/bash

git config --global user.name kihoonkwon
git config --global user.email jhgfjhgfjhgf96@gmail.com
echo "git pull run? [y/n]"

read answer

if [[ "$answer" == "y" ]]; then
    git pull
    read
else
    echo "git pull canceled"
    read
fi
